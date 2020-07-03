package com.indra.covid19.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.indra.covid19.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_provinsi extends Fragment {

    public fragment_provinsi() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_provinsi, container, false);
    }
}
