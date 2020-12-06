package jrout.tutorial.springbootjpa.dao;

import jrout.tutorial.springbootjpa.model.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class EmployeeRepository  {

    // CRUD Operations

    @PersistenceContext
    EntityManager entityManager;

    public Employee findById(int id){
        return entityManager.find(Employee.class, id);
    }

    public Employee insert(Employee employee){
        return entityManager.merge(employee);
    }

    public Employee update(Employee employee){
        return entityManager.merge(employee);
    }

    public void remove(int id){
        Employee byId = findById(id);
        entityManager.remove(byId);
    }

    public List<Employee> findAll(){
        TypedQuery<Employee> find_all_employees = entityManager.createNamedQuery("find_all_employee", Employee.class);
        return find_all_employees.getResultList();
    }

}
