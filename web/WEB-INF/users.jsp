<%-- 
    Document   : users
    Created on : 24-Oct-2022, 4:19:16 PM
    Author     : puppi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Something</title>
    </head>
    <body>
        <h1>Manage Users</h1>
            <p4>Use a for loop using the <c:loop> to print out each element in the arraylist. </p4>
        <h2>Add Users</h2>
        <h4>^ "add user" ^ is replaced with edit user when edit link is pressed</h4>
         <form action="Users" method="post">
             Email: <input type="text" name="email" required> <br>
             First name: <input type="text" name="fname" required> <br>
             Last name: <input type="text" name="lname" required> <br>
             Password: <input type="password" name="password" required> <br>
             Role: <select name="roles" required>
                 <option value="sysadmin">system admin</option
                 <option value="regular">regular user</option>
             </select>
             <br>
             <input type="submit" value="Add user">
            
         </form>
    </body>
</html>
