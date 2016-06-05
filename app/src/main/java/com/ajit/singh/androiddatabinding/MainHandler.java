package com.ajit.singh.androiddatabinding;

import android.view.View;

public class MainHandler {

  private MainNavigator navigator;

  public MainHandler(MainNavigator navigator) {
    this.navigator = navigator;
  }

  public void startLoginFlow(View view) {
    this.navigator.renderLoginForm();
  }

  public void startAdapterViewFlow(View view) {
    this.navigator.renderAdapterView();
  }
}
