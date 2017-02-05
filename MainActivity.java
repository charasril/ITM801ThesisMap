package com.example.win.itm801thesismap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

///Connect Google
//import com.akexorcist.googledirection.DirectionCallback;
//import com.akexorcist.googledirection.GoogleDirection;
//import com.akexorcist.googledirection.constant.TransportMode;
//import com.akexorcist.googledirection.model.Direction;
//import com.akexorcist.googledirection.model.Route;
//import com.akexorcist.googledirection.util.DirectionConverter;
//import com.google.android.gms.maps.CameraUpdateFactory;
//import com.google.android.gms.maps.GoogleMap;
//import com.google.android.gms.maps.OnMapReadyCallback;
//import com.google.android.gms.maps.SupportMapFragment;
//import com.google.android.gms.maps.model.BitmapDescriptorFactory;
//import com.google.android.gms.maps.model.LatLng;
//import com.google.android.gms.maps.model.MarkerOptions;
//import com.google.android.gms.maps.model.Polyline;

///Google
public class MainActivity extends AppCompatActivity {
//    private GoogleMap googleMap;
//    private String serverKey = "AIzaSyDkxXWseLD9nGDV81y6DgBA1PLbwp5tzwU";
//    private LatLng camera ;// = new LatLng(35.1773909, 136.9471357);
//    private LatLng origin ;//= new LatLng(35.1766982, 136.9413508);
//    private LatLng destination;//= new LatLng(35.1800441, 136.9532567);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startProgramButton = (Button) findViewById(R.id.start_program);
        Button closeProgramButton = (Button) findViewById(R.id.close_program);

        //click start login
        startProgramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),user_login_layout.class);
                startActivity(i);
            }
        });  //startProgramButton

        //click close
        closeProgramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
