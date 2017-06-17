package org.fleni.cda.externalreport.remoting.rest.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
@Component("carestreamTokenRestService")
public class CarestreamTokenRestService implements ICarestreamTokenRestService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CarestreamTokenRestService.class);
	/**
	 * 
	 */
	@Value("${endpoint.carestream}")
	private String endPoint;
	/**
	 * 
	 */
	@Value("${link.mis.imagenes}")
	private String linkMisImagenes;
	/**
	 * 
	 */
	@Value("${query.string.to.encrypt}")
	private String queryStringToEncrypt;
	/**
	 * 
	 */
	@Value("${timeout.request.mis.imagenes}")
	private String timeoutRequest;
	/**
	 * constructor without argument
	 * 
	 */
	public CarestreamTokenRestService() {
	}
	/**
	 * constructor with 3 argument(s)
	 * 
	 * @param user_name
	 * @param password
	 */
	public CarestreamTokenRestService(String endPoint) {
		this.endPoint = endPoint;
	}
	/**
	 * 
	 * @param queryStringToEncrypt
	 * @return
	 * @throws Exception
	 */
	public String encryptQueryString(String queryStringToEncrypt) throws Exception {
		String response = this.doPostCall(endPoint, queryStringToEncrypt);
		return response;

	}
	/**
	 * 
	 * @param radiologiaBean
	 * @return
	 * @throws Exception 
	 */
	public String getLinkPacks(String accession_number) 
			throws UnsupportedEncodingException, ConnectTimeoutException, IOException{
   	    String query = queryStringToEncrypt.replace("#accession_number#", accession_number);
   	    String link = linkMisImagenes;
        String token = this.doPostCall(endPoint, query);
        link += token;
        if(token.equals("")){
        	link = "";
        }
		return link;		
	}

	/**
	 * Class for placing a POST call
	 * 
	 * @param urlString
	 *            the URL as a String value
	 * @param postArgs
	 *            the POST arguments as a URL-encoded String
	 * @return the response of the call as a String
	 * @throws Exception
	 */
	private String doPostCall(String urlString, String queryStringToEncrypt)
			throws UnsupportedEncodingException, ConnectTimeoutException, IOException {
		String response = "";
		String output;
		Gson gson = new Gson();
		StringEntity inputEntity = null;
		
		HttpPost httpPost = new HttpPost(urlString);
		String json = gson.toJson(queryStringToEncrypt);
		inputEntity = new StringEntity(json);
		inputEntity.setContentType("application/json");
		inputEntity.setContentEncoding("utf-8");
		httpPost.setEntity(inputEntity);
		Long timeout = Long.parseLong(timeoutRequest.trim());
		final HttpParams httpParams = new BasicHttpParams();
		HttpConnectionParams.setConnectionTimeout(httpParams, timeout.intValue());
		DefaultHttpClient defaultHttpClient = new DefaultHttpClient(httpParams);
		HttpResponse httpResponse = defaultHttpClient.execute(httpPost);

		if (httpResponse.getStatusLine().getStatusCode() != 200) {
			System.out.println("Failed response" + httpResponse.getStatusLine().getStatusCode());
		}
		System.out.println("Output from Server .... \n");
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader((httpResponse.getEntity().getContent())));
		while ((output = bufferedReader.readLine()) != null) {
			System.out.println(output);
			response += output;
		}
		response = response.replaceAll("\"", "");
		defaultHttpClient.getConnectionManager().shutdown();
		return response;
	}
	/**
	 * @return the url
	 */
	public String getEndPoint() {
		if ((endPoint + "").equals("null"))
			return "";
		return ((Object) endPoint).toString();
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public CarestreamTokenRestService setEndPoint(String endPoint) {
		this.endPoint = endPoint;
		return this;
	}
}
