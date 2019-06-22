package com.androiddesdecero.viewmodeludemy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btViewModel;
    private Button btUserViewModel;
    private Button btLiveData;
    private Button btDataBinding;
    private Button btDBLABinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpView();
    }

    private void setUpView(){
        btViewModel = findViewById(R.id.btViewModel);
        btViewModel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ViewModelActivity.class));
            }
        });

        btUserViewModel = findViewById(R.id.btUserViewModel);
        btUserViewModel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getApplicationContext(), UserViewModelActivity.class));
            }
        });

        btLiveData = findViewById(R.id.btLiveData);
        btLiveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getApplicationContext(), LiveDataActivity.class));
            }
        });

        btDataBinding = findViewById(R.id.btDataBinding);
        btDataBinding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getApplicationContext(), DataBindingActivity.class));
            }
        });

        btDBLABinding = findViewById(R.id.btDBLABinding);
        btDBLABinding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getApplicationContext(), DBLDActivity.class));
            }
        });
    }

}
