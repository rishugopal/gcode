package com.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Logic3 {
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
	String result = null;
	String value="<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">"
+"\n"+	"<script  src=\"resource.js\"></script>"
+"\n"+	"<script src=\"//ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js\"></script>"
+"\n"+	 "<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>"
+"\n"+	 "<script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>"
+"\n"+	  "<script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>"
+"\n"+	     "<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">"
+"\n"+	    "<script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>"
+"\n"+	    "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>"
+"\n"+		"<link rel=\"stylesheet\" href=\"http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/themes/smoothness/jquery-ui.css\" type=\"text/css\" media=\"screen\" />"		
+"\n"+	    "<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.8.3.min.js\"></script>"
+"\n"+	   "	    <link type=\"text/css\" href=\"jquery-ui-chatbox.css\" rel=\"stylesheet\" />"
+"\n"+	    "<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/jquery-ui.min.js\"></script>"
+"\n"+	    "<script  src=\"Handle.js\"></script>";
	String find= "Bharti";
	String findall[]=find.split(" ");
	String content = contentBuilder.toString();
	if(content.toLowerCase().contains("<head>"))
	{
		 result= content.substring(0,content.indexOf("<head>"))+"\n" + value +"\n"+ content.substring(content.indexOf("<head>"));
	}
	System.out.println(result);
}
}