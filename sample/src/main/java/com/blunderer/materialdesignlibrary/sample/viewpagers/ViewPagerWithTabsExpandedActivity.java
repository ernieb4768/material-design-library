package com.blunderer.materialdesignlibrary.sample.viewpagers;

import com.blunderer.materialdesignlibrary.handlers.ActionBarDefaultHandler;
import com.blunderer.materialdesignlibrary.handlers.ActionBarHandler;
import com.blunderer.materialdesignlibrary.handlers.ViewPagerHandler;
import com.blunderer.materialdesignlibrary.sample.MainFragment;
import com.blunderer.materialdesignlibrary.sample.R;

public class ViewPagerWithTabsExpandedActivity
        extends com.blunderer.materialdesignlibrary.activities.ViewPagerWithTabsActivity {

    @Override
    public ViewPagerHandler getViewPagerHandler() {
        return new ViewPagerHandler(this)
                .addPage(R.string.title_section1,
                        MainFragment.newInstance("Material Design ViewPager with Expanded Tabs"))
                .addPage(R.string.title_section2,
                        MainFragment.newInstance("Material Design ViewPager with Expanded Tabs"));
    }

    @Override
    public boolean expandTabs() {
        return true;
    }

    @Override
    public int defaultViewPagerPageSelectedPosition() {
        return 0;
    }

    @Override
    protected boolean enableActionBarShadow() {
        return true;
    }

    @Override
    protected ActionBarHandler getActionBarHandler() {
        return new ActionBarDefaultHandler(this);
    }

}
