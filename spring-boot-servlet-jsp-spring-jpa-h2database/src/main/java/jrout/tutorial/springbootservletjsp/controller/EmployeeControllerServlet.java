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

    @Autowired
    private IEmployeeService employeeService;

    // We are tightly coupling these dependencies..
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entered my controll");

        String fname = req.getParameter("fname");
        String empId = req.getParameter("empId");
        List<Employee> employeeList = null;

        Employee employeeInfo = null;
        if(empId != null && empId.trim().length() > 0) {
            System.out.println("empid ="+ empId);
            employeeInfo = employeeService.getEmployee(Integer.parseInt(empId));
            req.setAttribute("employee",employeeInfo);
            RequestDispatcher employeeView = req.getRequestDispatcher("/employeeView.jsp");
            employeeView.include(req,resp);
        }else if(fname != null && fname.trim().length() > 0) {
            employeeList = employeeService.getEmployeeList(fname);
            req.setAttribute("employeeList",employeeList);

            RequestDispatcher employeeListView = req.getRequestDispatcher("employeeListView");
            employeeListView.forward(req,resp);
        }
        System.out.println("exit my controll");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
