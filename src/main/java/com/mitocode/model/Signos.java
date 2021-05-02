package com.mitocode.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="signos")
public class Signos {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSignos;
	
	@ManyToOne
	@JoinColumn(name="id_Paciente", nullable=false, foreignKey = @ForeignKey(name="FK_signos_paciente"))
	private Paciente paciente;
	
	@Column(name="temperatura", nullable=false, length = 5)
	private String Temperatura;
	
	@Column(name="pulso", nullable=false, length = 5)
	private String pulso;
	
	@Column(name="ritmo", nullable=false, length = 5)
	private String ritmo;
	
	@Column(name="fecha", nullable=false)
	private LocalDateTime fecha;

	public int getIdSignos() {
		return idSignos;
	}

	public void setIdSignos(int idSignos) {
		this.idSignos = idSignos;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getTemperatura() {
		return Temperatura;
	}

	public void setTemperatura(String temperatura) {
		Temperatura = temperatura;
	}

	public String getPulso() {
		return pulso;
	}

	public void setPulso(String pulso) {
		this.pulso = pulso;
	}

	public String getRitmo() {
		return ritmo;
	}

	public void setRitmo(String ritmo) {
		this.ritmo = ritmo; 
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	
	
	
}
