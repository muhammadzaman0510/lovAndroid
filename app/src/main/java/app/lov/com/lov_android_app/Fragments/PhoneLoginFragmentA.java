package app.lov.com.lov_android_app.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import app.lov.com.lov_android_app.R;

/**
 * Created by macbookpro on 26-Dec-17.
 */

public class PhoneLoginFragmentA extends Fragment implements View.OnClickListener{

    Button sendCodeBtn;

    public static PhoneLoginFragmentA newInstance(){
        PhoneLoginFragmentA f = new PhoneLoginFragmentA();

        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.login_phone_a_fragment, container, false);

        sendCodeBtn = (Button) v.findViewById(R.id.send_cnfrm_btn);
        sendCodeBtn.setOnClickListener(this);

        return v;

    }

    @Override
    public void onClick(View v) {
        if (v == sendCodeBtn){
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.phone_login_framelayout, PhoneLoginFragmentB.newInstance(), "PhoneLoginFragmentB").commit();
        }
    }
}

