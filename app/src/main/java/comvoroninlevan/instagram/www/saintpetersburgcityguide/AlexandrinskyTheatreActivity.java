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

public class AlexandrinskyTheatreActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String aleksandrinskyHeader = new String(getString(R.string.annotation_aleksandrinsky));
        String aleksandrinskyMain = new String(getString(R.string.theatre_alexandrinsky));

        ImageView mainPhoto = (ImageView) findViewById(R.id.mainPhoto);
        mainPhoto.setImageResource(R.drawable.theatre_aleksandrinsky_main);

        TextView header = (TextView)findViewById(R.id.header);
        header.setText(aleksandrinskyHeader);

        TextView mainText = (TextView)findViewById(R.id.mainText);
        mainText.setText(aleksandrinskyMain);
    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String aleksandrinskyHeader = new String(getString(R.string.annotation_aleksandrinsky));
        // Add a marker in theatres_alexandrinsky and move the camera
        LatLng theatres_alexandrinsky = new LatLng(59.931726, 30.336093);
        mMap.addMarker(new MarkerOptions().position(theatres_alexandrinsky).title(aleksandrinskyHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(theatres_alexandrinsky));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
