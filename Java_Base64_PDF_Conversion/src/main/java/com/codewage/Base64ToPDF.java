package com.codewage;

import java.io.*;
import sun.misc.BASE64Decoder;

public class Base64ToPDF {

	public static void main(String[] args) throws IOException {

		// THis is an invalid Base64 String. Made short because of Space constraint
		String Base64 = "JVBEZmlsZSAtAwIFINCj4+DQoNCnN0YXJ0eHJlZg0KMjcxNA0KJSVFT0YNCg==";
		imageDecoder(Base64);

	}

	public static void imageDecoder(String Base64) throws IOException {
		
		BASE64Decoder decoder = new BASE64Decoder();
		byte[] decodedBytes = decoder.decodeBuffer(Base64);

		File file = new File("output.pdf");;
		FileOutputStream fop = new FileOutputStream(file);

		fop.write(decodedBytes);
		fop.flush();
		fop.close();
	}

}
