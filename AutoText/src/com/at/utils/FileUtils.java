package com.at.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileUtils {

	@SuppressWarnings("resource")
	public  static String readFile(String filePath) throws IOException 
	{
		String encoding ="UTF-8" ;
		File file = new File(filePath) ;
		FileInputStream fis = null;
		BufferedReader br =null ;
		InputStreamReader isr =null ;
		String s=null ;
		String text = "" ;
		try {
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis,encoding) ;
			br = new BufferedReader(isr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			while((s=br.readLine())!=null)
			{
				text +=s ;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(br!=null)
			br.close();
			if(fis!=null)
			fis.close();
			if(isr!=null)
			isr.close();
		}
		
		return text ;
				
	}
	
	
}
