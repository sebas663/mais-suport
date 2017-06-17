package org.fleni.cda.externalreport.remoting.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.fleni.cda.externalreport.remoting.dto.DocumentCdaCandidates;
import org.fleni.cda.externalreport.remoting.dto.DocumentCdaInformation;

@WebService
public interface IDocumentCdaRemotingService {

	/**
	 * @param documentCdaInformation
	 * @return
	 */
	@WebMethod
	DocumentCdaCandidates findDocumentCda(DocumentCdaInformation documentCdaInformation);
	/**
	 * @param documentCdaInformation
	 * @return
	 */
	@WebMethod
	DocumentCdaCandidates getLinkImageStudy(String studyNumber);
}
