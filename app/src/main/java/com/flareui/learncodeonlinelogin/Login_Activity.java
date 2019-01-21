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

public class Login_Activity extends AppCompatActivity {

    Animation loadbtmanim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        loadbtmanim = AnimationUtils.loadAnimation(this, R.anim.btm_anim);


        ImageView btmimage = findViewById(R.id.login_bt);
        btmimage.startAnimation(loadbtmanim);



        TextView intentsignup = findViewById(R.id.signup_login);
        intentsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intenttosignup = new Intent(Login_Activity.this, Signup_Activity.class);
                startActivity(intenttosignup);
                overridePendingTransition(R.anim.enter_signinsignup, R.anim.exit_signinsignup);
                finish();
            }
        });

        CardView toastlogin = findViewById(R.id.login_login);
        toastlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getBaseContext(), "Log In 👍" , Toast.LENGTH_SHORT ).show();

            }
        });

        TextView toastforgotpass = findViewById(R.id.forgotpasss);
        toastforgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getBaseContext(), "Forgot Password? 😲" , Toast.LENGTH_SHORT ).show();

            }
        });

    }
}
