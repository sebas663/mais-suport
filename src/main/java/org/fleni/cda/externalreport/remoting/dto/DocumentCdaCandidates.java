package org.fleni.cda.externalreport.remoting.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "documentCdaCandidates")
public class DocumentCdaCandidates {

	private String code;
	private String description;
	private List<String> cdaDocuments;
	private String linkImageStudy;
	
	/**
	 * 
	 */
	public DocumentCdaCandidates() {
		super();
	}

	/**
	 * @param code
	 * @param description
	 * @param cdaDocuments
	 */
	public DocumentCdaCandidates(String code, String description, List<String> cdaDocuments) {
		super();
		this.code = code;
		this.description = description;
		this.cdaDocuments = cdaDocuments;
	}
	/**
	 * @param code
	 * @param description
	 * @param linkImageStudy
	 */
	public DocumentCdaCandidates(String code, String description,String linkImageStudy) {
		super();
		this.code = code;
		this.description = description;
		this.linkImageStudy = linkImageStudy;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * @return the cdaDocuments
	 */
	public List<String> getCdaDocuments() {
		return cdaDocuments;
	}
	
	/**
	 * @param cdaDocuments the cdaDocuments to set
	 */
	public void setCdaDocuments(List<String> cdaDocuments) {
		this.cdaDocuments = cdaDocuments;
	}

	/**
	 * @return the linkImageStudy
	 */
	public String getLinkImageStudy() {
		return linkImageStudy;
	}

	/**
	 * @param linkImageStudy the linkImageStudy to set
	 */
	public void setLinkImageStudy(String linkImageStudy) {
		this.linkImageStudy = linkImageStudy;
	}
	
}
