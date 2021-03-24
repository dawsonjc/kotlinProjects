package com.example.cupcake;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.cupcake.databinding.FragmentFlavorBindingImpl;
import com.example.cupcake.databinding.FragmentPickupBindingImpl;
import com.example.cupcake.databinding.FragmentStartBindingImpl;
import com.example.cupcake.databinding.FragmentSummaryBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTFLAVOR = 1;

  private static final int LAYOUT_FRAGMENTPICKUP = 2;

  private static final int LAYOUT_FRAGMENTSTART = 3;

  private static final int LAYOUT_FRAGMENTSUMMARY = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.cupcake.R.layout.fragment_flavor, LAYOUT_FRAGMENTFLAVOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.cupcake.R.layout.fragment_pickup, LAYOUT_FRAGMENTPICKUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.cupcake.R.layout.fragment_start, LAYOUT_FRAGMENTSTART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.cupcake.R.layout.fragment_summary, LAYOUT_FRAGMENTSUMMARY);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTFLAVOR: {
          if ("layout/fragment_flavor_0".equals(tag)) {
            return new FragmentFlavorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_flavor is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPICKUP: {
          if ("layout/fragment_pickup_0".equals(tag)) {
            return new FragmentPickupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_pickup is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTART: {
          if ("layout/fragment_start_0".equals(tag)) {
            return new FragmentStartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_start is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSUMMARY: {
          if ("layout/fragment_summary_0".equals(tag)) {
            return new FragmentSummaryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_summary is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(6);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "flavorFragment");
      sKeys.put(2, "pickupFragment");
      sKeys.put(3, "startFragment");
      sKeys.put(4, "summaryFragment");
      sKeys.put(5, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/fragment_flavor_0", com.example.cupcake.R.layout.fragment_flavor);
      sKeys.put("layout/fragment_pickup_0", com.example.cupcake.R.layout.fragment_pickup);
      sKeys.put("layout/fragment_start_0", com.example.cupcake.R.layout.fragment_start);
      sKeys.put("layout/fragment_summary_0", com.example.cupcake.R.layout.fragment_summary);
    }
  }
}
