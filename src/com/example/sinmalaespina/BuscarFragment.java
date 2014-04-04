package com.example.sinmalaespina;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BuscarFragment extends Fragment{
	
	public BuscarFragment(){}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_buscar, container, false);
		
		return rootView;
		
	}
	

}
