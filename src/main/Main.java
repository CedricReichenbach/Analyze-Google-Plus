package main;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson.JacksonFactory;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		toyExample();
	}

	private static void toyExample() {
		HttpTransport httpTransport = new NetHttpTransport();
		JsonFactory jsonFactory = new JacksonFactory();
	}

}
