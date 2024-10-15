package com.xworkz.servlet;
import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;


public class OrderServlet extends HttpServlet {
    public Order() {
        System.out.println("created order");
    }

    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws Servlet

    String name = arg0.getParameter("customerName");
    String item = arg0.getParameter("item");
    String quantity = arg0.getParameter("quantity");
        System.out.println(name);
        System.out.println(item);
        System.out.println(quantity);

        PrintWriter print=arg1.getWriter();
        print.println("order sucess");

}
