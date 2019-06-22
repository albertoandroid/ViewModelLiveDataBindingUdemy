package com.androiddesdecero.viewmodeludemy.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.androiddesdecero.viewmodeludemy.util.User;

public class DBLDViewModel extends ViewModel {

    private MutableLiveData<User> user;
    private MutableLiveData<Boolean> visible;
    private MutableLiveData<Float> size;

    public DBLDViewModel(){
        user = new MutableLiveData<>();
        visible = new MutableLiveData<>();
        visible.setValue(true);

        size = new MutableLiveData<>();
        size.setValue(14f);
    }

    public LiveData<User> getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user.setValue(user);
    }

    public void updateUser(){
        User user = new User("Laura", "23");
        this.user.setValue(user);
    }

    public LiveData<Boolean> getVisible(){
        return visible;
    }

    public void setVisible(Boolean visible){
        this.visible.setValue(visible);
    }

    public void changeVisibility(){
        if(visible.getValue().booleanValue() == true){
            visible.setValue(false);
        }else {
            visible.setValue(true);
        }
        size.setValue(size.getValue().floatValue()+5l);
    }

    public LiveData<Float> getSize(){
        return size;
    }
}
