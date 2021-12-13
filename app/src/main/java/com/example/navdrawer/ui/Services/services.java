package com.example.navdrawer.ui.Services;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.navdrawer.R;
import com.example.navdrawer.databinding.FragmentHomeBinding;
import com.example.navdrawer.databinding.FragmentServicesBinding;
import com.example.navdrawer.ui.home.HomeViewModel;

public class services extends Fragment implements View.OnClickListener {

    private FragmentServicesBinding binding;
    String imageLabel = "tutor1";
    Button Like;
    Button Dislike;
    private View mView;
    private ImageView simpleImageView;
    private String Likecount1 = null;
    private String Likecount2 = null;
    private String Likecount3 = null;
    private String Likecount4 = null;
    private String Likecount5 = null;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        simpleImageView = (ImageView) getView().findViewById(R.id.simpleImageView);
        binding =  FragmentServicesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        Button Dislike = (Button) getView().findViewById(R.id.Dislike);
        Button Like = (Button) getView().findViewById(R.id.Like);
        Dislike.setOnClickListener(this);
        Like.setOnClickListener(this);
        return simpleImageView;
    }

    @Override
    public void onClick(View view) {
        if (imageLabel == "image1") {
            if (view.getId() == R.id.Like) {
                Likecount1 = "Like";
            } else {
                Likecount1 = "Dislike";
            }
            simpleImageView.setImageResource(R.drawable.tutor2);
            imageLabel = "tutor2";
        } else if (imageLabel == "tutor2") {
            if (view.getId() == R.id.Like) {
                Likecount2 = "Like";
            } else {
                Likecount2 = "Dislike";
            }
            simpleImageView.setImageResource(R.drawable.tutor3);
            imageLabel = "tutor3";
        } else if (imageLabel == "image3") {
            if (view.getId() == R.id.Like) {
                Likecount3 = "Like";
            } else {
                Likecount3 = "Dislike";
            }
            simpleImageView.setImageResource(R.drawable.tutor4);
            imageLabel = "tutor4";
        } else if (imageLabel == "image4") {
            if (view.getId() == R.id.Like) {
                Likecount4 = "Like";
            } else {
                Likecount4 = "Dislike";
            }
            simpleImageView.setImageResource(R.drawable.tutor5);
            imageLabel = "tutor5";
        } else if (imageLabel == "image5") {
            if (view.getId() == R.id.Like) {
                Likecount5 = "Like";
            } else  {
                Likecount5 = "Dislike";
            }

        }

    };

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
