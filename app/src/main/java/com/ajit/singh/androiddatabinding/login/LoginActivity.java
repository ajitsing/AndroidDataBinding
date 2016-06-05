package com.ajit.singh.androiddatabinding.login;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ajit.singh.androiddatabinding.R;
import com.ajit.singh.androiddatabinding.databinding.LoginBinding;

public class LoginActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    LoginBinding binding = DataBindingUtil.setContentView(this, R.layout.login);
    binding.setLoginViewModel(new LoginViewModel());
    binding.setHandler(new LoginHandler(new LoginPresenter()));
  }
}
