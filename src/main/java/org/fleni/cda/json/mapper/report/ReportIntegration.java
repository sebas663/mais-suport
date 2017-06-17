package org.fleni.cda.json.mapper.report;

import java.util.List;

public class ReportIntegration {
	
	/**
	 * Datos del Documento 
	 */
	private Document document;
	
	/**
	 * Datos del Paciente 
	 */
	private Patient patient;
	
	/**
	 * Organizacion Prestadora 
	 */
	private Center center;
	
	/**
	 * Datos del Autor del Documento
	 */
	private MedicalSigner medicalSigner;
	
	/**
	 * Numero de Afiliado y Cobertura 
	 */
	private HealthPlan healthPlan;
	
	/**
	 * Datos del Episodio
	 */
	private Episode episode;
	
	/**
	 * Contenido Clinico 
	 */
	private List<ClinicoContent> clinicoContents; 
	
	/**
	 * @param document
	 * @param patient
	 * @param center
	 * @param medicalSigner
	 * @param healthPlan
	 * @param episode
	 * @param clinicoContents
	 */
	public ReportIntegration(Document document, Patient patient, Center center, MedicalSigner medicalSigner,
			HealthPlan healthPlan, Episode episode, List<ClinicoContent> clinicoContents) {
		super();
		this.document = document;
		this.patient = patient;
		this.center = center;
		this.medicalSigner = medicalSigner;
		this.healthPlan = healthPlan;
		this.episode = episode;
		this.clinicoContents = clinicoContents;
	}

	/**
	 * @return the document
	 */
	public Document getDocument() {
		return document;
	}

	/**
	 * @param document the document to set
	 */
	public void setDocument(Document document) {
		this.document = document;
	}

	/**
	 * @return the patient
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * @param patient the patient to set
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	/**
	 * @return the center
	 */
	public Center getCenter() {
		return center;
	}

	/**
	 * @param center the center to set
	 */
	public void setCenter(Center center) {
		this.center = center;
	}

	/**
	 * @return the medicalSigner
	 */
	public MedicalSigner getMedicalSigner() {
		return medicalSigner;
	}

	/**
	 * @param medicalSigner the medicalSigner to set
	 */
	public void setMedicalSigner(MedicalSigner medicalSigner) {
		this.medicalSigner = medicalSigner;
	}

	/**
	 * @return the healthPlan
	 */
	public HealthPlan getHealthPlan() {
		return healthPlan;
	}

	/**
	 * @param healthPlan the healthPlan to set
	 */
	public void setHealthPlan(HealthPlan healthPlan) {
		this.healthPlan = healthPlan;
	}

	/**
	 * @return the episode
	 */
	public Episode getEpisode() {
		return episode;
	}

	/**
	 * @param episode the episode to set
	 */
	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	/**
	 * @return the clinicoContents
	 */
	public List<ClinicoContent> getClinicoContents() {
		return clinicoContents;
	}

	/**
	 * @param clinicoContents the clinicoContents to set
	 */
	public void setClinicoContents(List<ClinicoContent> clinicoContents) {
		this.clinicoContents = clinicoContents;
	}
	
	/**
	 *
	 */
	public static class Document {
		
		/**
		 *  Identificador unico del documento
		 */
		private String id;
		
		/**
		 * Tipo especifico de documento
		 */
		private String type;
		/**
		 * Tipo  de documento
		 */
		private String subtype;
		/**
		 * Tipo  de documento
		 */
		private String documentNumber;
		
		/**
		 * Version del Documento
		 */
		private String version;
		
		/**
		 * Fecha de Creacion del Documento 
		 */
		private String dateCreate;
		
		/**
		 * Codigo de Confidencialidad 	
		 */
		private String confidentialityCode;
		
		/**
		 * Nombre del Prestador del servicio de salud	
		 */
		private String healthProvider;
		
		/**
		 * Nombre del Sistema de Origen	
		 */
		private String sourceSystem;

		/**
		 * @return the id
		 */
		public String getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(String id) {
			this.id = id;
		}

		/**
		 * @return the type
		 */
		public String getType() {
			return type;
		}

		/**
		 * @param type the type to set
		 */
		public void setType(String type) {
			this.type = type;
		}

		/**
		 * @return the subtype
		 */
		public String getSubtype() {
			return subtype;
		}

		/**
		 * @param subtype the subtype to set
		 */
		public void setSubtype(String subtype) {
			this.subtype = subtype;
		}

