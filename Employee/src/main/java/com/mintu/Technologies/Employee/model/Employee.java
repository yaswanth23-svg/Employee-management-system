
package com.mintu.Technologies.Employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {


    @Id
    private String employee_Id;  // Payload or parameter
    private String employee_Name;
    private String employee_Age;
    private String employee_Phone;
    private String employee_Address;
    private String employee_department;


    public Employee(){

    }
    public Employee(String employee_Id, String employee_Name, String employee_Age, String employee_Phone, String employee_Address, String employee_department) {
        this.employee_Id = employee_Id;
        this.employee_Id = employee_Id;
        this.employee_Name = employee_Name;
        this.employee_Age = employee_Age;
        this.employee_Phone = employee_Phone;
        this.employee_Address = employee_Address;
        this.employee_department = employee_department;
    }
    public String getEmployee_Id() {
        return employee_Id;
    }

    public void setEmployee_Id(String employee_Id) {
        this.employee_Id = employee_Id;
    }

    public String getEmployee_Name() {
        return employee_Name;
    }

    public void setEmployee_Name(String employee_Name) {
        this.employee_Name = employee_Name;
    }

    public String getEmployee_Age() {
        return employee_Age;
    }
    public void setEmployee_Age(String employee_Age) {
        this.employee_Age = employee_Age;
    }

    public String getEmployee_Phone() {
        return employee_Phone;
    }

    public void setEmployee_Phone(String employee_Phone) {
        this.employee_Phone = employee_Phone;
    }

    public String getEmployee_Address() {
        return employee_Address;
    }

    public void setEmployee_Address(String employee_Address) {
        this.employee_Address = employee_Address;
    }

    public String getEmployee_department() {
        return employee_department;
    }
    public void setEmployee_department(String employee_department) {
        this.employee_department = employee_department;
}
}
