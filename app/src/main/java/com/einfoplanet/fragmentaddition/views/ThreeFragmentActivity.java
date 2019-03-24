package com.einfoplanet.fragmentaddition.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.einfoplanet.fragmentaddition.R;
import com.einfoplanet.fragmentaddition.listeners.FragmentAListerner;
import com.einfoplanet.fragmentaddition.listeners.FragmentBListerner;
import com.einfoplanet.fragmentaddition.views.A_Fragment;
import com.einfoplanet.fragmentaddition.views.B_Fragment;
import com.einfoplanet.fragmentaddition.views.C_Fragment;

public class ThreeFragmentActivity extends AppCompatActivity implements FragmentAListerner, FragmentBListerner {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_fragment);
    }

    @Override
    public void getEditTextValueFromA(int etValue) {
        B_Fragment b_fragment = (B_Fragment) getSupportFragmentManager().findFragmentById(R.id.b_fragment);
        C_Fragment c_fragment = (C_Fragment) getSupportFragmentManager().findFragmentById(R.id.c_fragment);

        int addition = (b_fragment != null ? b_fragment.etInputedValue : 0) + etValue;

        if (c_fragment != null) {
            c_fragment.updateAddition(String.valueOf(addition));
        }
    }

    @Override
    public void getEditTextValueFromB(int etValue) {
        A_Fragment a_fragment = (A_Fragment) getSupportFragmentManager().findFragmentById(R.id.a_fragment);
        C_Fragment c_fragment = (C_Fragment) getSupportFragmentManager().findFragmentById(R.id.c_fragment);

        int addition = (a_fragment != null ? a_fragment.etInputedValue : 0) + etValue;

        if (c_fragment != null) {
            c_fragment.updateAddition(String.valueOf(addition));
        }
    }
}
