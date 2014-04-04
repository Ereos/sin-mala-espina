package com.example.sinmalaespina;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ListGeneralFragment extends Fragment {
	
	public ListGeneralFragment(){}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_listgeneral, container, false);
		
		return rootView;
		
	}

}
