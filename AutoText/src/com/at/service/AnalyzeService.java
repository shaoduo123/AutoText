package com.at.service;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.at.dao.Dao;
import com.at.pojo.Chapter;
import com.at.utils.DButil;
import com.at.utils.FileUtils;

public class AnalyzeService {

	private String chaNm;
	private static int chaNum=0; 
	private String content ; 
	
	//方法一  使用split通过先分离段，再分离标题和内容
	public boolean  analyze1(String filePath) throws IOException
	{	boolean b = false ;
		Chapter chapter = new Chapter() ;
		Dao dao = new Dao();
		String text = FileUtils.readFile(filePath) ;
		System.out.println(text);
		String [] paragraph = text.split("★") ;
		String tRegex = "★(\\S*?)　" ;
		System.out.println();
		for(int i = 1 ; i<paragraph.length ; i++)
		{
			
			paragraph[i] ="★"+paragraph[i] ;
			System.out.println("----"+paragraph[i]);
			Pattern p = Pattern.compile(tRegex) ;
			Matcher m = p.matcher(paragraph[i]) ;
			if(m.find())
			{
				
			//	System.out.println("aaaa"+m.group(1));
				chaNm = m.group(1) ;
				content = paragraph[i].replace("★"+chaNm, "") ;
				chaNum++ ;
				chapter.setChaNm(chaNm);
				chapter.setContent(content);
				chapter.setChaNum(chaNum);
				int flag= dao.insert(chapter) ;
				if(flag==1)
				{
					b= true ; 
				}
				
			}

		}
		
		return b ;
		
	}
	
	
	//使用正则表达式
	public boolean  analyze2(String filePath) throws IOException
	{	boolean b = false ;
		Chapter chapter = new Chapter() ;
		Dao dao = new Dao();
		String text = FileUtils.readFile(filePath) ;
		//System.out.println(text);
		String paraRegex ="★(\\S)" ;
		Pattern p = Pattern.compile(paraRegex) ;
	//	Matcher m  = p.matcher("★你的你能啊啊  vwewrdfssdfwerw3242342") ;
		Matcher m  = p.matcher(text) ;
		while(m.find())
		{ 
			System.out.println("---"+m.group(0));
		//	System.out.println("---1 "+m.group(1));
		//	System.out.println("---2 "+m.group(2));
/*			chaNum++ ;
			chaNm = m.group(1) ;
			chapter.setChaNm(chaNm);
			content = m.group(2);
			chapter.setContent(content);
			chapter.setChaNum(chaNum);
			System.out.println("-------"+chaNm);
			System.out.println("-------a"+content);*/

/*			int i = dao.insert(chapter) ;
			if(i==1)
			{
				b= true ; 
			}*/
			
			
		}
		
		return b ;
		
	}
}



