package com.androiddesdecero.viewmodeludemy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
            }
        });
    }
}
