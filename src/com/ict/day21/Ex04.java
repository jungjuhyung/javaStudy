package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

// make up
public class Ex04 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		String pathname = "D:/jjh/util/makeup_json.txt";
		File file = new File(pathname); 
		FileWriter fw = null;
		BufferedWriter bfw = null;
		try {
			URL url = new URL("https://makeup-api.herokuapp.com/api/v1/products.json?brand=maybelline");
			URLConnection conn = url.openConnection();
			is = conn.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while ((msg = br.readLine()) != null) {
				sb.append(msg+"\n");
			}
			System.out.println(sb.toString());
			
			fw = new FileWriter(file);
			bfw = new BufferedWriter(fw);
			bfw.write(sb.toString());
			bfw.flush();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bfw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
