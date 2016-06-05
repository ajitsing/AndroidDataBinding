package com.ajit.singh.androiddatabinding.login;

public class LoginPresenter {

  public void login(LoginViewModel viewModel) {
    if(viewModel.getUsername().equals("ajit") && viewModel.getPassword().equals("singh")){
      viewModel.loginSucceeded();
    } else {
      viewModel.loginFailed();
    }
  }

  public void passwordChanged(LoginViewModel viewModel, String password) {
    viewModel.setPassword(password);
  }

  public void usernameChanged(LoginViewModel viewModel, String username) {
    viewModel.setUsername(username);
  }
}
