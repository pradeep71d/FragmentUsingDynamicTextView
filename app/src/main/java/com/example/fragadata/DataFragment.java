package com.example.fragadata;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DataFragment extends Fragment {

    LinearLayout linearLayout;
    public DataFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_data, container, false);
        TextView textView1=new TextView(getActivity());
        TextView textView2=new TextView(getActivity());
        linearLayout=view.findViewById(R.id.l1);
        linearLayout.addView(textView1);
        linearLayout.addView(textView2);
        Bundle bundle=getArguments();
        String s3=bundle.getString("key1");
        String s4=bundle.getString("key2");
        textView1.setText(s3);
        textView2.setText(s4);
        return view;
    }

}
