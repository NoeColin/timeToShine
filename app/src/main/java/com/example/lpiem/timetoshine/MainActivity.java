package com.example.lpiem.timetoshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortByDate(){
        Toast.makeText(this, "Trier par date", Toast.LENGTH_SHORT).show();
    }

    public void sortByName(){
        Toast.makeText(this, "Trier par nom", Toast.LENGTH_SHORT).show();
    }
}
