package com.ajit.singh.androiddatabinding;

import android.view.View;

public class MainHandler {

  private MainView view;

  public MainHandler(MainView view) {
    this.view = view;
  }

  public void startLoginFlow(View view) {
    this.view.renderLoginForm();
  }

  public void startAdapterViewFlow(View view) {
    this.view.renderAdapterView();
  }
}
