package comvoroninlevan.instagram.www.saintpetersburgcityguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class KunstkameraMuseumActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String kunstkameraHeader = new String(getString(R.string.annotation_kunstkamera));
        String kunstkameraMain = new String(getString(R.string.museum_kunstkamera));

        ImageView mainPhoto = (ImageView) findViewById(R.id.mainPhoto);
        mainPhoto.setImageResource(R.drawable.museum_kuntskamera_main);

        TextView header = (TextView)findViewById(R.id.header);
        header.setText(kunstkameraHeader);

        TextView mainText = (TextView)findViewById(R.id.mainText);
        mainText.setText(kunstkameraMain);

    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String kunstkameraHeader = new String(getString(R.string.annotation_kunstkamera));
        // Add a marker in museum_kunstkamera and move the camera
        LatLng museum_kunstkamera = new LatLng(59.941411, 30.304468);
        mMap.addMarker(new MarkerOptions().position(museum_kunstkamera).title(kunstkameraHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(museum_kunstkamera));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
