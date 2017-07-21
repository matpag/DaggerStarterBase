package com.matpag.dagger.starter;

import android.support.v4.app.FragmentManager;

import com.matpag.dagger.starter.main.FirstFragment;
import com.matpag.dagger.starter.main.MainActivity;

import javax.inject.Inject;

/**
 * A utility class that handles navigation in {@link BaseActivity}.
 */
public class NavigationController {
    private final int containerId;
    private final FragmentManager fragmentManager;

    @Inject
    public NavigationController(MainActivity mainActivity) {
        this.containerId = R.id.container;
        this.fragmentManager = mainActivity.getSupportFragmentManager();
    }

    public void navigateToFirstFragment() {
        FirstFragment firstFragment = new FirstFragment();
        fragmentManager.beginTransaction()
                .replace(containerId, firstFragment)
                .commitAllowingStateLoss();
    }
}
