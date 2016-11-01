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

public class MoikaPalaceActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String moikaHeader = new String(getString(R.string.annotation_moika));
        String moikaMain = new String(getString(R.string.palace_moika));

        ImageView mainPhoto = (ImageView) findViewById(R.id.mainPhoto);
        mainPhoto.setImageResource(R.drawable.palace_moika_main);

        TextView header = (TextView)findViewById(R.id.header);
        header.setText(moikaHeader);

        TextView mainText = (TextView)findViewById(R.id.mainText);
        mainText.setText(moikaMain);

    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String moikaHeader = new String(getString(R.string.annotation_moika));
        // Add a marker in palaces_moika and move the camera
        LatLng palaces_moika = new LatLng(59.929332, 30.298546);
        mMap.addMarker(new MarkerOptions().position(palaces_moika).title(moikaHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(palaces_moika));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
