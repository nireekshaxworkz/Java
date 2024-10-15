package com.xworkz.servlet;

import java.io.PrintWriter;

public class ContactServlet extends HttpServlet{

    public Contact(){
        System.out.println("created contact");
    }
    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws Servlet

    String name = arg0.getParameter("name");
    String email = arg0.getParameter("email");
    String phone = arg0.getParameter("phone");
    String age = arg0.getParameter("age");
    String address = arg0.getParameter("address");

    System.out.println(name);
    System.out.println(email);
    System.out.println(phone);
    System.out.println(age);
    System.out.println(address);

    PrintWriter print=arg1.getWriter();
        print.println("contact saved");
}
