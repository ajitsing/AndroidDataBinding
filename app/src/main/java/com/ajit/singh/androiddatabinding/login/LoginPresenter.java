package com.ajit.singh.androiddatabinding.login;

public class LoginPresenter {

  public void login(LoginViewModel viewModel) {
    if(viewModel.getUsername().equals("ajit") && viewModel.getPassword().equals("singh")){
      viewModel.loginSucceeded();
    } else {
      viewModel.loginFailed();
    }
  }
}
