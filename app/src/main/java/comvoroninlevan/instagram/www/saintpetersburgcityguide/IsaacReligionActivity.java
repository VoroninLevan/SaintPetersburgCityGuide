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

public class IsaacReligionActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String isaacHeader = new String(getString(R.string.annotation_isaacs));
        String isaacMain = new String(getString(R.string.religion_isaac));

        ImageView mainPhoto = (ImageView) findViewById(R.id.mainPhoto);
        mainPhoto.setImageResource(R.drawable.religion_isaacs_main);

        TextView header = (TextView)findViewById(R.id.header);
        header.setText(isaacHeader);

        TextView mainText = (TextView)findViewById(R.id.mainText);
        mainText.setText(isaacMain);
    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String isaacHeader = new String(getString(R.string.annotation_isaacs));
        // Add a marker in religion_isaac and move the camera
        LatLng religion_isaac = new LatLng(59.933948, 30.306238);
        mMap.addMarker(new MarkerOptions().position(religion_isaac).title(isaacHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(religion_isaac));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
