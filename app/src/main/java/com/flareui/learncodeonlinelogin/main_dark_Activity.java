package com.flareui.learncodeonlinelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class main_dark_Activity extends AppCompatActivity {

    Animation bgartone;
    Animation bgarttwo;
    Animation bgthree;
    Animation alphaoneanim;
    Animation alphatwoanim;
    Animation alphathreeanim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_dark);

        //one
        bgartone = AnimationUtils.loadAnimation(this, R.anim.main_slide_left);


        ImageView animbgartone = findViewById(R.id.mainbgartone);
        animbgartone.startAnimation(bgartone);

        //two
        bgarttwo = AnimationUtils.loadAnimation(this, R.anim.main_slide_right);


        ImageView animbgarttwo = findViewById(R.id.mainbgarttwo);
        animbgarttwo.startAnimation(bgarttwo);

        //three

        bgthree = AnimationUtils.loadAnimation(this, R.anim.main_frm_slide_up);


        FrameLayout animbgartthree = findViewById(R.id.framlayoutcntw);
        animbgartthree.startAnimation(bgthree);



        //alpha_one

        alphaoneanim = AnimationUtils.loadAnimation(this, R.anim.alpha_one);


        ImageView animalphaonelogo = findViewById(R.id.lco_logo);
        animalphaonelogo.startAnimation(alphaoneanim);

        TextView animalphaonetextvone = findViewById(R.id.headertextviewone);
        animalphaonetextvone.startAnimation(alphaoneanim);

        TextView animalphaonetextvtwo = findViewById(R.id.headertextviewtwo);
        animalphaonetextvtwo.startAnimation(alphaoneanim);

        //alpha_two

        alphatwoanim = AnimationUtils.loadAnimation(this, R.anim.alpha_two);


        ImageView animhtmlicn = findViewById(R.id.htmlicn);
        animhtmlicn.startAnimation(alphatwoanim);

        ImageView animjavaicn = findViewById(R.id.javaicn);
        animjavaicn.startAnimation(alphatwoanim);

        //alpha_three

        alphathreeanim = AnimationUtils.loadAnimation(this, R.anim.alpha_three);


        ImageView animandroidicn = findViewById(R.id.androidicn);
        animandroidicn.startAnimation(alphathreeanim);

        ImageView animswifticn = findViewById(R.id.swifticn);
        animswifticn.startAnimation(alphathreeanim);

        ImageView animfluttericn = findViewById(R.id.fluttericn);
        animfluttericn.startAnimation(alphathreeanim);

        ImageView animpythonicn = findViewById(R.id.pythoneicn);
        animpythonicn.startAnimation(alphathreeanim);


        //--

        ImageView aboutbtn = findViewById(R.id.aboutbtn);
        aboutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intenttoabout = new Intent(main_dark_Activity.this, AboutActivity.class);
                startActivity(intenttoabout);
            }
        });

        ImageView themebtn = findViewById(R.id.themebtn);
        themebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intenttoabout = new Intent(main_dark_Activity.this, main_Activity.class);
                startActivity(intenttoabout);
                finish();
            }
        });

        TextView logintxv = findViewById(R.id.login_textview);
        logintxv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intenttoabout = new Intent(main_dark_Activity.this, Login_dark_Activity.class);
                startActivity(intenttoabout);
                overridePendingTransition(R.anim.slide_up,R.anim.no_changeanim);

            }
        });

        TextView signuptxv = findViewById(R.id.signup_textview);
        signuptxv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intenttoabout = new Intent(main_dark_Activity.this, Signup_dark_Activity.class);
                startActivity(intenttoabout);
                overridePendingTransition(R.anim.slide_up,R.anim.no_changeanim);
            }
        });

        CardView googletoast = findViewById(R.id.googlesignin);
        googletoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getBaseContext(), "Log In with GOOGLE 👍" , Toast.LENGTH_SHORT ).show();

            }
        });

        CardView facebooktoast = findViewById(R.id.facebooksignin);
        facebooktoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getBaseContext(), "Log In with FACEBOOK 👍" , Toast.LENGTH_SHORT ).show();

            }
        });
    }
}
