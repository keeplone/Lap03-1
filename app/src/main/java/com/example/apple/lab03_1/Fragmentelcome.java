package com.example.apple.lab03_1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmentelcome extends Fragment {

    final static String LAYOUT_ID = "layoutId";


    public Fragmentelcome() {
        // Required empty public constructor
    }

    public static Fragmentelcome newInstance(int layoutId) {
        
        Bundle args = new Bundle();
        
        Fragmentelcome fragment = new Fragmentelcome();
        Bundle bundle = new Bundle();
        bundle.putInt(LAYOUT_ID, layoutId);
        fragment.setArguments(bundle);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup root = (ViewGroup) inflater.inflate(getArguments().getInt(LAYOUT_ID, - 1),
                container, false);
        return root;
    }

}
