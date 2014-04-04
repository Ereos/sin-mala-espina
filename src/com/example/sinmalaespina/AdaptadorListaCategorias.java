package com.example.sinmalaespina;

import java.util.ArrayList;

import com.example.sinmalaespina.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Clase que se encarga de generar los compoenentes de la lista con
 * dos valores
 *
 */
public class AdaptadorListaCategorias extends BaseAdapter {
	Activity activity;
	int numApartado;
	ArrayList<String> arrayDatos;

	public AdaptadorListaCategorias(Activity activity, ArrayList<String> arrayDatos) {
		super();
		this.activity = activity;
		this.arrayDatos = arrayDatos;
	}

	public int getCount() {


		return arrayDatos.size();
	}

	public Object getItem(int position) {
		return arrayDatos.get(position);
	}

	public long getItemId(int position) {
		return 0;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		View view = convertView;
		ViewHolder holder;
		if (convertView==null){
			LayoutInflater inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = inflater.inflate(R.layout.lista_general, null);

			holder= new ViewHolder();
			holder.tvColumA = (TextView)view.findViewById(R.id.tvListaGeneral);

			view.setTag(holder);

		}else {
			holder = (ViewHolder)view.getTag();
		}

		holder.tvColumA.setText(arrayDatos.get(position));

		return view;
	}

	private class ViewHolder {
		TextView tvColumA;
	}
}
