package com.xworkz.servlet;

import java.io.PrintWriter;

public class SearchServlet extends HttpServlet{

    public Search(){
        System.out.println("created search");
    }
    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws Servlet
        String email=agr0.getParameter("email");
        System.out.println(email);

    PrintWriter print=arg1.getWriter();
        print.println("search sucess");


}
