package com.androiddesdecero.viewmodeludemy.viewmodel;

import androidx.lifecycle.ViewModel;

import com.androiddesdecero.viewmodeludemy.util.User;

import java.util.ArrayList;
import java.util.List;

public class UserViewModel extends ViewModel {

    private List<User> userList;

    public UserViewModel(){
        userList = new ArrayList<>();
    }

    public void addUser(User user){
        userList.add(user);
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
