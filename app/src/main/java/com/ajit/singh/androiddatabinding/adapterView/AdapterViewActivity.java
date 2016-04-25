package com.ajit.singh.androiddatabinding.adapterView;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.ajit.singh.androiddatabinding.R;
import com.ajit.singh.androiddatabinding.databinding.AdapterViewActivityBinding;

import static java.util.Arrays.asList;

public class AdapterViewActivity extends AppCompatActivity {
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    AdapterViewActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.adapter_view_activity);

    ContactViewModel ajit = new ContactViewModel("Ajit", "432432423");
    ContactViewModel kuldeep = new ContactViewModel("Kuldeep", "543534543");
    ContactViewModel vijay = new ContactViewModel("vijay", "98532432");

    binding.contactList.setAdapter(new ContactsAdapter(this, asList(ajit, kuldeep, vijay)));
  }
}
