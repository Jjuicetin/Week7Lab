/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Role;
import models.User;

/**
 *
 * @author puppi
 */
public class RoleDB {
    
    //connect 2 database
    ConnectionPool pool = ConnectionPool.getInstance();
    Connection connection = pool.getConnection();
    
    //setup statement and result stuff
    PreparedStatement preStatement = null;
    ResultSet resultSet = null;
    
    
    public ArrayList<Role> getAllUser() throws SQLException{
        String selectAll = "Select * from role;";
        //arraylist to store user 
        ArrayList<Role> roles = new ArrayList<>();
     
        
        try{
            preStatement = connection.prepareStatement(selectAll);
           resultSet = preStatement.executeQuery();
           
           while(resultSet.next()){
               int roleID = resultSet.getInt(0);
               String roleName = resultSet.getString(1);
               
               Role role = new Role(roleID, roleName);
               roles.add(role);
           }
        }
        finally {
            //close all the things that you've opened up
            DBUtil.closeResultSet(resultSet);
            DBUtil.closePreparedStatement(preStatement);
            pool.freeConnection(connection);
        }
        return roles;
    }
}
