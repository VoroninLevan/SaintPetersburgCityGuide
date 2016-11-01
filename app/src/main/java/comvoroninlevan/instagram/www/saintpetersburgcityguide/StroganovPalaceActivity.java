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

public class StroganovPalaceActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String stroganovHeader = new String(getString(R.string.annotation_stroganov));
        String stroganovMain = new String(getString(R.string.palace_stroganov));

        ImageView mainPhoto = (ImageView) findViewById(R.id.mainPhoto);
        mainPhoto.setImageResource(R.drawable.palace_stroganov_main);

        TextView header = (TextView)findViewById(R.id.header);
        header.setText(stroganovHeader);

        TextView mainText = (TextView)findViewById(R.id.mainText);
        mainText.setText(stroganovMain);

    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String stroganovHeader = new String(getString(R.string.annotation_stroganov));
        // Add a marker in palaces_stroganov and move the camera
        LatLng palaces_stroganov = new LatLng(59.935839, 30.320279);
        mMap.addMarker(new MarkerOptions().position(palaces_stroganov).title(stroganovHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(palaces_stroganov));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
