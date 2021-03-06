package com.ajit.singh.androiddatabinding.login;

import android.view.View;

public class LoginHandler {
  private LoginPresenter presenter;

  public LoginHandler(LoginPresenter presenter) {
    this.presenter = presenter;
  }

  public View.OnClickListener onLogin(final LoginViewModel viewModel) {
    return new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        presenter.login(viewModel);
      }
    };
  }
}