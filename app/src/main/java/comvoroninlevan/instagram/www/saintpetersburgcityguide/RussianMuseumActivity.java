package comvoroninlevan.instagram.www.saintpetersburgcityguide;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

public class RussianMuseumActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String russianHeader = new String(getString(R.string.annotation_russian));
        String russianMain = new String(getString(R.string.museum_russian));

        ImageView mainPhoto = (ImageView) findViewById(R.id.mainPhoto);
        mainPhoto.setImageResource(R.drawable.museum_russian_main);

        TextView header = (TextView)findViewById(R.id.header);
        header.setText(russianHeader);

        TextView mainText = (TextView)findViewById(R.id.mainText);
        mainText.setText(russianMain);

    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String russianHeader = new String(getString(R.string.annotation_russian));
        // Add a marker in museum_russian and move the camera
        LatLng museum_russian = new LatLng(59.938882, 30.331685);
        mMap.addMarker(new MarkerOptions().position(museum_russian).title(russianHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(museum_russian));
    }


    @Override
    protected void onStop() {
        super.onStop();
    }
}
