package com.androiddesdecero.viewmodeludemy.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.androiddesdecero.viewmodeludemy.R;
import com.androiddesdecero.viewmodeludemy.databinding.ActivityDbldBinding;
import com.androiddesdecero.viewmodeludemy.util.User;
import com.androiddesdecero.viewmodeludemy.viewmodel.DBLDViewModel;

public class DBLDActivity extends AppCompatActivity {

    private DBLDViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDbldBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_dbld);

        binding.setLifecycleOwner(this);
        viewModel = ViewModelProviders.of(this).get(DBLDViewModel.class);
        binding.setViewModel(viewModel);

        User user = new User("Alberto", "30");
        viewModel.setUser(user);
    }
}
