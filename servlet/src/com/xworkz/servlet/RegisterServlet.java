package com.xworkz.servlet;

import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet{

    public Register(){
        System.out.println("created register");
    }
    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws Servlet
        String firstName=arg0.getParamewter("firstName");
        String lastName=arg0.getParamewter("lastName");
        String email=arg0.getParamewter("email");
        String mobile=arg0.getParamewter("mobile");
        String password=arg0.getParamewter("password");
        String conformPassword=arg0.getParamewter("conformPassword");
        String gender=arg0.getParamewter("gender");
        String country=arg0.getParamewter("country");
        String state=arg0.getParamewter("state");
        String city=arg0.getParamewter("city");

        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(email);
        System.out.println(mobile);
        System.out.println(password);
        System.out.println(conformPassword);
        System.out.println(gender);
        System.out.println(country);
        System.out.println(state);
        System.out.println(city);

    PrintWriter print=arg1.getWriter();
        print.println("Drop down");
}
