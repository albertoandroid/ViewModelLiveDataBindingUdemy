package com.androiddesdecero.viewmodeludemy.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.androiddesdecero.viewmodeludemy.R;
import com.androiddesdecero.viewmodeludemy.databinding.ActivityDbldBinding;

public class DBLDActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDbldBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_dbld);
    }
}
