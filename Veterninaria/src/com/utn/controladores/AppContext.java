package com.utn.controladores;

import com.utn.modelo.Animal;
import com.utn.modelo.Conejo;
import com.utn.modelo.Gato;
import com.utn.modelo.Perro;
import com.utn.modelo.TipoAnimal;

public class AppContext {

	public static Animal creoAnimal(TipoAnimal tipoAnimal, String nombre, int edad) {
		switch (tipoAnimal) {
		case PERRO:
			return new Perro(nombre, edad);
		case GATO:
			return new Gato(nombre, edad);
		case CONEJO:
			return new Conejo(nombre, edad);
		}
	return null;
	}

}
