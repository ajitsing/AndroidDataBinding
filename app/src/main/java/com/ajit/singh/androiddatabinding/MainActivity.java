package com.ajit.singh.androiddatabinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.ajit.singh.androiddatabinding.adapterView.AdapterViewActivity;
import com.ajit.singh.androiddatabinding.databinding.MainActivityBinding;
import com.ajit.singh.androiddatabinding.login.LoginActivity;

public class MainActivity extends AppCompatActivity implements MainNavigator {
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity);
    binding.setHandler(new MainHandler(this));
  }

  @Override
  public void renderLoginForm() {
    startActivity(new Intent(this, LoginActivity.class));
  }

  @Override
  public void renderAdapterView() {
    startActivity(new Intent(this, AdapterViewActivity.class));
  }
}
