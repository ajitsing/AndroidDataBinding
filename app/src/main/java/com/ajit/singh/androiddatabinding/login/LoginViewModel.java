package com.ajit.singh.androiddatabinding.login;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextWatcher;

import com.ajit.singh.androiddatabinding.BR;

public class LoginViewModel extends BaseObservable {
  private String username;
  private String password;

  public final TextWatcher usernameWatcher = new CustomTextWatcher() {
    @Override
    public void onTextChanged(String text) {
      setUsername(text);
    }
  };

  public final TextWatcher passwordWatcher = new CustomTextWatcher() {
    @Override
    public void onTextChanged(String text) {
      setPassword(text);
    }
  };

  @Bindable
  public String getUsername() {
    return username;
  }

  @Bindable
  public String getPassword() {
    return password;
  }

  public void setUsername(String username) {
    this.username = username;
    notifyPropertyChanged(BR.username);
  }

  public void setPassword(String password) {
    this.password = password;
    notifyPropertyChanged(BR.password);
  }
}
