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

public class MenshikovPalaceActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String menshikovHeader = new String(getString(R.string.annotation_menshikov));
        String menshikovMain = new String(getString(R.string.palace_menshikov));

        ImageView mainPhoto = (ImageView) findViewById(R.id.mainPhoto);
        mainPhoto.setImageResource(R.drawable.palace_menshikov_main);

        TextView header = (TextView)findViewById(R.id.header);
        header.setText(menshikovHeader);

        TextView mainText = (TextView)findViewById(R.id.mainText);
        mainText.setText(menshikovMain);

    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String menshikovHeader = new String(getString(R.string.annotation_menshikov));
        // Add a marker in palaces_menshikov and move the camera
        LatLng palaces_menshikov = new LatLng(59.939461, 30.295384);
        mMap.addMarker(new MarkerOptions().position(palaces_menshikov).title(menshikovHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(palaces_menshikov));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
