/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import static java.lang.System.out;

/**
 *
 * @author shreya gandhi
 */
public class login extends HttpServlet {

   
  
   protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) 
      
   {
       try{
          
          String name = request.getParameter("usname");
        String password = request.getParameter("uspass");
        if(password.equals("shreya"))
        {
            Cookie c = new Cookie("user",name);
            response.addCookie(c);
 
                response.sendRedirect("com/welcome.jsp?name=" + name);
        }
        
        else
        {
             out.println(
                "Sorry invalid username or password!");
            request.getRequestDispatcher("login.html")
                .include(request, response);
            
        }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       
       
   }
   
     protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
        throws ServletException, IOException
    {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}
    
  

 