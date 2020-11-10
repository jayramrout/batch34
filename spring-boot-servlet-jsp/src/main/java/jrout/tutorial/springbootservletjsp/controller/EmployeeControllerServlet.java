package jrout.tutorial.springbootservletjsp.controller;

import jrout.tutorial.springbootservletjsp.model.Employee;
import jrout.tutorial.springbootservletjsp.service.EmployeeServiceImpl;
import jrout.tutorial.springbootservletjsp.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "Servlet" , urlPatterns = {"/employeeController"})
public class EmployeeControllerServlet extends HttpServlet {

    private IEmployeeService employeeService;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(employeeService == null)
            employeeService = new EmployeeServiceImpl();

        String fname = req.getParameter("fname");
        String empId = req.getParameter("empId");
        List<Employee> employeeList = null;

        Employee employeeInfo = null;
        if(empId != null && empId.trim().length() > 0) {
            employeeInfo = employeeService.getEmployee(Integer.parseInt(empId));
            req.setAttribute("employee",employeeInfo);
            RequestDispatcher employeeListView = req.getRequestDispatcher("employeeView");
            employeeListView.include(req,resp);
        }else if(fname != null && fname.trim().length() > 0) {
            employeeList = employeeService.getEmployeeList(fname);
            req.setAttribute("employeeList",employeeList);

            RequestDispatcher employeeListView = req.getRequestDispatcher("employeeListView");
            employeeListView.include(req,resp);
        }
    }


    /*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/
}
