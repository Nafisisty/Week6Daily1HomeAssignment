package com.example.week6daily1homeassignment.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.week6daily1homeassignment.BR;
import com.example.week6daily1homeassignment.model.User;
import com.example.week6daily1homeassignment.view.DisplayActivity;

public class UserViewModel extends BaseObservable {
    public User user;
    private String successMessage = "Save is successful";
    Context context;

    @Bindable
    public String toastMessage = null;

    public String getToastMessage() {
        return toastMessage;
    }


    private void setToastMessage(String toastMessage) {

        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }



    public UserViewModel(Context context, User user) {
        this.context = context;
        this.user = user;
    }

    public String getUserName() {
        return user.getName();
    }

    public String getUserFavBook() {
        return user.getFavBook();
    }

    public String getUserFavMovie() {
        return user.getFavMovie();
    }


    public void afterNameTextChanged(CharSequence s) {
        user.setName(s.toString());
    }

    public void afterFavBookTextChanged(CharSequence s) {
        user.setFavBook(s.toString());
    }

    public void afterFavMovieTextChanged(CharSequence s) {
        user.setFavMovie(s.toString());
    }

    public void onSaveClicked() {
        setToastMessage(successMessage);

        Intent intent = new Intent(context, DisplayActivity.class);
        intent.putExtra("userInfo", user);
        context.startActivity(intent);
    }
}
