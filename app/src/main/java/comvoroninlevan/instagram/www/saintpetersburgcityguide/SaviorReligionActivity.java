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

public class SaviorReligionActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String saviorHeader = new String(getString(R.string.annotation_savior));
        String saviorMain = new String(getString(R.string.religion_savior));

        ImageView mainPhoto = (ImageView) findViewById(R.id.mainPhoto);
        mainPhoto.setImageResource(R.drawable.religion_savior_main);

        TextView header = (TextView)findViewById(R.id.header);
        header.setText(saviorHeader);

        TextView mainText = (TextView)findViewById(R.id.mainText);
        mainText.setText(saviorMain);
    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String saviorHeader = new String(getString(R.string.annotation_savior));
        // Add a marker in religion_savior and move the camera
        LatLng religion_savior = new LatLng(59.940035, 30.328782);
        mMap.addMarker(new MarkerOptions().position(religion_savior).title(saviorHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(religion_savior));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
