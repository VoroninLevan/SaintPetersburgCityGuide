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

public class KronstadtReligionActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String kronstadtHeader = new String(getString(R.string.annotation_kronstadt));
        String kronstadtMain = new String(getString(R.string.religion_kronstadt));

        ImageView mainPhoto = (ImageView) findViewById(R.id.mainPhoto);
        mainPhoto.setImageResource(R.drawable.religion_kronstadt_main);

        TextView header = (TextView)findViewById(R.id.header);
        header.setText(kronstadtHeader);

        TextView mainText = (TextView)findViewById(R.id.mainText);
        mainText.setText(kronstadtMain);
    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String kronstadtHeader = new String(getString(R.string.annotation_kronstadt));
        // Add a marker in religion_kronstadt and move the camera
        LatLng religion_kronstadt = new LatLng(59.991629, 29.777952);
        mMap.addMarker(new MarkerOptions().position(religion_kronstadt).title(kronstadtHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(religion_kronstadt));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
