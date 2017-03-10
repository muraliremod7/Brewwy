package com.mr.brewwy.brewwy;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import com.mr.brewwy.brewwy.fragments.HomeFragment;
import com.mr.brewwy.brewwy.fragments.MylistFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                Fragment fragment = null;
                Class fragmentClass = null;
                switch (tabId){
                    case R.id.home:
                        fragmentClass = HomeFragment.class;
                        break;
                    case R.id.mylist:
                        fragmentClass = MylistFragment.class;
                        break;
                    case R.id.trending:
                        fragmentClass = MylistFragment.class;
                        break;
                    case R.id.sort:
                        fragmentClass = MylistFragment.class;
                        break;
                    case R.id.profile:
                        fragmentClass = MylistFragment.class;
                        break;
                }
                try {
                    fragment = (Fragment) fragmentClass.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.contentContainer, fragment).commit();
            }
        });
    }
}
