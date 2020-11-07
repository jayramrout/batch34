package jrout.tutorial.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "studentLoginservlet", urlPatterns = {"/studentlogin"})
public class StudentLoginServlet extends HttpServlet {

    public StudentLoginServlet(){
        System.out.println("Object created...");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("This is been initialized...");
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginHtml = "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h2>HTML Forms</h2>\n" +
                "\n" +
                "<form action=\"empserv\">\n" +
                "    <label for=\"name\">First name:</label><br>\n" +
                "    <input type=\"text\" id=\"name\" name=\"name\" value=\"\"><br>\n" +
                "    <label for=\"location\">Location :</label><br>\n" +
                "    <input type=\"text\" id=\"location\" name=\"location\" value=\"Boston\"><br><br>\n" +
                "    <input type=\"submit\" value=\"Submit\">\n" +
                "</form>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
        resp.getWriter().println(loginHtml);
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
