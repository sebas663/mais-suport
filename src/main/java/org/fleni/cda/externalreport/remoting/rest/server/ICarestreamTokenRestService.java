package org.fleni.cda.externalreport.remoting.rest.server;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.conn.ConnectTimeoutException;

public interface ICarestreamTokenRestService {
	/**
	 * 
	 * @param nestudio
	 * @return
	 * @throws Exception
	 */
	String getLinkPacks(String nestudio) throws UnsupportedEncodingException, ConnectTimeoutException, IOException;
}
