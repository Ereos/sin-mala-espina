package com.example.sinmalaespina;

import java.util.ArrayList;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class ListDetalleFragment extends Fragment {
	
	public ListDetalleFragment() {}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		View rootView = inflater.inflate(R.layout.fragment_listdetalle, container, false);		
		return rootView;
	}
	
	public void onActivityCreated (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		//Obtener datos de la base de datos
		ArrayList<String> bichos = new ArrayList<String>();
		bichos.add("Rodaballo");
		bichos.add("Ca–a al mono");
		bichos.add("O_O");
		
		ListView lista = (ListView) getActivity().findViewById(R.id.lvDetalle);
		lista.setAdapter(new AdaptadorLista(getActivity(), bichos));
		
		lista.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				
				Toast.makeText(getActivity(), "Has pulsado: "+ position, Toast.LENGTH_LONG).show();
				
			}
			
		});
				
			
		
		
	}
	

}
