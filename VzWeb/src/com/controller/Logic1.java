package com.model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Logic1 {
	public static void main(String[] args)
	{
		List<String> ls= new ArrayList<String>();
	StringBuilder contentBuilder = new StringBuilder();
	try {
	    BufferedReader in = new BufferedReader(new FileReader("C:/Users/Administrator/Desktop/sweta/WebContent/initForm.html"));
	    String str;
	    while ((str = in.readLine()) != null) {
	        contentBuilder.append(str);
	    }
	    in.close();
	} catch (IOException e) {
	}
	String content = contentBuilder.toString();
	String fileout="";
	String[] div=content.split(">");
	for(int i=0;i<div.length;i++)
	{ 	//System.out.println(div[i]);
	  div[i].replaceAll("\\s+","");
		if(div[i].contains("input"))
		{
			if(div[i].contains("id="))
			{
				System.out.println(div[i].substring(div[i].toLowerCase().indexOf("id=\"")+4,div[i].indexOf("\"",(div[i].toLowerCase().indexOf("id=\"")+4)) ));
			ls.add(div[i].substring(div[i].toLowerCase().indexOf("id=\"")+4,div[i].indexOf("\"",(div[i].toLowerCase().indexOf("id=\"")+4)) ));
			}
		else if(div[i].contains("name="))
			{
				String name=div[i].substring(div[i].toLowerCase().indexOf("name=\"")+6,div[i].indexOf("\"",(div[i].toLowerCase().indexOf("name=\"")+6)) );
			div[i]=div[i]+" "+"id="+"\"id_"+name+"\" ";
			ls.add("id_"+name);
			System.out.println("id_"+name);
			}
		}
	if(i>0)
	{
		fileout=fileout+"> "+"\n"+div[i];
	}
	else
	{
	fileout=""+div[i];
	}
	
}
	System.out.println(fileout);
	//create a file with string fileout as its data
	}
}
