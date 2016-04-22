package com.ajit.singh.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.ajit.singh.androiddatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements LoginView {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

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
