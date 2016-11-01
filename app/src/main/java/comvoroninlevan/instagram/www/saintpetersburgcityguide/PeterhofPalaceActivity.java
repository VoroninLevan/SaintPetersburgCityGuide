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

public class PeterhofPalaceActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String peterhofHeader = new String(getString(R.string.annotation_peterhof));
        String peterhofMain = new String(getString(R.string.palace_peterhof));

        ImageView mainPhoto = (ImageView) findViewById(R.id.mainPhoto);
        mainPhoto.setImageResource(R.drawable.palace_peterhof_main);

        TextView header = (TextView)findViewById(R.id.header);
        header.setText(peterhofHeader);

        TextView mainText = (TextView)findViewById(R.id.mainText);
        mainText.setText(peterhofMain);

    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String peterhofHeader = new String(getString(R.string.annotation_peterhof));
        // Add a marker in palaces_peterhof and move the camera
        LatLng palaces_peterhof = new LatLng(59.884560, 29.908748);
        mMap.addMarker(new MarkerOptions().position(palaces_peterhof).title(peterhofHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(palaces_peterhof));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