		/**
		 * @return the documentNumber
		 */
		public String getDocumentNumber() {
			return documentNumber;
		}

		/**
		 * @param documentNumber the documentNumber to set
		 */
		public void setDocumentNumber(String documentNumber) {
			this.documentNumber = documentNumber;
		}

		/**
		 * @return the version
		 */
		public String getVersion() {
			return version;
		}

		/**
		 * @param version the version to set
		 */
		public void setVersion(String version) {
			this.version = version;
		}

		/**
		 * @return the dateCreate
		 */
		public String getDateCreate() {
			return dateCreate;
		}

		/**
		 * @param dateCreate the dateCreate to set
		 */
		public void setDateCreate(String dateCreate) {
			this.dateCreate = dateCreate;
		}

		/**
		 * @return the confidentialityCode
		 */
		public String getConfidentialityCode() {
			return confidentialityCode;
		}

		/**
		 * @param confidentialityCode the confidentialityCode to set
		 */
		public void setConfidentialityCode(String confidentialityCode) {
			this.confidentialityCode = confidentialityCode;
		}

		/**
		 * @return the healthProvider
		 */
		public String getHealthProvider() {
			return healthProvider;
		}

		/**
		 * @param healthProvider the healthProvider to set
		 */
		public void setHealthProvider(String healthProvider) {
			this.healthProvider = healthProvider;
		}

		/**
		 * @return the sourceSystem
		 */
		public String getSourceSystem() {
			return sourceSystem;
		}

		/**
		 * @param sourceSystem the sourceSystem to set
		 */
		public void setSourceSystem(String sourceSystem) {
			this.sourceSystem = sourceSystem;
		}
		
	}
	
	/**
	 *
	 */
	public static class Center {
		
		/**
		 * Identificador unico del Centro de Atencion
		 */
		private String id;
		
		/**
		 * Seccion
		 */
		private String section;
		
		/**
		 * Departamento o Servicio 
		 */
		private String service;
		
		/**
		 * Especialidad
		 */
		private String speciality;
		
		/**
		 * Sub-Especialidad		
		 */
		private String subspeciality;
		
		/**
		 * Telefono del Centro de Atencion 
		 */
		private String telephone;
		
		/**
		 * Direccion del Centro de Atencion 
		 */
		private Address address;

		/**
		 * @return the id
		 */
		public String getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(String id) {
			this.id = id;
		}

		/**
		 * @return the section
		 */
		public String getSection() {
			return section;
		}

		/**
		 * @param section the section to set
		 */
		public void setSection(String section) {
			this.section = section;
		}

		/**
		 * @return the service
		 */
		public String getService() {
			return service;
		}

		/**
		 * @param service the service to set
		 */
		public void setService(String service) {
			this.service = service;
		}

		/**
		 * @return the speciality
		 */
		public String getSpeciality() {
			return speciality;
		}

		/**
		 * @param speciality the speciality to set
		 */
		public void setSpeciality(String speciality) {
			this.speciality = speciality;
		}

		/**
		 * @return the subspeciality
		 */
		public String getSubspeciality() {
			return subspeciality;
		}

		/**
		 * @param subspeciality the subspeciality to set
		 */
		public void setSubspeciality(String subspeciality) {
			this.subspeciality = subspeciality;
		}

		/**
		 * @return the telephone
		 */
		public String getTelephone() {
			return telephone;
		}

		/**
		 * @param telephone the telephone to set
		 */
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}

		/**
		 * @return the address
		 */
		public Address getAddress() {
			return address;
		}

