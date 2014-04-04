package com.example.sinmalaespina;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter_Descripciones extends BaseAdapter{	
	Activity activity;
	ArrayList<Animal> animal = new ArrayList<Animal>();

	public Adapter_Descripciones(Activity activity, ArrayList<Animal> animal) {
		super();
		this.activity = activity;
		this.animal = animal;
	}

	@Override
	public int getCount() {
		return animal.size();
	}

	@Override
	public Object getItem(int position) {
		return animal.get(position);
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = convertView;
		ViewHolder holder;
		if (convertView==null){
			LayoutInflater inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = inflater.inflate(R.layout.fragment_animal, null);
			
			holder= new ViewHolder();
			holder.ivTipo = (ImageView)view.findViewById(R.id.ivImagen);
			holder.tvDescripcion = (TextView)view.findViewById(R.id.tvDescripcion);	
			
			view.setTag(holder);
			
		}else {
			holder = (ViewHolder)view.getTag();
		}
		
		final Animal item = animal.get(position);
		
		holder.ivTipo.setImageResource(item.getIdFotoMini());
		holder.tvDescripcion.setText(item.getDescripcion());	
		
		return view;
	}
	
	private class ViewHolder {
		ImageView ivTipo;
		TextView tvDescripcion;
	}
}
