package org.fleni.cda.json.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

public class ReportBuilderJson {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReportBuilderJson.class);
	
	/**
	 * @param source
	 * @return
	 */
	public static String convertToJson(Object source) {
		Gson gson = new Gson();
		String json = gson.toJson(source);

		LOGGER.debug("Convert json  [" + json + "]");

		return json;
	}
	
	/**
	 * @param message
	 * @param type
	 * @return
	 */
	public static Object convertJsonToObject(String message, Class<?> type) {
		LOGGER.debug("Convert json [" + message + "]");
		
		Gson gson = new Gson();
		Object result = gson.fromJson(message, type);

		return result;
	}
}
