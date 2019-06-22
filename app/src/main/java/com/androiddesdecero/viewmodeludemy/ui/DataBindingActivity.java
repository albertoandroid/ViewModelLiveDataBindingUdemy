package com.androiddesdecero.viewmodeludemy.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;

import com.androiddesdecero.viewmodeludemy.R;
import com.androiddesdecero.viewmodeludemy.databinding.ActivityDataBindingBinding;
import com.androiddesdecero.viewmodeludemy.util.User;

public class DataBindingActivity extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_data_binding);

        ActivityDataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);
        user = new User("Alberto", "30");

        binding.setUser(user);
    }
}
