package com.example.sinmalaespina;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AnimalFragment extends Fragment {
	
	public AnimalFragment(){
	}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_animal, container, false);
		
		return rootView;
		
	}

}
