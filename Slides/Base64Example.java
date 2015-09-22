package com.cybercom.demo;

import javax.xml.bind.DatatypeConverter;

public class Base64Example {
	
	
	// 	android.util.Base64
	public static void main(String []args){
		String userNamePass = "grp0:password";
		
		String base64Encoded = DatatypeConverter.printBase64Binary(userNamePass.getBytes());
		System.out.println("Basic "+base64Encoded);
		String unencodedString = new String(DatatypeConverter.parseBase64Binary(base64Encoded));
		System.out.println(unencodedString);
	}

}
