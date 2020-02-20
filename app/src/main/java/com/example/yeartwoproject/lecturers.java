package com.example.yeartwoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class lecturers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturers);

        TextView textView=findViewById(R.id.textView2);
        AssetManager assetManager = getAssets();
        InputStream files;

        {
            try{
                files= assetManager.open("codezone.c");

            } catch (IOException e){
                e.printStackTrace();
            }
            
        }
    }
}
