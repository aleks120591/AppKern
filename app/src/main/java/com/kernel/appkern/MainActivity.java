package com.kernel.appkern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by Warlock on 10.06.2016.
 */
public class MainActivity extends BaseActivity{

    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getParentViewId() {
        return R.layout.activity_main;
    }

    @Override
    public View getParentView() {
        return null;
    }

    @Override
    public Toolbar getToolbar(){
        return toolbar = (Toolbar)findViewById(R.id.toolbar);
    }
}
