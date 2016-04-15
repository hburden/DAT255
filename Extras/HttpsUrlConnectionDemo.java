package com.cybercom.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class HttpsUrlConnectionDemo {

	public static void main(String[] args) {

		HttpsUrlConnectionDemo demo = new HttpsUrlConnectionDemo();
		try {
			demo.doGet();
		} catch (IOException e) {
		}

	}

	private void doGet() throws IOException {
		long t2 = System.currentTimeMillis();
		long t1 = t2 - (1000 * 120);

		StringBuffer response = new StringBuffer();
		//TODO Enter your base64 encoded Username:Password
		String key = "";
		String url = "https://ece01.ericsson.net:4443/ecity?dgw=Ericsson$Vin_Num_001&sensorSpec=Ericsson$Next_Stop&t1="
				+ t1 + "&t2=" + t2;

		URL requestURL = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) requestURL
				.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("Authorization", key);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(
				con.getInputStream()));

		String inputLine;

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		System.out.println(response.toString());
	}

}
