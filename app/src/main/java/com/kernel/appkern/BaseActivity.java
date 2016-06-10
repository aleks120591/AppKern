package com.kernel.appkern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by Warlock on 10.06.2016.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getParentViewId()!=0)setContentView(getParentViewId());
        else
            if (getParentView()!=null)setContentView(getParentView());

        Toolbar toolbar = getToolbar();
        toolbar.setPopupTheme(R.style.ThemeOverlay_AppCompat_Dark);


    }

    public abstract int getParentViewId();
    public abstract View getParentView();
    public abstract Toolbar getToolbar();
}
