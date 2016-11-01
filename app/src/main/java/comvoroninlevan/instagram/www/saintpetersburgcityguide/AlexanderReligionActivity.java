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

public class AlexanderReligionActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String alexanderHeader = new String(getString(R.string.annotation_aleksander));
        String alexanderMain = new String(getString(R.string.religion_alexander));

        ImageView mainPhoto = (ImageView) findViewById(R.id.mainPhoto);
        mainPhoto.setImageResource(R.drawable.religion_aleksander_main);

        TextView header = (TextView)findViewById(R.id.header);
        header.setText(alexanderHeader);

        TextView mainText = (TextView)findViewById(R.id.mainText);
        mainText.setText(alexanderMain);
    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String alexanderHeader = new String(getString(R.string.annotation_aleksander));
        // Add a marker in religion_alexander and move the camera
        LatLng religion_alexander = new LatLng(59.921070, 30.388097);
        mMap.addMarker(new MarkerOptions().position(religion_alexander).title(alexanderHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(religion_alexander));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
