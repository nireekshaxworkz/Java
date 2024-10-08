package com.xworkz.servlet;

import java.io.IOException;

//@WebServlet (loadOnStartUp = 1, urlPatterns = "/send")
public class FirstServlet extends HttpServlet {
    public class HttpServlet() {
        System.out.println("Created DataServlet");
    }
    @Override
    protected void service(HttpServletRequest req,HttpServletResponse resp)throws
            ServletException, IOException {
        System.out.println("running service in DataServlet");

        String name=req.getParameter("customer");
        String email=req.getParameter("email");
        System.out.println("Name:"+name);
        System.out.println("Email:"+email);
    }
}
