package com.androiddesdecero.viewmodeludemy;

import android.view.View;
import android.widget.TextView;

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

    @BindingAdapter({"visibility", "size"})
    public static void setSize(TextView view, boolean visibility, float size){
        if(visibility == true){
            view.setVisibility(View.VISIBLE);
        }else {
            view.setVisibility(View.GONE);
        }
        view.setTextSize(size);
    }
}
