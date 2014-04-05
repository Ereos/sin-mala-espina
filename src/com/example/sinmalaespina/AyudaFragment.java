package com.example.sinmalaespina;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AyudaFragment extends Fragment {

	public AyudaFragment(){}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_ayuda, container, false);
		
		return rootView;
		
	}
}
