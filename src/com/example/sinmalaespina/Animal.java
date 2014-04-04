package com.example.sinmalaespina;

public class Animal {
	int[] tipo;
	String[] descripcion;
	String nombre;
	String n_cientifico;
	String categoria;
	String imagen;
	
	//Método constructor de la clase Animal
	
	public Animal(int[] tipo, String[] descripcion, String nombre,
			String n_cientifico, String categoria) {
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.n_cientifico = n_cientifico;
		this.categoria = categoria;
		String[] aux = imagen.split(" ");
		String n = "";
		for (int i = 0; i < aux.length; i++) {
				n = n+aux[i];
		}
		this.imagen = n;
	}

	public Animal() {
		this.tipo = null;
		this.descripcion = null;
		this.nombre = null;
		this.n_cientifico = null;
		this.categoria = null;
		this.imagen = null;
	}

	//MŽtodos get y set de la clase Animal

	public int[] getTipo() {
		return tipo;
	}

	public void setTipo(int[] tipo) {
		this.tipo = tipo;
	}

	public String[] getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String[] descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getN_cientifico() {
		return n_cientifico;
	}

	public void setN_cientifico(String n_cientifico) {
		this.n_cientifico = n_cientifico;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getImagen() {
		return imagen;
	}
	
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
}
