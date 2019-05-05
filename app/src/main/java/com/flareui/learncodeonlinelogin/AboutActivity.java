package com.flareui.learncodeonlinelogin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        ImageButton imageButton = findViewById(R.id.backtomain);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });




        ImageButton instagram = findViewById(R.id.instagramabt);
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://www.instagram.com/jcs.10/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });

        ImageButton instagrams = findViewById(R.id.instagramabts);
        instagrams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://www.instagram.com/flareui.io/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });

//         ImageButton facebook = findViewById(R.id.facebookabts);
//         facebook.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View v) {

//                 String url = "https://www.facebook.com/flareui.fl/";
//                 Intent i = new Intent(Intent.ACTION_VIEW);
//                 i.setData(Uri.parse(url));
//                 startActivity(i);

//             }
//         });

//         ImageButton twitter = findViewById(R.id.twitterabts);
//         twitter.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View v) {

//                 String url = "https://twitter.com/flareui?lang=en";
//                 Intent i = new Intent(Intent.ACTION_VIEW);
//                 i.setData(Uri.parse(url));
//                 startActivity(i);

//             }
//         });


    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {

            finish();


        }
        return super.onKeyDown(keyCode, event);


    }

}