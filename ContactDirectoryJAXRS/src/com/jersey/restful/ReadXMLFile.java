package com.jersey.restful;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
 
public class ReadXMLFile {
	
  private ContactDTO contact;	
	
  public ContactDTO getContactDetails(String id){
	  
	  contact = new ContactDTO();
	
	  try {
		  
			//File fXmlFile = new File("/Users/Chatitze/Documents/workspace/REST1/ContactDirectoryJAXRS/src/contacts.xml");
			
			File fXmlFile = new File("C:\\olmdev\\git\\ContactDirectory\\ContactDirectoryJAXRS\\src\\contacts.xml");
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
	 
			NodeList nList = doc.getElementsByTagName("contact");
	 
			for (int temp = 0; temp < nList.getLength(); temp++) {
	 
			   Node nNode = nList.item(temp);
			   if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	 
			      Element eElement = (Element) nNode;
	 
			      if(id.equals(getTagValue("id", eElement))){
			    	  contact.setId(new Long(getTagValue("id", eElement)));
			    	  contact.setFirstName(getTagValue("firstName", eElement));
			    	  contact.setLastName(getTagValue("lastName", eElement));
			    	  contact.setTitle(getTagValue("title", eElement));
			    	  contact.setCompany(getTagValue("company", eElement));
			    	  contact.setCity(getTagValue("city", eElement));
			    	  contact.setOfficePhone(getTagValue("officePhone", eElement));
			    	  contact.setCellPhone(getTagValue("cellPhone", eElement));
			    	  contact.setEmail(getTagValue("email", eElement));
			    	  contact.setWebsite(getTagValue("website", eElement));
			    	  contact.setFacebook(getTagValue("facebook", eElement));
			    	  break;
			      }
	 
			   }
			}
			
		  } catch (Exception e) {
			e.printStackTrace();
		  }
	  
	  
	  return contact;
	  
  }
 
  private String getTagValue(String sTag, Element eElement) {
	
	  NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
 
      Node nValue = (Node) nlList.item(0);
 
      return nValue.getNodeValue();
  }
 
}
