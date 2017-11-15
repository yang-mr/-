// Generated code from Butter Knife. Do not modify!
package com.yw.glidedemo;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.yw.glidedemo.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427414, "field 'btDisplayImg' and method 'onViewClicked'");
    target.btDisplayImg = finder.castView(view, 2131427414, "field 'btDisplayImg'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked();
        }
      });
    view = finder.findRequiredView(source, 2131427415, "field 'iv'");
    target.iv = finder.castView(view, 2131427415, "field 'iv'");
  }

  @Override public void unbind(T target) {
    target.btDisplayImg = null;
    target.iv = null;
  }
}
