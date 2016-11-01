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

public class MikhailovskyTheatreActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String mikhailovskyHeader = new String(getString(R.string.annotation_mikhaylovsky));
        String mikhailovskyMain = new String(getString(R.string.theatre_mikhailovsky));

        ImageView mainPhoto = (ImageView) findViewById(R.id.mainPhoto);
        mainPhoto.setImageResource(R.drawable.theatre_mikhaylovsky_main);

        TextView header = (TextView)findViewById(R.id.header);
        header.setText(mikhailovskyHeader);

        TextView mainText = (TextView)findViewById(R.id.mainText);
        mainText.setText(mikhailovskyMain);
    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String mikhailovskyHeader = new String(getString(R.string.annotation_mikhaylovsky));
        // Add a marker in theatres_mikhailovsky and move the camera
        LatLng theatres_mikhailovsky = new LatLng(59.937884, 30.329009);
        mMap.addMarker(new MarkerOptions().position(theatres_mikhailovsky).title(mikhailovskyHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(theatres_mikhailovsky));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
