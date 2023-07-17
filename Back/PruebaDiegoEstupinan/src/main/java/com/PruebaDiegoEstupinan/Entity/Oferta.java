package com.PruebaDiegoEstupinan.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


/**
 * The persistent class for the oferta database table.
 * 
 */
@Table(name = "oferta",schema = "prueba")
@Entity
//@NamedQuery(name="Oferta.findAll", query="SELECT o FROM Oferta o")
public class Oferta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="codigo_homologado")
	private String codigoHomologado;

	@Column(name="condicion_juridica")
	private Integer condicionJuridica;

	@Column(name="matricula_inmobiliaria")
	private String matriculaInmobiliaria;

	@Column(name="numero_predial_antiguo")
	private String numeroPredialAntiguo;

	@Column(name="numero_predial_nuevo")
	private String numeroPredialNuevo;

	@Column(name="origen_oferta")
	private Integer origenOferta;

	@Column(name="tipo_oferta")
	private Integer tipoOferta;

	@Column(name="tipo_predio")
	private Integer tipoPredio;

	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoHomologado() {
		return this.codigoHomologado;
	}

	public void setCodigoHomologado(String codigoHomologado) {
		this.codigoHomologado = codigoHomologado;
	}

	public Integer getCondicionJuridica() {
		return this.condicionJuridica;
	}

	public void setCondicionJuridica(Integer condicionJuridica) {
		this.condicionJuridica = condicionJuridica;
	}

	public String getMatriculaInmobiliaria() {
		return this.matriculaInmobiliaria;
	}

	public void setMatriculaInmobiliaria(String matriculaInmobiliaria) {
		this.matriculaInmobiliaria = matriculaInmobiliaria;
	}

	public String getNumeroPredialAntiguo() {
		return this.numeroPredialAntiguo;
	}

	public void setNumeroPredialAntiguo(String numeroPredialAntiguo) {
		this.numeroPredialAntiguo = numeroPredialAntiguo;
	}

	public String getNumeroPredialNuevo() {
		return this.numeroPredialNuevo;
	}

	public void setNumeroPredialNuevo(String numeroPredialNuevo) {
		this.numeroPredialNuevo = numeroPredialNuevo;
	}

	public Integer getOrigenOferta() {
		return this.origenOferta;
	}

	public void setOrigenOferta(Integer origenOferta) {
		this.origenOferta = origenOferta;
	}

	public Integer getTipoOferta() {
		return this.tipoOferta;
	}

	public void setTipoOferta(Integer tipoOferta) {
		this.tipoOferta = tipoOferta;
	}

	public Integer getTipoPredio() {
		return this.tipoPredio;
	}

	public void setTipoPredio(Integer tipoPredio) {
		this.tipoPredio = tipoPredio;
	}

}