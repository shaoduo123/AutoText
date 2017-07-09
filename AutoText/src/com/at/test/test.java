package com.at.test;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.at.service.AnalyzeService;

public class test {

	
	public static void main(String args[]) throws IOException
	{
		AnalyzeService service = new AnalyzeService() ;
		
		boolean b = service.analyze1("E:\\10293.txt") ;
		
/*		if(b)
			System.out.println("解析成功");
		else
			System.out.print("失败!");*/
		
		
/*		String s1 = "56+14-5*(2+6)-56+48";
		String s2 = "\\+|\\-|\\*|\\/|\\(|\\)";

		Pattern p = Pattern.compile(s2);
		Matcher m = p.matcher(s1);

		while(m.find()){
			System.out.println(m.group() + "," + m.start() + "," + m.end());*/
		}
	}
