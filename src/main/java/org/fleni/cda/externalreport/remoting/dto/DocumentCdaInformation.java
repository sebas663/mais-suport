package org.fleni.cda.externalreport.remoting.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "documentCdaInformation")
public class DocumentCdaInformation {
	
	private String documentId;
	private String documentName;
	private String nhc;
	private String episodeNumber;
	private String fromDate;
	private String toDate;
	
	/**
	 * 
	 */
	public DocumentCdaInformation() {
		super();
	}

	/**
	 * 
	 * @param documentId
	 * @param documentName
	 * @param nhc
	 * @param episodeNumber
	 * @param sinseDate
	 * @param untilDate
	 */
	public DocumentCdaInformation(String documentId, String documentName, String nhc, String episodeNumber,
			String fromDate, String toDate) {
		super();
		this.documentId = documentId;
		this.documentName = documentName;
		this.nhc = nhc;
		this.episodeNumber = episodeNumber;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}


	/**
	 * @return the documentId
	 */
	public String getDocumentId() {
		return documentId;
	}

	

	
	/**
	 * @param documentId the documentId to set
	 */
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	/**
	 * @return the documentName
	 */
	public String getDocumentName() {
		return documentName;
	}

	/**
	 * @param documentName the documentName to set
	 */
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	/**
	 * @return the nhc
	 */
	public String getNhc() {
		return nhc;
	}

	/**
	 * @param nhc the nhc to set
	 */
	public void setNhc(String nhc) {
		this.nhc = nhc;
	}

	/**
	 * @return the episodeNumber
	 */
	public String getEpisodeNumber() {
		return episodeNumber;
	}

	/**
	 * @param episodeNumber the episodeNumber to set
	 */
	public void setEpisodeNumber(String episodeNumber) {
		this.episodeNumber = episodeNumber;
	}

	/**
	 * @return the fromDate
	 */
	public String getFromDate() {
		return fromDate;
	}

	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * @return the toDate
	 */
	public String getToDate() {
		return toDate;
	}

	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
}
