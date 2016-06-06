package com.ajit.singh.androiddatabinding.login;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.ajit.singh.androiddatabinding.BR;

public class LoginViewModel extends BaseObservable {
  private String username;
  private String password;
  private String loginMessage;

  @Bindable
  public String getUsername() {
    return username;
  }

  @Bindable
  public String getPassword() {
    return password;
  }

  @Bindable
  public String getLoginMessage() {
    return loginMessage;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void loginSucceeded() {
    loginMessage = "Login Successful!!";
    notifyPropertyChanged(BR.loginMessage);
  }

  public void loginFailed() {
    loginMessage = "Login Failed!!";
    notifyPropertyChanged(BR.loginMessage);
  }
}
