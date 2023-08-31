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

/**
 *
 * @author shreya gandhi
 */
public class check_result_servlet extends HttpServlet {

 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try  {
            /* TODO output your page here. You may use following sample code. */
             PrintWriter out = response.getWriter();
            
             Cookie[] cookies = request.getCookies();
             if(cookies == null)
             {
                 
                  out.println(
                "<h1> You are a new user, kindly login. </h1>");
                   request.getRequestDispatcher("login.html")
                .include(request, response);
          /*  request.getRequestDispatcher("../login.html")
                .include(request, response);*/
             }
             
             else
             {
                 for(Cookie c : cookies)
                 {
                     
                     String tempname = c.getName();
                     if(tempname.equals("user"))
                     {
                         String s = c.getValue();
                         out.println(
                        "<h1>You got 10 cgpa, "
                        + s);
                         
                                                                  // value
                    out.println(
                        "<a href='logout' style='font-size:25px;'>Logout</a>");
                     }
                 }
                 
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