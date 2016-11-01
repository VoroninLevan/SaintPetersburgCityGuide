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

public class KazanReligionActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String kazanHeader = new String(getString(R.string.annotation_kazan));
        String kazanMain = new String(getString(R.string.religion_kazan));

        ImageView mainPhoto = (ImageView) findViewById(R.id.mainPhoto);
        mainPhoto.setImageResource(R.drawable.religion_kazan_main);

        TextView header = (TextView)findViewById(R.id.header);
        header.setText(kazanHeader);

        TextView mainText = (TextView)findViewById(R.id.mainText);
        mainText.setText(kazanMain);
    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String kazanHeader = new String(getString(R.string.annotation_kazan));
        // Add a marker in religion_kazan and move the camera
        LatLng religion_kazan = new LatLng(59.934220, 30.324432);
        mMap.addMarker(new MarkerOptions().position(religion_kazan).title(kazanHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(religion_kazan));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
