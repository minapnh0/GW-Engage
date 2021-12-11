package com.example.navdrawer.ui.Tutor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.navdrawer.R;

public class TutorSwipeLR extends Fragment {

    private TutorSwipeLR TutorSwipeLR;

    String imageLabel = "image1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView simpleImageView = (ImageView) findViewById(R.id.ImageView1);
        simpleImageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){}
        });
        Button button_no = (Button) findViewById(R.id.button_no);
        button_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imageLabel == "tutor1") {
                    simpleImageView.setImageResource(R.drawable.tutor2);
                    imageLabel = "tutor2";
                } else {
                    if(imageLabel=="tutor2"){
                        simpleImageView.setImageResource(R.drawable.tutor3);
                        imageLabel = "tutor3";
                    } else{
                        if(imageLabel=="tutor3"){
                        simpleImageView.setImageResource(R.drawable.tutor4);
                        imageLabel = "tutor4";
                    } else {
                            if(imageLabel=="tutor4"){
                                simpleImageView.setImageResource(R.drawable.tutor5);
                                imageLabel = "tutor5";
                            }
                            else {
                                simpleImageView.setImageResource(R.drawable.tutor1);
                                imageLabel = "tutor1";
                            }
                        }
                }

            }
        });
        Button button_yes = (Button) findViewById(R.id.button_yes);
        button_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}


