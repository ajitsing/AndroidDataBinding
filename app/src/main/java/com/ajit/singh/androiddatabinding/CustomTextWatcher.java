package com.ajit.singh.androiddatabinding;

import android.text.Editable;
import android.text.TextWatcher;

abstract class CustomTextWatcher implements TextWatcher {
  @Override
  public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

  }

  @Override
  public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

  }

  @Override
  public void afterTextChanged(Editable editable) {
    onTextChanged(editable.toString());
  }

  abstract public void onTextChanged(String text);
}