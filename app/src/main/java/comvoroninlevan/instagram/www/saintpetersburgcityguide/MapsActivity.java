package comvoroninlevan.instagram.www.saintpetersburgcityguide;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        String alexanderHeader = new String(getString(R.string.annotation_aleksander));
        String aleksandrinskyHeader = new String(getString(R.string.annotation_aleksandrinsky));
        String auroraHeader = new String(getString(R.string.annotation_aurora));
        String dostoevskyHeader = new String(getString(R.string.annotation_dostoyevsky));
        String hermitageHeader = new String(getString(R.string.annotation_hermitage));
        String hermitageTheatreHeader = new String(getString(R.string.annotation_theatre_hermitage));
        String isaacHeader = new String(getString(R.string.annotation_isaacs));
        String kazanHeader = new String(getString(R.string.annotation_kazan));
        String kronstadtHeader = new String(getString(R.string.annotation_kronstadt));
        String kunstkameraHeader = new String(getString(R.string.annotation_kunstkamera));
        String mariinskyHeader = new String(getString(R.string.annotation_mariinsky));
        String menshikovHeader = new String(getString(R.string.annotation_menshikov));
        String mikhailovskyHeader = new String(getString(R.string.annotation_mikhaylovsky));
        String moikaHeader = new String(getString(R.string.annotation_moika));
        String pavlovskHeader = new String(getString(R.string.annotation_pavlovsk));
        String peterhofHeader = new String(getString(R.string.annotation_peterhof));
        String russianHeader = new String(getString(R.string.annotation_russian));
        String saviorHeader = new String(getString(R.string.annotation_savior));
        String smolnyHeader = new String(getString(R.string.annotation_smolny));
        String stroganovHeader = new String(getString(R.string.annotation_stroganov));
        String winterHeader = new String(getString(R.string.annotation_winter));
        String zoologicalHeader = new String(getString(R.string.annotation_zoological));
        // Add a marker in Sydney and move the camera
        LatLng museum_russian = new LatLng(59.938882, 30.331685);
        LatLng museum_aurora = new LatLng(59.955587, 30.337597);
        LatLng museum_dostoevsky = new LatLng(59.927310, 30.350790);
        LatLng museum_hermitage = new LatLng(59.939767, 30.314485);
        LatLng museum_kunstkamera = new LatLng(59.941411, 30.304468);
        LatLng museum_zoological = new LatLng(59.942459, 30.305584);
        LatLng palaces_moika = new LatLng(59.929332, 30.298546);
        LatLng palaces_winter = new LatLng(59.940358, 30.313625);
        LatLng palaces_pavlovsk = new LatLng(59.685595, 30.452669);
        LatLng palaces_menshikov = new LatLng(59.939461, 30.295384);
        LatLng palaces_peterhof = new LatLng(59.884560, 29.908748);
        LatLng palaces_stroganov = new LatLng(59.935839, 30.320279);
        LatLng religion_alexander = new LatLng(59.921070, 30.388097);
        LatLng religion_isaac = new LatLng(59.933948, 30.306238);
        LatLng religion_kazan = new LatLng(59.934220, 30.324432);
        LatLng religion_kronstadt = new LatLng(59.991629, 29.777952);
        LatLng religion_savior = new LatLng(59.940035, 30.328782);
        LatLng religion_smolny = new LatLng(59.948843, 30.395458);
        LatLng theatres_alexandrinsky = new LatLng(59.931726, 30.336093);
        LatLng theatres_hermitage = new LatLng(59.942195, 30.317995);
        LatLng theatres_mariinsky = new LatLng(59.925570, 30.295997);
        LatLng theatres_mikhailovsky = new LatLng(59.937884, 30.329009);

        mMap.addMarker(new MarkerOptions().position(museum_russian).title(russianHeader));
        mMap.addMarker(new MarkerOptions().position(museum_aurora).title(auroraHeader));
        mMap.addMarker(new MarkerOptions().position(museum_dostoevsky).title(dostoevskyHeader));
        mMap.addMarker(new MarkerOptions().position(museum_hermitage).title(hermitageHeader));
        mMap.addMarker(new MarkerOptions().position(museum_kunstkamera).title(kunstkameraHeader));
        mMap.addMarker(new MarkerOptions().position(museum_zoological).title(zoologicalHeader));
        mMap.addMarker(new MarkerOptions().position(palaces_moika).title(moikaHeader));
        mMap.addMarker(new MarkerOptions().position(palaces_winter).title(winterHeader));
        mMap.addMarker(new MarkerOptions().position(palaces_pavlovsk).title(pavlovskHeader));
        mMap.addMarker(new MarkerOptions().position(palaces_menshikov).title(menshikovHeader));
        mMap.addMarker(new MarkerOptions().position(palaces_peterhof).title(peterhofHeader));
        mMap.addMarker(new MarkerOptions().position(palaces_stroganov).title(stroganovHeader));
        mMap.addMarker(new MarkerOptions().position(religion_alexander).title(alexanderHeader));
        mMap.addMarker(new MarkerOptions().position(religion_isaac).title(isaacHeader));
        mMap.addMarker(new MarkerOptions().position(religion_kazan).title(kazanHeader));
        mMap.addMarker(new MarkerOptions().position(religion_kronstadt).title(kronstadtHeader));
        mMap.addMarker(new MarkerOptions().position(religion_savior).title(saviorHeader));
        mMap.addMarker(new MarkerOptions().position(religion_smolny).title(smolnyHeader));
        mMap.addMarker(new MarkerOptions().position(theatres_alexandrinsky).title(aleksandrinskyHeader));
        mMap.addMarker(new MarkerOptions().position(theatres_hermitage).title(hermitageTheatreHeader));
        mMap.addMarker(new MarkerOptions().position(theatres_mariinsky).title(mariinskyHeader));
        mMap.addMarker(new MarkerOptions().position(theatres_mikhailovsky).title(mikhailovskyHeader));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(theatres_mikhailovsky));
    }

}
