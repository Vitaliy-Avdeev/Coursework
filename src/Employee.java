import java.util.Objects;

public class Employee {
    private static int counter = 1;
    private Personal name;
    private double salary;
    private int department;
    private int id;

    public Employee(Personal name, double salary, int department) {
        this.name = name;
        this.salary = (salary);
        this.department = (department);
        this.id = counter++;
    }

    public Employee(int department, Personal name, double salary) {
    }

    public static int id(int i) {
        i++;
        return i;
    }

    public int getId() {
        return this.id;
    }

    public Personal getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }


    public int setDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public double setSalary() {
        return this.salary;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Employee otherEmployee = (Employee) other;
        return Objects.equals(otherEmployee, otherEmployee.department) && name.equals(otherEmployee.name) && salary == (otherEmployee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary);
    }

    @Override
    public String toString() {
        return   getId() + ". Ф.И.О. - " + this.name + "; Отдел №" + this.department + "; Зарплата сумма: " + this.salary + " рублей.";

    }


}




