package com.ajit.singh.androiddatabinding.custombinding;

import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.Toast;

public class DataBindingAdapter {
  @BindingAdapter("toast")
  public static void showToast(View view,  String toast) {
    if (toast != null && !toast.isEmpty())
    Toast.makeText(view.getContext(), toast, Toast.LENGTH_SHORT).show();
  }
}
