package com.example.soymilk.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GameActivity extends AppCompatActivity implements ListFragment.OnFragmentInteractionListener {

    ViewPager viewPager;
    GamePagerAdapter adapter;
    String username;
    String password = MainActivity.globalPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        username = getIntent().getStringExtra("username");

        viewPager = (ViewPager)findViewById(R.id.container);
        adapter = new GamePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);

    }

    // Communication channel with ListFragment
    @Override
    public void onFragmentInteraction() {

    }

    // Inner class for PagerAdapter

    class GamePagerAdapter extends FragmentStatePagerAdapter {

        public GamePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new ListFragment().newInstance(username, password);
                default:
                    return null;

            }

        }


        @Override
        public int getCount() {
            return 1;
        }

        // TODO: Understand this code
        public int getItemPosition(Object object) {
            return POSITION_NONE;
        }
    }


}