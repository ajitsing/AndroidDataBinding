package com.ajit.singh.androiddatabinding.login;

import android.view.View;

public class LoginHandler {
  private LoginViewModel loginViewModel;
  private LoginView view;

  public LoginHandler(LoginViewModel loginViewModel, LoginView view) {
    this.loginViewModel = loginViewModel;
    this.view = view;
  }

  public void onLogin(View v) {
    if(loginViewModel.getUsername().equals("ajit") && loginViewModel.getPassword().equals("singh")){
      view.onSuccess();
    } else {
      view.onFailure();
    }
  }
}