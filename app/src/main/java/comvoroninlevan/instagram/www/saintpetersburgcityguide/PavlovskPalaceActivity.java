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

public class PavlovskPalaceActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String pavlovskHeader = new String(getString(R.string.annotation_pavlovsk));
        String pavlovskMain = new String(getString(R.string.palace_pavlovsk));

        ImageView mainPhoto = (ImageView) findViewById(R.id.mainPhoto);
        mainPhoto.setImageResource(R.drawable.palace_pavlovsk_main);

        TextView header = (TextView)findViewById(R.id.header);
        header.setText(pavlovskHeader);

        TextView mainText = (TextView)findViewById(R.id.mainText);
        mainText.setText(pavlovskMain);

    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String pavlovskHeader = new String(getString(R.string.annotation_pavlovsk));
        // Add a marker in palaces_pavlovsk and move the camera
        LatLng palaces_pavlovsk = new LatLng(59.685595, 30.452669);
        mMap.addMarker(new MarkerOptions().position(palaces_pavlovsk).title(pavlovskHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(palaces_pavlovsk));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
