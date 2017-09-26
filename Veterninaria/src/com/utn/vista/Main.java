package com.utn.vista;

import com.utn.controladores.AppContext;
import com.utn.controladores.DoctorControladores;
import com.utn.modelo.Animal;
import com.utn.modelo.Conejo;
import com.utn.modelo.Doctor;
import com.utn.modelo.Informe;
import com.utn.modelo.Perro;
import com.utn.modelo.TipoAnimal;

public class Main {

	public static void main(String[] args) {

		Animal perro1 = AppContext.creoAnimal(TipoAnimal.PERRO, "Lazie", 5);
		Animal conejo1 = AppContext.creoAnimal(TipoAnimal.CONEJO, "Pascuas", 1);
		Animal gato1 = AppContext.creoAnimal(TipoAnimal.GATO, "Tom", 14);
		Animal perro2 = AppContext.creoAnimal(TipoAnimal.PERRO, "Pluto", 10);
		Animal perro3 = AppContext.creoAnimal(TipoAnimal.PERRO, "Moloko", 5);
		Animal gato2 = AppContext.creoAnimal(TipoAnimal.GATO, "Pipero", 13);
		Animal gato3 = AppContext.creoAnimal(TipoAnimal.GATO, "Pipero", 13);

		Doctor doc1 = new Doctor("Favaloro");
		Doctor doc2 = new Doctor("Videla");
		Doctor doc3 = new Doctor("Morelos");
		Doctor doc4 = new Doctor("Perales");
		Doctor doc5 = new Doctor("Merluza");
		
		
		System.out.println("===================Listado de médicos y sus pacientes=========================");
		DoctorControladores dc = new DoctorControladores();
		dc.asignarPacientes(doc1, perro1,  new Informe("perro enfermo","Comió huesos de pollo","Cefalexina"));
		dc.asignarPacientes(doc1, new Conejo("Buggs",5), new Informe("fiebre","corrio mucho","amoxicilina"));
		dc.asignarPacientes(doc1, perro1,  new Informe("gato enfermo","Comió atun","ibuprofeno"));
		dc.asignarPacientes(doc1, new Conejo("",5), new Informe("","",""));
		dc.asignarPacientes(doc1, perro1,  new Informe("perro enfermo","Comió huesos de pollo","Cefalexina"));
		dc.asignarPacientes(doc1, new Conejo("",5), new Informe("","",""));
		dc.asignarPacientes(doc1, perro1,  new Informe("perro enfermo","Comió huesos de pollo","Cefalexina"));
		dc.asignarPacientes(doc2, new Conejo("",5), new Informe("","",""));
		dc.asignarPacientes(doc2, perro1,  new Informe("perro enfermo","Comió huesos de pollo","Cefalexina"));
		dc.asignarPacientes(doc2, new Conejo("",5), new Informe("","",""));
		dc.asignarPacientes(doc2, perro1,  new Informe("perro enfermo","Comió huesos de pollo","Cefalexina"));

		dc.cantidadTotalPacientes();
		dc.cantidadPacientesMedico(doc1);
		dc.cantidadPacientesMedico(doc2);
		
	}

}
