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

public class SmolnyReligionActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String smolnyHeader = new String(getString(R.string.annotation_smolny));
        String smolnyMain = new String(getString(R.string.religion_smolny));

        ImageView mainPhoto = (ImageView) findViewById(R.id.mainPhoto);
        mainPhoto.setImageResource(R.drawable.religion_smolny_main);

        TextView header = (TextView)findViewById(R.id.header);
        header.setText(smolnyHeader);

        TextView mainText = (TextView)findViewById(R.id.mainText);
        mainText.setText(smolnyMain);
    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String smolnyHeader = new String(getString(R.string.annotation_smolny));
        // Add a marker in religion_smolny and move the camera
        LatLng religion_smolny = new LatLng(59.948843, 30.395458);
        mMap.addMarker(new MarkerOptions().position(religion_smolny).title(smolnyHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(religion_smolny));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
