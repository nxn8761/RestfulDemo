package com.naga.utils;

import com.naga.beans.Employee;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;


public class XMLGenerator
{
	 private static XStream xstream = new XStream(new DomDriver("UTF-8", 
			 new XmlFriendlyReplacer("ddd", "_"))) {
		    {
		    	processAnnotations(Employee.class);
		    }
		  };

     public static String convertToXML(Object object)
     {
    	return xstream.toXML(object);
     }
     
     public static Object convertFromXML(String inputXML)
     {
    	 return xstream.fromXML(inputXML);
     }
}
