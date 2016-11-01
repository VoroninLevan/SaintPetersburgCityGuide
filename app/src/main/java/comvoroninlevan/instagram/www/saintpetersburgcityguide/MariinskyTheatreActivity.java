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

public class MariinskyTheatreActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String mariinskyHeader = new String(getString(R.string.annotation_mariinsky));
        String mariinskyMain = new String(getString(R.string.theatre_mariinsky));

        ImageView mainPhoto = (ImageView) findViewById(R.id.mainPhoto);
        mainPhoto.setImageResource(R.drawable.theatre_mariinsky_main);

        TextView header = (TextView)findViewById(R.id.header);
        header.setText(mariinskyHeader);

        TextView mainText = (TextView)findViewById(R.id.mainText);
        mainText.setText(mariinskyMain);
    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String mariinskyHeader = new String(getString(R.string.annotation_mariinsky));
        // Add a marker in theatres_mariinsky and move the camera
        LatLng theatres_mariinsky = new LatLng(59.925570, 30.295997);
        mMap.addMarker(new MarkerOptions().position(theatres_mariinsky).title(mariinskyHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(theatres_mariinsky));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
