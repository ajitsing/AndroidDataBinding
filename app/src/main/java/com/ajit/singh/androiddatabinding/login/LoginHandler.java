package com.ajit.singh.androiddatabinding.login;

import android.text.TextWatcher;
import android.view.View;

public class LoginHandler {
  private LoginPresenter presenter;

  public LoginHandler(LoginPresenter presenter) {
    this.presenter = presenter;
  }

  public TextWatcher userNameChanged(final LoginViewModel viewModel) {
    return new CustomTextWatcher() {
      @Override
      public void onTextChanged(String text) {
        presenter.usernameChanged(viewModel, text);
      }
    };
  }

  public TextWatcher passwordChanged(final LoginViewModel viewModel) {
    return new CustomTextWatcher() {
      @Override
      public void onTextChanged(String text) {
        presenter.passwordChanged(viewModel, text);
      }
    };
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