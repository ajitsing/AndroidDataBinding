package com.ajit.singh.androiddatabinding.adapterView;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.ajit.singh.androiddatabinding.BR;

public class ContactViewModel extends BaseObservable {
  private String name;
  private String number;

  public ContactViewModel(String name, String number) {
    this.name = name;
    this.number = number;
  }

  @Bindable
  public String getName() {
    return name;
  }

  @Bindable
  public String getNumber() {
    return number;
  }
}
