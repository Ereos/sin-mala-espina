package com.example.sinmalaespina;

import java.util.ArrayList;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class ListGeneralFragment extends Fragment {
	
	public ListGeneralFragment(){}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		View rootView = inflater.inflate(R.layout.fragment_listgeneral, container, false);		
		return rootView;
	}
	
	public void onActivityCreated (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		//Obtener datos de la base de datos
		ArrayList<String> tipos = new ArrayList<String>();
		tipos.add("Pez");
		tipos.add("Crustaceo");
		tipos.add("Molusco");
		
		ListView lista = (ListView) getActivity().findViewById(R.id.lvListaGeneral);
		lista.setAdapter(new AdaptadorLista(getActivity(), tipos));
		
		lista.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				
				Fragment fragment = null;
		    	fragment = new ListDetalleFragment();
		    	
		         FragmentManager fragmentManager = getFragmentManager();
		         fragmentManager.beginTransaction().replace(R.id.container, fragment).commit();
			}
		});
	}
}
