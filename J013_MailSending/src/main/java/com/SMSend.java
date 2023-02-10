package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SMSend {
	public static void main(String[] args) {
		String dt =  SMSend.sendSms();
		System.out.println(dt);
	}
	public static String sendSms() {
		try {
			// Construct data
//			String apiKey = "NTI0ZDMzNDk0OTY0NDk0YjM1NzMzMjQ5NTk2ZDU3NGI=";
//			String message = "This is your message";
//			String sender = "TXTLC";
//			String numbers = "919099613040";
			
			String apiKey = "apikey=" + "NTI0ZDMzNDk0OTY0NDk0YjM1NzMzMjQ5NTk2ZDU3NGI=";
			String message = "&message=" + "This is your message";
			String sender = "&sender=" + "TXTLCL";
			String numbers = "&numbers=" + "919099613040";
			
			// Send data
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuffer.append(line);
			}
			rd.close();
			
			return stringBuffer.toString();
		} catch (Exception e) {
			System.out.println("Error SMS "+e);
			return "Error "+e;
		}
	}
}
