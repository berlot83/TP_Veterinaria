package com.utn.modelo;

public class Informe {

	private String resultado;
	private String causa;
	private String medicamentos;
			
			public Informe(String resultado, String causa, String medicamentos) {
				this.resultado = resultado;
				this.causa = causa;
				this.medicamentos = medicamentos;
			}
		
			public String getResultado() {
				return resultado;
			}
		
			public void setResultado(String resultado) {
				this.resultado = resultado;
			}
		
			public String getCausa() {
				return causa;
			}
		
			public void setCausa(String causas) {
				this.causa = causas;
			}
		
			public String getMedicamentos() {
				return medicamentos;
			}
		
			public void setMedicamentos(String medicamentos) {
				this.medicamentos = medicamentos;
			}

}
