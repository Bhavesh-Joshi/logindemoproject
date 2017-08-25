package com.telusko.loginproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns={"/auth"})
public class Login extends HttpServlet{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
       	String name = req.getParameter("username");
        String pass = req.getParameter("password");
	int count = 0;
    	try{
        	Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from login;");
		while(rs.next()){
			if(rs.getString(1).equals(name)&&rs.getString(2).equals(pass)){
				count++;
			}
		}
		con.close();
	}catch(Exception e){
		e.printStackTrace();
	}
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
	if(count>0){
            String site = new String("http://www.google.com");
            res.setStatus(res.SC_MOVED_TEMPORARILY);

            res.setHeader("Location", site);  	
        }
        else pw.println("Wrong Credentials");
    }
    
}
