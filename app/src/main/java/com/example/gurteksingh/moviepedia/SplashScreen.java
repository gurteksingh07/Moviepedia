package com.example.gurteksingh.moviepedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread t1 = new Thread(){
        public void run()
        {
            try{
                Thread.sleep(3000);
                Intent i= new Intent(SplashScreen.this,MainActivity.class);
                startActivity(i);
                finish();
            }
            catch(Exception e)
            {
                Toast.makeText(SplashScreen.this, ""+e, Toast.LENGTH_SHORT).show();
            }
        }};
        t1.start();
    }


}
