package com.einfoplanet.fragmentaddition.views;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.einfoplanet.fragmentaddition.R;

public class C_Fragment extends Fragment {

    private TextView mTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.c_fragment, container, false);
        mTextView = (TextView) view.findViewById(R.id.txt_addition);
        return view;
    }

    public void updateAddition(String text) {
        mTextView.setText(text);
    }

}
