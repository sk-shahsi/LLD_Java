package com.stractural.proxy;
// RealSubject - the actual employee object that does the real work


public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void getEmployeeInfo(int empID) {
        System.out.println("Featching employee info for ID: "+ empID);
    }

    @Override
    public void createEmployee(EmployeeDo obj) {
        System.out.println("Creating employee: "+ obj);

    }
}
