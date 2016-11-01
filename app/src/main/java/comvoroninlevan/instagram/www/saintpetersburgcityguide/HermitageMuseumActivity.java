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

public class HermitageMuseumActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String hermitageHeader = new String(getString(R.string.annotation_hermitage));
        String hermitageMain = new String(getString(R.string.museum_hermitage));

        ImageView mainPhoto = (ImageView) findViewById(R.id.mainPhoto);
        mainPhoto.setImageResource(R.drawable.museum_hermitage_main);

        TextView header = (TextView)findViewById(R.id.header);
        header.setText(hermitageHeader);

        TextView mainText = (TextView)findViewById(R.id.mainText);
        mainText.setText(hermitageMain);

    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String hermitageHeader = new String(getString(R.string.annotation_hermitage));
        // Add a marker in museum_hermitage and move the camera
        LatLng museum_hermitage = new LatLng(59.939767, 30.314485);
        mMap.addMarker(new MarkerOptions().position(museum_hermitage).title(hermitageHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(museum_hermitage));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
