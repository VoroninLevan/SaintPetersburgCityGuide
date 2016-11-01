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

public class ZoologicalMuseumActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String zoologicalHeader = new String(getString(R.string.annotation_zoological));
        String zoologicalMain = new String(getString(R.string.museum_zoological));

        ImageView mainPhoto = (ImageView) findViewById(R.id.mainPhoto);
        mainPhoto.setImageResource(R.drawable.museum_zoological_main);

        TextView header = (TextView)findViewById(R.id.header);
        header.setText(zoologicalHeader);

        TextView mainText = (TextView)findViewById(R.id.mainText);
        mainText.setText(zoologicalMain);

    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String zoologicalHeader = new String(getString(R.string.annotation_zoological));
        // Add a marker in museum_zoological and move the camera
        LatLng museum_zoological = new LatLng(59.942459, 30.305584);
        mMap.addMarker(new MarkerOptions().position(museum_zoological).title(zoologicalHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(museum_zoological));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
