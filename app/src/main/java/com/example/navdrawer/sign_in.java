package com.example.navdrawer;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Button;
import android.content.Intent;

import com.example.navdrawer.databinding.FragmentHomeBinding;
import com.example.navdrawer.ui.home.HomeViewModel;

public class sign_in extends Activity {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Button Enter = (Button) findViewById(R.id.Enter);

        Enter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);

            }
        });

    }
}




