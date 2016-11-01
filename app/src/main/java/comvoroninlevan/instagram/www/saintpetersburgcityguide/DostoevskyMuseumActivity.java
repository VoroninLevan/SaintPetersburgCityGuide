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

public class DostoevskyMuseumActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String dostoevskyHeader = new String(getString(R.string.annotation_dostoyevsky));
        String dostoevskyMain = new String(getString(R.string.museum_dostoevsky));

        ImageView mainPhoto = (ImageView) findViewById(R.id.mainPhoto);
        mainPhoto.setImageResource(R.drawable.museum_dostoevsky_main);

        TextView header = (TextView)findViewById(R.id.header);
        header.setText(dostoevskyHeader);

        TextView mainText = (TextView)findViewById(R.id.mainText);
        mainText.setText(dostoevskyMain);

    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String dostoevskyHeader = new String(getString(R.string.annotation_dostoyevsky));
        // Add a marker in museum_dostoevsky and move the camera
        LatLng museum_dostoevsky = new LatLng(59.927310, 30.350790);
        mMap.addMarker(new MarkerOptions().position(museum_dostoevsky).title(dostoevskyHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(museum_dostoevsky));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
