package com.ufc.ec.aprendaingles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import com.ufc.ec.aprendaingles.fragment.BichosFragment;
import com.ufc.ec.aprendaingles.fragment.NumerosFragment;
import com.ufc.ec.aprendaingles.fragment.VogaisFragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SmartTabLayout smartTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpager);
        smartTabLayout = findViewById(R.id.viewpagertab);

        getSupportActionBar().setElevation(0);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                        .add("bichos", BichosFragment.class)
                        .add("numeros", NumerosFragment.class)
                        .add("vogais", VogaisFragment.class)
                .create()
        );
        viewPager.setAdapter(   adapter    );
        smartTabLayout.setViewPager(    viewPager   );
    }
}
