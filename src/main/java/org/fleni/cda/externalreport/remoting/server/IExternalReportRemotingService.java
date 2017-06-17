package org.fleni.cda.externalreport.remoting.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.fleni.cda.externalreport.remoting.dto.ExternalReportInformation;
import org.fleni.cda.externalreport.remoting.dto.ExternalReportResponse;

@WebService
public interface IExternalReportRemotingService {

	/**
	 * @param externalReportInformation
	 * @return
	 */
	@WebMethod
	ExternalReportResponse createReportInformation(ExternalReportInformation externalReportInformation);
}
