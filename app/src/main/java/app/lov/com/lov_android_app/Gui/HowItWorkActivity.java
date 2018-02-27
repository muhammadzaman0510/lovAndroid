package app.lov.com.lov_android_app.Gui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import app.lov.com.lov_android_app.Adapters.CustomPagerAdapter;
import app.lov.com.lov_android_app.MainActivity;
import app.lov.com.lov_android_app.R;
import app.lov.com.lov_android_app.Utils.IntroManager;

/**
 * Created by macbookpro on 19-Dec-17.
 */

public class HowItWorkActivity extends AppCompatActivity {

    ViewPager viewPager;
    private IntroManager introManager;
    CustomPagerAdapter adapter;
    protected View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        introManager = new IntroManager(this);
        if(!introManager.check()){
            introManager.setfirst(false);
            Intent i= new Intent(HowItWorkActivity.this, SplashScreen.class);
            startActivity(i);
            finish();

        }
        else {
            introManager.setfirst(true);
        }
        setContentView(R.layout.how_it_work_parent);
        viewPager = (ViewPager)findViewById(R.id.viewpager1);

        adapter = new CustomPagerAdapter(this);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager, true);

        adapter.setOnPagerItemClickListner(new CustomPagerAdapter.onPagerItemClickListner() {
            @Override
            public void onPagerItemListner(int position) {
                if (position == 0){
                    view = LayoutInflater.from(HowItWorkActivity.this).inflate(R.layout.how_it_work_a,viewPager);
                }
                else if (position == 1){
                    view = LayoutInflater.from(HowItWorkActivity.this).inflate(R.layout.how_it_work_b,viewPager);
                }
                else if (position == 2){
                    view = LayoutInflater.from(HowItWorkActivity.this).inflate(R.layout.how_it_work_c,viewPager);
                    ImageView phoneLoginImg = (ImageView) view.findViewById(R.id.phone_login_img);
                    phoneLoginImg.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            startPhoneLoginActivity();
                        }
                    });

                }
            }
        });

    }

    private void startPhoneLoginActivity(){
        Intent i = new Intent(this,PhoneLoginActivity.class);
        startActivity(i);
        finish();
    }
}
