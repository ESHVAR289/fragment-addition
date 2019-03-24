package com.einfoplanet.fragmentaddition.views;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.einfoplanet.fragmentaddition.BuildConfig;
import com.einfoplanet.fragmentaddition.R;
import com.einfoplanet.fragmentaddition.listeners.FragmentAListerner;

public class A_Fragment extends Fragment {
    private static final String TAG = A_Fragment.class.getSimpleName();

    private EditText mEditText;
    int etInputedValue;
    FragmentAListerner fragmentAListerner;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            fragmentAListerner = (FragmentAListerner) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement FragmentAListerner");
        }
    }

    //We get the reference to the editText and the button setUp the OnClickListener
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.a_fragment, container, false);

        mEditText = (EditText) view.findViewById(R.id.et_a_fragment);
        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    etInputedValue = Integer.parseInt(s.toString());
                    sendChangedDataToActivity(etInputedValue);
                } else {
                    etInputedValue = 0;
                    sendChangedDataToActivity(etInputedValue);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        return view;
    }

    //send changed edittext value in activity
    public void sendChangedDataToActivity(int etInputedValue) {
        if (BuildConfig.DEBUG)
            Log.e(TAG, "EditText value :-> " + etInputedValue);
        fragmentAListerner.getEditTextValueFromA(etInputedValue);
    }
}