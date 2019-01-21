package com.flareui.learncodeonlinelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Signup_Activity extends AppCompatActivity {

    Animation loadbtmsanim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        loadbtmsanim = AnimationUtils.loadAnimation(this, R.anim.btm_anim);


        ImageView btmimages = findViewById(R.id.signup_bt);
        btmimages.startAnimation(loadbtmsanim);



        CardView toastsignup = findViewById(R.id.signup_signup);
        toastsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getBaseContext(), "Sign up 👍" , Toast.LENGTH_SHORT ).show();

            }
        });

        TextView intentsignup = findViewById(R.id.signin_login);
        intentsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intenttosignin = new Intent(Signup_Activity.this, Login_Activity.class);
                startActivity(intenttosignin);
                overridePendingTransition(R.anim.enter_signinsignup, R.anim.exit_signinsignup);
                finish();
            }
        });
    }
}
