package org.fleni.cda.json.common;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.fleni.cda.json.mapper.report.ReportIntegration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
@ContextConfiguration(locations = { "classpath:/spring/spring-test-application-context.xml" })
public class ReportBuilderJsonTest extends AbstractTestNGSpringContextTests {

	@Test(enabled = false)
	public void convertObjectToJsonTest() {
		try {
			ReportIntegration reportIntegration = reportIntegrationFactory();

			Assert.assertNotNull(reportIntegration);
			
			String json = ReportBuilderJson.convertToJson(reportIntegration);
			
			Assert.assertNotNull(json);

		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(enabled = false)
	public void convertJsonToObjectTest() {
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream("src/test/resources/report/message.properties"));

			ReportIntegration reportIntegration = (ReportIntegration) ReportBuilderJson.convertJsonToObject(properties.getProperty("discharge"), ReportIntegration.class);

			Assert.assertNotNull(reportIntegration);

		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * @return
	 */
	public ReportIntegration reportIntegrationFactory() {
		
		// hce_informe_alta
		ReportIntegration.Document document = new ReportIntegration.Document();
		document.setId("200000000065FCBA");
		document.setVersion("1");
		document.setType("INF_ALTA"); // Constant
		document.setDateCreate("08/10/2015 09:48:21 a.m.");
		document.setConfidentialityCode("N"); // Constant
		
		// hce_episodio_clinico 
		ReportIntegration.Episode episode = new ReportIntegration.Episode();
		episode.setId("20000000006597F6");
		episode.setEpisodeNumber("150822");
		episode.setType("H");
		episode.setScope("H"); // Tipo Episodio
		episode.setDateAmission("12/06/2015 04:39:00 p.m.");
		episode.setDateDischarge(""); 
		episode.setDischargeDispositionCode(""); // Tipo de Alta
 		episode.setLocationCode("5_206_1"); 		
		episode.setLocationDescription("206"); // hce_ma_camas descripcion 
		
		// hce_historia_clinica
		ReportIntegration.Patient patient = new ReportIntegration.Patient();
		patient.setId("20000000006597F4");
		patient.setNumberDocument("74513545");
		patient.setTypeDocument("96");
		patient.setNhc("450083");
		patient.setTelephone("456464165");
		patient.setSurname("BACTERIOLOGIA");
		patient.setSurname2("");
		patient.setName("PACIENTE");
		patient.setName2("");
		patient.setSexType("H");
		patient.setBirthTime("10/06/1981");
		
		// hce_historia_clinica_r
		ReportIntegration.Address addressPatient = new ReportIntegration.Address();
		addressPatient.setStreetAddressLine("CALLE N° 10 PISO 10 DTO 12");
		addressPatient.setCity("1_2_0"); 
		addressPatient.setCountry("1"); // Cod de pais substring 1 state
		addressPatient.setCounty("");
 		addressPatient.setPostalCode("");
		addressPatient.setState("1_2");
		addressPatient.setAdditionalLocator("");	
		
		patient.setAddress(addressPatient);
		
		// hce_ma_centro
		ReportIntegration.Center center = new ReportIntegration.Center();
		center.setId("5");
		center.setSection("50010121"); // hce_episodio_clinico cod_seccion_alta o ingreso si es null
		center.setService("5001"); // hce_episodio_clinico cod_servicio_alta o ingreso si es null
		center.setSpeciality(""); // ???
		center.setSubspeciality(""); // ???
		center.setTelephone("");
		
		ReportIntegration.Address addressCenter = new ReportIntegration.Address();
		addressCenter.setStreetAddressLine(""); // ???
		addressCenter.setCity("");  // ???
		addressCenter.setCountry(""); // ???
		addressCenter.setCounty("");  // ???
		addressCenter.setPostalCode(""); // ???
		addressCenter.setState(""); // ???
		addressCenter.setAdditionalLocator("");	 // ???
		
		center.setAddress(addressCenter);
		
		// hce_usuario
		ReportIntegration.MedicalSigner medicalSigner = new ReportIntegration.MedicalSigner();
		medicalSigner.setNumberMatriculation("");  // num_matricula_n - num_matricula_p
		medicalSigner.setTypeMatriculation(""); // n nacional p - buenos aires 
		medicalSigner.setTelephone(""); 
		medicalSigner.setName("Prueba Tres");
		medicalSigner.setName2("");
		medicalSigner.setSurname("PRUEBA 3");
		medicalSigner.setSurname2("");
		medicalSigner.setSpeciality(""); // cod_uf
		medicalSigner.setSubspeciality(""); // cod_seccion
		
		ReportIntegration.HealthPlan healthPlan = new ReportIntegration.HealthPlan(); // cod_cmdb_financiador hce_episodio_clinico
		healthPlan.setCodeHealthPlan(""); 
		healthPlan.setCodeOrganization(""); 
		healthPlan.setNameAffiliate("PACIENTE"); // hce_historia_clinica
		healthPlan.setSurnameAffiliate("BACTERIOLOGIA"); // hce_historia_clinica
		healthPlan.setNameHealthPlan(""); 		
		healthPlan.setNameOrganization("PRIVADO"); 
		healthPlan.setNumberAffiliate(""); 
		
		// hce_informe_alta
		List<ReportIntegration.ClinicoContent> clinicoContents = clinicoContentFactory();
				
		return new ReportIntegration(document, patient, center, medicalSigner, healthPlan, episode, clinicoContents);
	}

	/**
	 * @return
	 */
	private List<ReportIntegration.ClinicoContent> clinicoContentFactory() {
		// hce_informe_alta
		List<ReportIntegration.ClinicoContent> clinicoContents = new ArrayList<ReportIntegration.ClinicoContent>();
		
		// 2.16.840.1.113883.2.10.24.1.2.1 MOTIVO DE INGRESO
		ReportIntegration.ClinicoContent incomeReason = new ReportIntegration.ClinicoContent();
		incomeReason.setSeccion(""); // Constant
		incomeReason.setDescription("Motivo de ingreso"); // motivo_ingreso
		clinicoContents.add(incomeReason);
		
		// 2.16.840.1.113883.2.10.24.1.2.2 DIAGNOSTICO PRESUNTIVO DE INGRESO
		ReportIntegration.ClinicoContent incomeDiagnosis = new ReportIntegration.ClinicoContent();
		incomeDiagnosis.setSeccion(""); // Constant
		incomeDiagnosis.setDescription("Estudios complementarios previos"); // exploracion
		clinicoContents.add(incomeDiagnosis);
		
		// 2.16.840.1.113883.2.10.24.1.2.3 ANTECEDENTES FAMILIARES
		ReportIntegration.ClinicoContent family = new ReportIntegration.ClinicoContent();
		family.setSeccion(""); // Constant
		family.setDescription("Familiares"); // familiares
		clinicoContents.add(family);
		
		// 2.16.840.1.113883.2.10.24.1.2.4 ANTECEDENTES PERSONALES
		ReportIntegration.ClinicoContent personal = new ReportIntegration.ClinicoContent();
		personal.setSeccion(""); // Constant
		personal.setDescription("Personales"); // Personales
		clinicoContents.add(personal);
		
		// 2.16.840.1.113883.2.10.24.1.2.5 HISTORIA DE LA ENFERMEDAD ACTUAL 
		ReportIntegration.ClinicoContent currentDisease = new ReportIntegration.ClinicoContent();
		currentDisease.setSeccion(""); // Constant
		currentDisease.setDescription("Enfermedad actual y datos positivos al examen físico"); // Anamnesis
		clinicoContents.add(currentDisease);
		
		// 2.16.840.1.113883.2.10.24.1.2.6 EXAMEN FISICO
		ReportIntegration.ClinicoContent physicalExamination = new ReportIntegration.ClinicoContent();
		physicalExamination.setSeccion(""); // Constant
		physicalExamination.setDescription("Enfermedad actual y datos positivos al examen físico"); // Anamnesis
		clinicoContents.add(physicalExamination);
		
		// 2.16.840.1.113883.2.10.24.1.2.7 CURSO CLINICO
		ReportIntegration.ClinicoContent clinicalCourse = new ReportIntegration.ClinicoContent();
		clinicalCourse.setSeccion(""); // Constant
		clinicalCourse.setDescription("Evolucion"); // evolucion
		clinicoContents.add(clinicalCourse);
		
		// 2.16.840.1.113883.2.10.24.1.2.8 DIAGNOSTICO DE EGRESO 
		ReportIntegration.ClinicoContent dischargeDiagnosis = new ReportIntegration.ClinicoContent();
		dischargeDiagnosis.setSeccion(""); // Constant
		dischargeDiagnosis.setDescription("Impresión Diagnóstica principal"); // jcprincipal
		clinicoContents.add(dischargeDiagnosis);
		
		// 2.16.840.1.113883.2.10.24.1.2.9 MEDICACION AL ALTA		
		ReportIntegration.ClinicoContent highMedication = new ReportIntegration.ClinicoContent();
		highMedication.setSeccion(""); // Constant
		highMedication.setDescription("Tratamiento"); // Tratamiento
		clinicoContents.add(highMedication);
		
		// 2.16.840.1.113883.2.10.24.1.2.10 INDICACIONES AL ALTA
		ReportIntegration.ClinicoContent highIndications = new ReportIntegration.ClinicoContent();
		highIndications.setSeccion(""); // Constant
		highIndications.setDescription("Indicaciones al Egreso"); // plan_terapeutico
		clinicoContents.add(highIndications);
		
		// 2.16.840.1.113883.2.10.24.1.2.11 ESTUDIOS COMPLEMENTARIOS 
		ReportIntegration.ClinicoContent furtherStudies = new ReportIntegration.ClinicoContent();
		furtherStudies.setSeccion(""); // Constant
		furtherStudies.setDescription("Estudios Complementarios"); // pruebas_complementarias
		clinicoContents.add(furtherStudies);
		
		// 2.16.840.1.113883.2.10.24.1.2.12 PLAN DE SEGUIMIENTO 
		ReportIntegration.ClinicoContent tracing = new ReportIntegration.ClinicoContent();
		tracing.setSeccion(""); // Constant
		tracing.setDescription("Plan de Seguimiento (Estudios y consultas al egreso)"); // revisiones
		clinicoContents.add(tracing);
		
		// 2.16.840.1.113883.2.10.24.1.2.13 PROCEDIMIENTOS/INTERVENCIONES 
		ReportIntegration.ClinicoContent process = new ReportIntegration.ClinicoContent();
		process.setSeccion(""); // Constant
		process.setDescription("Intervención Quirúrgica / Procedimientos"); // intervencion_quirurgica
		clinicoContents.add(process);
		
		// 2.16.840.1.113883.2.10.24.1.2.14 COMPLICACIONES 
		ReportIntegration.ClinicoContent complications = new ReportIntegration.ClinicoContent();
		complications.setSeccion(""); // Constant
		complications.setDescription(""); // ??? Parte quirurgico
		clinicoContents.add(complications);
		
		// 2.16.840.1.113883.2.10.24.1.2.15 DETALLE DE UBICACIONES 
		ReportIntegration.ClinicoContent detailLocations = new ReportIntegration.ClinicoContent();
		detailLocations.setSeccion(""); // Constant
		detailLocations.setDescription(""); // ??? Traslados hce_subepisodio armar tabla
		clinicoContents.add(detailLocations);
		
		// 2.16.840.1.113883.2.10.24.1.2.16 INFORMACION DEMOGRAFICA 
		ReportIntegration.ClinicoContent demographicInformation = new ReportIntegration.ClinicoContent();
		demographicInformation.setSeccion(""); // Constant
		demographicInformation.setDescription(""); // ??? NO tenemos pero habla de ocupacion del paciente/nivel de estudios
		clinicoContents.add(demographicInformation);
		
		return clinicoContents;
	}
}
