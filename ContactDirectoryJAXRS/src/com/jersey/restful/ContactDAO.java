package com.jersey.restful;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Chatitze Moumin
 */
public class ContactDAO {

    public Contact findById(Long id) {
    	
    	Contact contact = null;
    	contact = new ReadXMLFile().getContactDetails(id.toString());
        return contact;
    }
    
}
