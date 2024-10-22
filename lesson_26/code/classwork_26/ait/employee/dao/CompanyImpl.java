package classwork_26.ait.employee.dao;

import classwork_26.ait.employee.model.Employee;
import classwork_26.ait.employee.model.SalesManager;

public class CompanyImpl implements Company {

    private Employee[] employees; //element массива employees[0]
    private int size;

    // capacity - возможное кол-во сотрудников
    public CompanyImpl(int capacity) {
        this.employees = new Employee[capacity];
        this.size = size;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        // bad cases
        if (employee == null) {
            return false;
        }
        if (size == employees.length) {
            return false;
        }
        if (findEmployee(employee.getId()) != null) {
            return false;
        }
        //good cases
        employees[size] = employee;
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                Employee victim = employees[i];
                employees[i] = employees[size - 1];
                employees[size - 1] = null;
                size--;
                return victim;

            }

        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                return employees[i];

            }

        }
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);

        }

    }

    @Override
    public double totalSalary() {
        double totalSalary = 0;
        for (int i = 0; i < size; i++) {
            totalSalary += employees[i].calcSalary();
        }
        return totalSalary;

    }

    @Override
    public double averageSalary() {
        return totalSalary()/size;

//        double averageSalary = 0;
//        for (int i = 0; i < size; i++) {
//            averageSalary += employees[i].calcSalary();
//        }
//        averageSalary /= size;
//        return averageSalary;
    }

    @Override
    public double totalSales() {
        double totalSales = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof SalesManager) { //проверка перед кастингом, так как поле sales есть только в дочерних классах
                SalesManager sm = (SalesManager) employees[i];
                totalSales += sm.getSalesValue();
            }
        }

        return totalSales;
    }


    @Override
    public Employee[] findEmployeeHoursGreaterThan(int hours) {
        int count = 0;

        //  количество сотрудников, отработавших больше заданного количества часов
        for (int i = 0; i < size; i++) {
            if (employees[i].getHours() > hours) {
                count++;
            }
        }

        // Создаем массив для этих сотрудников
        Employee[] result = new Employee[count];
        int index = 0;

        // Заполняем массив сотрудниками, которые соответствуют условию
        for (int i = 0; i < size; i++) {
            if (employees[i].getHours() > hours) {
                result[index++] = employees[i];
            }
        }

        return result;
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double min, double max) {
        // Считаем количество сотрудников, которые подходят под диапазон зарплат
        int count = 0;
        for (int i = 0; i < size; i++) {
            double salary = employees[i].calcSalary();
            if (salary >= min && salary <= max) {
                count++;
            }
        }

        // Создаем массив подходящих сотрудников
        Employee[] result = new Employee[count];
        int index = 0;
        for (int i = 0; i < size; i++) {
            double salary = employees[i].calcSalary();
            if (salary >= min && salary <= max) {
                result[index++] = employees[i];
            }
        }

        return result;
    }

}
