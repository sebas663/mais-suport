package org.fleni.cda.externalreport.remoting.utils;

public enum IdentifierDocumentCdaType {
	
	GENERATED_DOCUMENTS("DOCUMENTOS GENERADOS"),
	SET_DOCUMENTS("SET DE DOCUMENTOS"),
	NUMBER_CLINIC_HISTORY("NUMERO DE HISTORIA CLINICA INTERNA"),
	IDENTIFIER_SERVICE("IDENTIFICADOR DE SERVICIO O DEPARTAMENTO"),
	IDENTIFIER_SECTIONS("IDENTIFICADOR DE SECCION"),
	IDENTIFIER_PLANS("IDENTIFICADOR DE PLANES"),
	NUMBER_AFFILIATE("NUMEROS DE CARNET DE AFILIADOS"),
	IDENTIFIER_EPISODES("IDENTIFICADOR DE EPISODIOS");
	
	/**
	 * 
	 */
	private String value;
	
	/**
	 * @param value
	 */
	IdentifierDocumentCdaType(String value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
}
