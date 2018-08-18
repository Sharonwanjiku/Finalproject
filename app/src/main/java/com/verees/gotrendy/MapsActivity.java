package com.verees.gotrendy;

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
        setContentView(R.layout.activity_maps2);
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

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(1.2609134, 36.7893419);
        LatLng ashley = new LatLng(1.2609134, 36.7893419);
        LatLng african = new LatLng(1.2826794, 36.819587);
        LatLng amadiva = new LatLng(1.2704217, 36.8009564);
        LatLng urban = new LatLng(1.259059, 36.8670514);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.addMarker(new MarkerOptions().position(ashley).title("Marker in Ashley"));
        mMap.addMarker(new MarkerOptions().position(african).title("Marker in African"));
        mMap.addMarker(new MarkerOptions().position(amadiva).title("Marker in Amadiva"));
        mMap.addMarker(new MarkerOptions().position(urban).title("Marker in Urban Hair Salon"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ashley));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(african));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(amadiva));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(urban));
    }
}
