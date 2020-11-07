package jrout.tutorial.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "employeeservlet", urlPatterns = {"/empserv","/myempserv"})
public class EmployeeServlet extends HttpServlet {

    public EmployeeServlet(){
        System.out.println("Object created...");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("This is been initialized...");
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("I am the service method....");
        String name = req.getParameter("name");
        String location = req.getParameter("location");

        PrintWriter writer = resp.getWriter();
//        writer.println("Hello World "+ new java.util.Date());
//        writer.println("Hello "+name +" how are you.. You are from "+ location);

        String output = "<html>\n" +
                "<body>\n" +
                "\n" +
                "<p style=\"color:red;\">Hello "+name+"</p>\n" +
                "<p style=\"font-size:50px;\">You are from "+location+"</p>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
        writer.println(output);
    }

    @Override
    public void destroy() {
        System.out.println("I am been destroyed...");
    }

    /*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }*/


}
