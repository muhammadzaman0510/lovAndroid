package app.lov.com.lov_android_app.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.lov.com.lov_android_app.R;

/**
 * Created by macbookpro on 26-Dec-17.
 */

public class PhoneLoginFragmentB extends Fragment implements View.OnClickListener{

    public static PhoneLoginFragmentB newInstance(){
        PhoneLoginFragmentB f = new PhoneLoginFragmentB();

        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.login_phone_b_fragment, container, false);

        return v;

    }

    @Override
    public void onClick(View v) {
    }
}
