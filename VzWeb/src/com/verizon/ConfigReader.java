package com.verizon;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	
	public  String returnVideoURL(String elementID){
		Properties props = new Properties();
	    InputStream is = null;
	 
	    // First try loading from the current directory
	    try {
	        File f = new File("videoResources.properties");
	        is = new FileInputStream( f );
	    }
	    catch ( Exception e ) { is = null; }
	 
	    try {
	        if ( is == null ) {
	            // Try loading from classpath
	            is = getClass().getResourceAsStream("videoResources.properties");
	        }
	 
	        // Try loading properties from the file (if found)
	        props.load( is );
	    }
	    catch ( Exception e ) { 
	    	
	    	e.printStackTrace();
	    	}
	 
	    String videoURL = props.getProperty(elementID, "NoResource");
	    return videoURL;
	}

		
	}


