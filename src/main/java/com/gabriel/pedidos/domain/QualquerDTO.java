package com.gabriel.pedidos.domain;

import java.util.Calendar;
import java.util.List;

import br.com.gabriel.conversor.interfaces.Converter;

public class QualquerDTO implements Converter<Qualquer, QualquerDTO> {
	
	private String qualquerString;
	private Integer qualquerIntegerWrap;
	private int qualquerIntegerPrimitive;
	private double qualquerDoublePrimitive;
	private Double qualquerDoubleWrap;
	private Calendar qualquerCalendar;
	private Categoria categoria = new Categoria(15, "Informatica");
	private List<String> qualquerLista;
	
	public String getQualquerString() {
		return qualquerString;
	}

	public void setQualquerString(String qualquerString) {
		this.qualquerString = qualquerString;
	}

	public Integer getQualquerIntegerWrap() {
		return qualquerIntegerWrap;
	}

	public void setQualquerIntegerWrap(Integer qualquerIntegerWrap) {
		this.qualquerIntegerWrap = qualquerIntegerWrap;
	}

	public int getQualquerIntegerPrimitive() {
		return qualquerIntegerPrimitive;
	}

	public void setQualquerIntegerPrimitive(int qualquerIntegerPrimitive) {
		this.qualquerIntegerPrimitive = qualquerIntegerPrimitive;
	}

	public double getQualquerDoublePrimitive() {
		return qualquerDoublePrimitive;
	}

	public void setQualquerDoublePrimitive(double qualquerDoublePrimitive) {
		this.qualquerDoublePrimitive = qualquerDoublePrimitive;
	}

	public Double getQualquerDoubleWrap() {
		return qualquerDoubleWrap;
	}

	public void setQualquerDoubleWrap(Double qualquerDoubleWrap) {
		this.qualquerDoubleWrap = qualquerDoubleWrap;
	}

	public Calendar getQualquerCalendar() {
		return qualquerCalendar;
	}

	public void setQualquerCalendar(Calendar qualquerCalendar) {
		this.qualquerCalendar = qualquerCalendar;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<String> getQualquerLista() {
		return qualquerLista;
	}

	public void setQualquerLista(List<String> qualquerLista) {
		this.qualquerLista = qualquerLista;
	}

	@Override
	public String toString() {
		return "QualquerDTO [qualquerString=" + qualquerString + ", qualquerIntegerWrap=" + qualquerIntegerWrap
				+ ", qualquerIntegerPrimitive=" + qualquerIntegerPrimitive + ", qualquerDoublePrimitive="
				+ qualquerDoublePrimitive + ", qualquerDoubleWrap=" + qualquerDoubleWrap + ", qualquerCalendar="
				+ qualquerCalendar + ", categoria=" + categoria + ", qualquerLista=" + qualquerLista + "]";
	}
	
	public static void main(String[] args) {

		Qualquer qualquer = new Qualquer();
		qualquer.setQualquerString("qualquer coisa");
		qualquer.setQualquerIntegerWrap(1536);
		qualquer.setQualquerIntegerPrimitive(1545);
		
		qualquer.setDadoTipoInteiroQueNaoTeraNoDTO(0);
		
		qualquer.setQualquerDoublePrimitive(156.36);
		qualquer.setQualquerDoubleWrap(187.99);
		qualquer.setQualquerCalendar(Calendar.getInstance());
		qualquer.setQualquerLista(List.of("Teste", "Teste 2"));
		
		qualquer.setDadoTipoTextoQueNaoTeraNoDTO("qualquer coisa");
		
		qualquer.setCategoria(new Categoria(null, "Informática"));
		
		qualquer.setDadoTipoCalendarQueNaoTeraNoDTO(Calendar.getInstance());
		
		QualquerDTO qualquerDTO = new QualquerDTO().from(qualquer);
		System.out.println(qualquerDTO);
	}

}
