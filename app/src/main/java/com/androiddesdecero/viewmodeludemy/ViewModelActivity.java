package com.androiddesdecero.viewmodeludemy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.androiddesdecero.viewmodeludemy.util.Sumar;

public class ViewModelActivity extends AppCompatActivity {

    private TextView tvSumar;
    private TextView tvSumarViewModel;
    private Button btSumar;
    private int resultado;
    //private SumarViewModel sumarViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_model);
        Log.d("TAG1", "onCreate()");

        setUpView();
    }

    private void setUpView(){
        tvSumar = findViewById(R.id.tvSumar);
        tvSumarViewModel = findViewById(R.id.tvSumarViewModel);
        btSumar = findViewById(R.id.btSumar);
        btSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = Sumar.sumar(resultado);
                tvSumar.setText("" + resultado);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG1", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG1", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG1", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG1", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG1", "onDestroy()");
    }
}
