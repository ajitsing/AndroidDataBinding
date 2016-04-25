package com.ajit.singh.androiddatabinding.login;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.ajit.singh.androiddatabinding.R;
import com.ajit.singh.androiddatabinding.databinding.LoginBinding;

public class LoginActivity extends AppCompatActivity implements LoginView {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    LoginBinding binding = DataBindingUtil.setContentView(this, R.layout.login);

    LoginViewModel loginViewModel = new LoginViewModel();
    binding.setLoginViewModel(loginViewModel);
    binding.setHandler(new LoginHandler(loginViewModel, this));
  }

  @Override
  public void onSuccess() {
    Toast.makeText(this, "Login Successful !!", Toast.LENGTH_SHORT).show();
  }

  @Override
  public void onFailure() {
    Toast.makeText(this, "Login Failed !!", Toast.LENGTH_SHORT).show();
  }
}
