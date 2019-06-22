package com.androiddesdecero.viewmodeludemy.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.androiddesdecero.viewmodeludemy.R;
import com.androiddesdecero.viewmodeludemy.util.User;

public class LiveDataActivity extends AppCompatActivity {

    private TextView tvLiveData;
    private Button btSave;
    private int numero = 0;
    //private LiveDataViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_data);

        setUpView();
    }

    private void setUpView(){
        //viewModel = ViewModelProviders.of(this).get(LiveDataViewModel.class);
        tvLiveData = findViewById(R.id.tvLiveData);
        btSave = findViewById(R.id.btSave);
        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero == 0){
                    User user = new User();
                    user.setNombre("Alberto");
                    user.setEdad("30");
                    Log.d("TAG1", "numero0");
                   // viewModel.addUser(user);
                }
                if(numero == 1){
                    User user = new User();
                    user.setNombre("Maria");
                    user.setEdad("23");
                  //  viewModel.addUser(user);
                }
                if(numero == 2){
                    User user = new User();
                    user.setNombre("Manuel");
                    user.setEdad("40");
                  //  viewModel.addUser(user);
                }
                numero++;
            }
        });
    }
}