		/**
		 * @param address the address to set
		 */
		public void setAddress(Address address) {
			this.address = address;
		}
	
	}
	
	/**
	 *
	 */
	public static class Patient {
		
		/**
		 * Identificador unico de Paciente
		 */
		private String id;
		
		/**
		 * Numero de Historia Clinica 
		 */
		private String nhc;
		
		/**
		 * Tipo de Documento
		 */
		private String typeDocument;
		
		/**
		 * Numero de Documento
		 */
		private String numberDocument;	
		
		/**
		 * Domicilio del Paciente
		 */
		private Address address;
		
		/**
		 * Telefono del Paciente 
		 */
		private String telephone;
		
		/**
		 * Primer Apellido	
		 */
		private String surname;
		
		/**
		 * Segundo Apellido	
		 */
		private String surname2;
		
		/**
		 * Primer Nombre	
		 */
		private String name;
		
		/**
		 * Segundo Nombre	
		 */
		private String name2;
		
		/**
		 * Sexo
		 */
		private String sexType;
		
		/**
		 * Fecha de Nacimiento 	
		 */
		private String birthTime;

		/**
		 * @return the id
		 */
		public String getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(String id) {
			this.id = id;
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
		 * @return the typeDocument
		 */
		public String getTypeDocument() {
			return typeDocument;
		}

		/**
		 * @param typeDocument the typeDocument to set
		 */
		public void setTypeDocument(String typeDocument) {
			this.typeDocument = typeDocument;
		}

		/**
		 * @return the numberDocument
		 */
		public String getNumberDocument() {
			return numberDocument;
		}

		/**
		 * @param numberDocument the numberDocument to set
		 */
		public void setNumberDocument(String numberDocument) {
			this.numberDocument = numberDocument;
		}

		/**
		 * @return the address
		 */
		public Address getAddress() {
			return address;
		}

		/**
		 * @param address the address to set
		 */
		public void setAddress(Address address) {
			this.address = address;
		}

		/**
		 * @return the telephone
		 */
		public String getTelephone() {
			return telephone;
		}

		/**
		 * @param telephone the telephone to set
		 */
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}

		/**
		 * @return the surname
		 */
		public String getSurname() {
			return surname;
		}

		/**
		 * @param surname the surname to set
		 */
		public void setSurname(String surname) {
			this.surname = surname;
		}

		/**
		 * @return the surname2
		 */
		public String getSurname2() {
			return surname2;
		}

		/**
		 * @param surname2 the surname2 to set
		 */
		public void setSurname2(String surname2) {
			this.surname2 = surname2;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the name2
		 */
		public String getName2() {
			return name2;
		}

		/**
		 * @param name2 the name2 to set
		 */
		public void setName2(String name2) {
			this.name2 = name2;
		}

		/**
		 * @return the sexType
		 */
		public String getSexType() {
			return sexType;
		}

		/**
		 * @param sexType the sexType to set
		 */
		public void setSexType(String sexType) {
			this.sexType = sexType;
		}

		/**
		 * @return the birthTime
		 */
		public String getBirthTime() {
			return birthTime;
		}

		/**
		 * @param birthTime the birthTime to set
		 */
		public void setBirthTime(String birthTime) {
			this.birthTime = birthTime;
		}
	}
	
	/**
	 *
	 */
	public static class Episode {
		
		/**
		 * Identificador unico del Episodio
		 */
		private String id;
		
		/**
		 * Numero de Episodio
		 */
		private String episodeNumber;
		
		/**
		 * Tipo de Episodio	 
		 */
		private String type;
		
		/**
		 * Ambito de Episodio
		 */
		private String scope;
		
		/**
		 * Fecha de Ingreso
		 */
		private String dateAmission;
		
		/**
		 * Fecha de Alta 
		 */
		private String dateDischarge;
		
		/**
		 * Condicion de Egreso 
		 */
		private String dischargeDispositionCode;		
		
		/**
		 * Codigo de la Ubicacion al Alta
		 */
		private String locationCode;
		
		/**
		 * Descripcion de la Ubicacion al Alta
		 */
		private String locationDescription;

		/**
		 * @return the id
		 */
		public String getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(String id) {
			this.id = id;
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
		 * @return the type
		 */
		public String getType() {
			return type;
		}

		/**
		 * @param type the type to set
		 */
		public void setType(String type) {
			this.type = type;
		}

		/**
		 * @return the scope
		 */
		public String getScope() {
			return scope;
		}

		/**
		 * @param scope the scope to set
		 */
		public void setScope(String scope) {
			this.scope = scope;
		}

		/**
		 * @return the dateAmission
		 */
		public String getDateAmission() {
			return dateAmission;
		}

		/**
		 * @param dateAmission the dateAmission to set
		 */
		public void setDateAmission(String dateAmission) {
			this.dateAmission = dateAmission;
		}

		/**
		 * @return the dateDischarge
		 */
		public String getDateDischarge() {
			return dateDischarge;
		}

		/**
		 * @param dateDischarge the dateDischarge to set
		 */
		public void setDateDischarge(String dateDischarge) {
			this.dateDischarge = dateDischarge;
		}

		/**
		 * @return the dischargeDispositionCode
		 */
		public String getDischargeDispositionCode() {
			return dischargeDispositionCode;
		}

		/**
		 * @param dischargeDispositionCode the dischargeDispositionCode to set
		 */
		public void setDischargeDispositionCode(String dischargeDispositionCode) {
			this.dischargeDispositionCode = dischargeDispositionCode;
		}

		/**
		 * @return the locationCode
		 */
		public String getLocationCode() {
			return locationCode;
		}

		/**
		 * @param locationCode the locationCode to set
		 */
		public void setLocationCode(String locationCode) {
			this.locationCode = locationCode;
		}

		/**
		 * @return the locationDescription
		 */
		public String getLocationDescription() {
			return locationDescription;
		}

		/**
		 * @param locationDescription the locationDescription to set
		 */
		public void setLocationDescription(String locationDescription) {
			this.locationDescription = locationDescription;
		}
		
		
	}
	
	/**
	 *
	 */
	public static class MedicalSigner {
		
		/**
		 * Tipo de Matricula del Medico
		 */
		private String typeMatriculation;
		
		/**
		 * Numero de Matricula del Medico
		 */
		private String numberMatriculation;
		
		/**
		 * Especialidad
		 */
		private String speciality;
		
		/**
		 * Sub-Especialidad		
		 */
		private String subspeciality;
		
		/**
		 * Telefono del Paciente 
		 */
		private String telephone;
		
		/**
		 * Primer Apellido	
		 */
		private String surname;
		
		/**
		 * Segundo Apellido	
		 */
		private String surname2;
		
		/**
		 * Primer Nombre	
		 */
		private String name;
		
		/**
		 * Segundo Nombre	
		 */
		private String name2;

		/**
		 * @return the typeMatriculation
		 */
		public String getTypeMatriculation() {
			return typeMatriculation;
		}

		/**
		 * @param typeMatriculation the typeMatriculation to set
		 */
		public void setTypeMatriculation(String typeMatriculation) {
			this.typeMatriculation = typeMatriculation;
		}

		/**
		 * @return the numberMatriculation
		 */
		public String getNumberMatriculation() {
			return numberMatriculation;
		}

		/**
		 * @param numberMatriculation the numberMatriculation to set
		 */
		public void setNumberMatriculation(String numberMatriculation) {
			this.numberMatriculation = numberMatriculation;
		}

		/**
		 * @return the speciality
		 */
		public String getSpeciality() {
			return speciality;
		}

		/**
		 * @param speciality the speciality to set
		 */
		public void setSpeciality(String speciality) {
			this.speciality = speciality;
		}

		/**
		 * @return the subspeciality
		 */
		public String getSubspeciality() {
			return subspeciality;
		}

		/**
		 * @param subspeciality the subspeciality to set
		 */
		public void setSubspeciality(String subspeciality) {
			this.subspeciality = subspeciality;
		}

		/**
		 * @return the telephone
		 */
		public String getTelephone() {
			return telephone;
		}

		/**
		 * @param telephone the telephone to set
		 */
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}

		/**
		 * @return the surname
		 */
		public String getSurname() {
			return surname;
		}

		/**
		 * @param surname the surname to set
		 */
		public void setSurname(String surname) {
			this.surname = surname;
		}

		/**
		 * @return the surname2
		 */
		public String getSurname2() {
			return surname2;
		}

		/**
		 * @param surname2 the surname2 to set
		 */
		public void setSurname2(String surname2) {
			this.surname2 = surname2;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the name2
		 */
		public String getName2() {
			return name2;
		}

		/**
		 * @param name2 the name2 to set
		 */
		public void setName2(String name2) {
			this.name2 = name2;
		}
	}
	
	/**
	 *
	 */
	public static class HealthPlan {
		
		/**
		 * Número de Afiliado	
		 */
		private String numberAffiliate;
		
		/**
		 * Apellidos del Titular 
		 */
		private String surnameAffiliate;
		
		/**
		 * Nombres del Titular
		 */
		private String nameAffiliate;
		
		/**
		 * Codigo del Plan de Salud 
		 */
		private String codeHealthPlan;
		
		/**
		 * Nombre del Plan de Salud 
		 */
		private String nameHealthPlan;
		
		/**
		 * Codigo del Financiador
		 */
		private String codeOrganization;
		
		/**
		 * Nombre del Financiador
		 */
		private String nameOrganization;

		/**
		 * @return the numberAffiliate
		 */
		public String getNumberAffiliate() {
			return numberAffiliate;
		}

		/**
		 * @param numberAffiliate the numberAffiliate to set
		 */
		public void setNumberAffiliate(String numberAffiliate) {
			this.numberAffiliate = numberAffiliate;
		}

		/**
		 * @return the surnameAffiliate
		 */
		public String getSurnameAffiliate() {
			return surnameAffiliate;
		}

		/**
		 * @param surnameAffiliate the surnameAffiliate to set
		 */
		public void setSurnameAffiliate(String surnameAffiliate) {
			this.surnameAffiliate = surnameAffiliate;
		}

		/**
		 * @return the nameAffiliate
		 */
		public String getNameAffiliate() {
			return nameAffiliate;
		}

		/**
		 * @param nameAffiliate the nameAffiliate to set
		 */
		public void setNameAffiliate(String nameAffiliate) {
			this.nameAffiliate = nameAffiliate;
		}

		/**
		 * @return the codeHealthPlan
		 */
		public String getCodeHealthPlan() {
			return codeHealthPlan;
		}

		/**
		 * @param codeHealthPlan the codeHealthPlan to set
		 */
		public void setCodeHealthPlan(String codeHealthPlan) {
			this.codeHealthPlan = codeHealthPlan;
		}

		/**
		 * @return the nameHealthPlan
		 */
		public String getNameHealthPlan() {
			return nameHealthPlan;
		}

		/**
		 * @param nameHealthPlan the nameHealthPlan to set
		 */
		public void setNameHealthPlan(String nameHealthPlan) {
			this.nameHealthPlan = nameHealthPlan;
		}

		/**
		 * @return the codeOrganization
		 */
		public String getCodeOrganization() {
			return codeOrganization;
		}

		/**
		 * @param codeOrganization the codeOrganization to set
		 */
		public void setCodeOrganization(String codeOrganization) {
			this.codeOrganization = codeOrganization;
		}

		/**
		 * @return the nameOrganization
		 */
		public String getNameOrganization() {
			return nameOrganization;
		}

		/**
		 * @param nameOrganization the nameOrganization to set
		 */
		public void setNameOrganization(String nameOrganization) {
			this.nameOrganization = nameOrganization;
		}
		
	}
	
	/**
	 *
	 */
	public static class Address {
		
		/**
		 * Domicilio (Calle/Nro/Depto)
		 */
		private String streetAddressLine;
		
		/**
		 * Ciudad
		 */
		private String city;
		
		/**
		 * Provincia
		 */
		private String state;
		
		/**
		 * Codigo Postal	
		 */
		private String postalCode;
		
		/**
		 * Pais		
		 */
		private String country;
		
		/**
		 * Partido
		 */
		private String county;
		
		/**
		 * Departamento
		 */
		private String additionalLocator;

		/**
		 * @return the streetAddressLine
		 */
		public String getStreetAddressLine() {
			return streetAddressLine;
		}

		/**
		 * @param streetAddressLine the streetAddressLine to set
		 */
		public void setStreetAddressLine(String streetAddressLine) {
			this.streetAddressLine = streetAddressLine;
		}

		/**
		 * @return the city
		 */
		public String getCity() {
			return city;
		}

		/**
		 * @param city the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}

		/**
		 * @return the state
		 */
		public String getState() {
			return state;
		}

		/**
		 * @param state the state to set
		 */
		public void setState(String state) {
			this.state = state;
		}

		/**
		 * @return the postalCode
		 */
		public String getPostalCode() {
			return postalCode;
		}

		/**
		 * @param postalCode the postalCode to set
		 */
		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}

		/**
		 * @return the country
		 */
		public String getCountry() {
			return country;
		}

		/**
		 * @param country the country to set
		 */
		public void setCountry(String country) {
			this.country = country;
		}

		/**
		 * @return the county
		 */
		public String getCounty() {
			return county;
		}

		/**
		 * @param county the county to set
		 */
		public void setCounty(String county) {
			this.county = county;
		}

		/**
		 * @return the additionalLocator
		 */
		public String getAdditionalLocator() {
			return additionalLocator;
		}

		/**
		 * @param additionalLocator the additionalLocator to set
		 */
		public void setAdditionalLocator(String additionalLocator) {
			this.additionalLocator = additionalLocator;
		}
	}
	
	/**
	 *
	 */
	public static class ClinicoContent {
		
		/**
		 * Seccion 
		 */
		private String seccion;		
		
		/**
		 * Texto Narrativo correspondiente al contenido clinico del paciente
		 */
		private String description;

		/**
		 * @return the seccion
		 */
		public String getSeccion() {
			return seccion;
		}

		/**
		 * @param seccion the seccion to set
		 */
		public void setSeccion(String seccion) {
			this.seccion = seccion;
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
	}

}
