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

public class AuroraMuseumActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String auroraHeader = new String(getString(R.string.annotation_aurora));
        String auroraMain = new String(getString(R.string.museum_aurora));

        ImageView mainPhoto = (ImageView) findViewById(R.id.mainPhoto);
        mainPhoto.setImageResource(R.drawable.museum_aurora_main);

        TextView header = (TextView)findViewById(R.id.header);
        header.setText(auroraHeader);

        TextView mainText = (TextView)findViewById(R.id.mainText);
        mainText.setText(auroraMain);

    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String auroraHeader = new String(getString(R.string.annotation_aurora));
        // Add a marker in museum_aurora and move the camera
        LatLng museum_aurora = new LatLng(59.955587, 30.337597);
        mMap.addMarker(new MarkerOptions().position(museum_aurora).title(auroraHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(museum_aurora));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
