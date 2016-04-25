package com.ajit.singh.androiddatabinding.adapterView;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.ajit.singh.androiddatabinding.R;
import com.ajit.singh.androiddatabinding.databinding.ContactBinding;

import java.util.List;

public class ContactsAdapter extends BaseAdapter {
  private Context ctx;
  private List<ContactViewModel> contactViewModels;

  public ContactsAdapter(Context ctx, List<ContactViewModel> contactViewModels) {
    this.ctx = ctx;
    this.contactViewModels = contactViewModels;
  }

  @Override
  public int getCount() {
    return contactViewModels.size();
  }

  @Override
  public Object getItem(int i) {
    return contactViewModels.get(i);
  }

  @Override
  public long getItemId(int i) {
    return i;
  }

  @Override
  public View getView(int position, View view, ViewGroup viewGroup) {
    LayoutInflater inflator = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    ContactBinding binding = DataBindingUtil.inflate(inflator, R.layout.contact, viewGroup, false);
    binding.setContact(contactViewModels.get(position));
    return binding.getRoot();
  }
}
