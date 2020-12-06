package jrout.tutorial.springbootjpa.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employees")
// JPQL : Java Persistence Query Language.
@NamedQuery(name="find_all_employee", query = "select e from Employee e")
public class Employee {
    @Id
//    @org.hibernate.annotations.GenericGenerator(name = "assigned_id", strategy = "org.hibernate.id.Assigned")
//    @GeneratedValue(generator = "assigned_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String address;
    private float salary;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Employee(){}

    public Employee(String firstName){
        this.firstName = firstName;
    }
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName, String address, float salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.salary = salary;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
