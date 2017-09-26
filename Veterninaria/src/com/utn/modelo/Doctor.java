package com.utn.modelo;

public class Doctor {
	private String nombre;
	private int cantidadPacientes;
	private Animal[] animal = new Animal[6];

			public Doctor(String nombre) {
				this.nombre = nombre;
			}
		
			public String getNombre() {
				return nombre;
			}
		
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
		
			public int getCantidadPacientes() {
				return cantidadPacientes;
			}
		
			public void setCantidadPacientes(int cantidadPacientes) {
				this.cantidadPacientes = cantidadPacientes;
			}

			public Animal[] getAnimal() {
				return animal;
			}

			public void setAnimal(Animal animal) {
				this.animal[cantidadPacientes++] = animal;
			}
}
