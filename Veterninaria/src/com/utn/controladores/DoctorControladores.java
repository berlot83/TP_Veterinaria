package com.utn.controladores;

import com.utn.modelo.Animal;
import com.utn.modelo.Doctor;
import com.utn.modelo.Informe;

public class DoctorControladores {

	private int cantidadPacientes;
	private int pacientesTotales;

	public void asignarPacientes(Doctor doctor, Animal animal, Informe informe) {
		if (doctor.getCantidadPacientes() < 5 && pacientesTotales <= 20) {

			System.out.println("El doctor " + doctor.getNombre() + " atiende a la mascota de nombre: "
					+ animal.getNombre() + ", presentando las siguientes diagnosticos: " + informe.getCausa()
					+ ", para lo cual se le han recetado el siguiente medicamento: " + informe.getMedicamentos());
			
			doctor.setAnimal(animal);
			pacientesTotales++;

		} else {
			System.out.println("Ha llegado al límite de pacientes por médico");
		}
	}

	public void cantidadTotalPacientes() {
		System.out.println("====================================================================");
		System.out.println("La cantidad total de animales atendidos en la veterinaria fue: " + pacientesTotales);
		System.out.println("====================================================================");
	}
	
	public void cantidadPacientesMedico(Doctor doctor){
		System.out.println("Médico: "+doctor.getNombre()+", pacientes: "+doctor.getCantidadPacientes());
	}

}
