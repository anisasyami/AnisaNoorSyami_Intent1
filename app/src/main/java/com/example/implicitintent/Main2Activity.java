package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    public void tentang(View view) {
        Intent tentang = new Intent(Main2Activity.this, Main2Activity.class);
        startActivity(tentang);
        }
}