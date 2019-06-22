package com.androiddesdecero.viewmodeludemy;

import android.view.View;

import androidx.databinding.BindingAdapter;

public class ViewModelBindingAdapter {

    @BindingAdapter("visible")
    public static void setVisibility(View view, boolean visibility){
        if(visibility == true){
            view.setVisibility(View.VISIBLE);
        }else {
            view.setVisibility(View.GONE);
        }
    }
}
