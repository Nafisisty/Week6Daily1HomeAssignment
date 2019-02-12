package com.example.week6daily1homeassignment.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.week6daily1homeassignment.R;
import com.example.week6daily1homeassignment.databinding.ActivityDisplayBinding;
import com.example.week6daily1homeassignment.model.User;
import com.example.week6daily1homeassignment.viewmodel.UserViewModel;

public class DisplayActivity extends AppCompatActivity {

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {

            user = bundle.getParcelable("userInfo");

        }

        ActivityDisplayBinding activityDisplayBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_display);
        activityDisplayBinding.setViewModel(new UserViewModel(this, user));
        activityDisplayBinding.executePendingBindings();

    }
}
