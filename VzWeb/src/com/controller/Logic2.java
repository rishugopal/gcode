package com.model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Logic2 {
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
	int eflag;
	String find= "Bharti";
	String findall[]=find.split(" ");
	String content = contentBuilder.toString();
	String fileout="";
	String[] div=content.split(">");
	for(int i=0;i<div.length;i++)
	{ 	
		if(div[i].toLowerCase().contains(find.toLowerCase()))
		{
			div[i]="<label id="+find+"> "+div[i]+" <label>";
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
