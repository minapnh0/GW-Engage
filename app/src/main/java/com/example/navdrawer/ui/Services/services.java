package com.example.navdrawer.ui.Services;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;

import com.example.navdrawer.R;
import com.example.navdrawer.databinding.FragmentServicesBinding;

public class services extends Fragment implements View.OnClickListener {

    private FragmentServicesBinding binding;
    String imageLabel = "tutor1";
    Button Like;
    Button Dislike;
    private View mView;
    private ImageView simpleImageView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        simpleImageView = (ImageView) getView().findViewById(R.id.impleImageView);
        Button Dislike = (Button) getView().findViewById(R.id.Dislike);
        Button Like = (Button) getView().findViewById(R.id.Like);
        Dislike.setOnClickListener(this);
        Like.setOnClickListener(this);
        return simpleImageView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Dislike:
                if (imageLabel == "tutor1") {
                    simpleImageView.setImageResource(R.drawable.tutor2);
                    imageLabel = "tutor2";
                    break;
                }
        }
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
