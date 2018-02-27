package app.lov.com.lov_android_app.Gui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import app.lov.com.lov_android_app.Fragments.PhoneLoginFragmentA;
import app.lov.com.lov_android_app.R;

/**
 * Created by macbookpro on 26-Dec-17.
 */

public class PhoneLoginActivity extends FragmentActivity implements View.OnClickListener{


    FragmentTransaction transaction;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_phone_main);

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.phone_login_framelayout, PhoneLoginFragmentA.newInstance(), "PhoneLoginFragmentA").commit();
        }
    }



    @Override
    public void onClick(View v) {
        // implements your things
    }
}
