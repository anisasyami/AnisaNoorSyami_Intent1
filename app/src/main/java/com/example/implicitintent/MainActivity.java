package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

     public void panggil(View view) {
         String nomor = "9876989" ;
         Intent panggil = new Intent(Intent.ACTION_DIAL);
         panggil.setData(Uri. fromParts("tel", nomor, null));
         startActivity(panggil);
     }

     public void buka (View view) {
         String url ="https://smkn4bdg.sch.id";
         Intent bukabrowser = new Intent(Intent.ACTION_VIEW);
         bukabrowser.setData(Uri.parse(url));
         startActivity(bukabrowser);
     }
}

