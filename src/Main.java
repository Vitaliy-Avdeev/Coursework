public class Main {
    public static Personal Personal(String firstName, String lastName, String surName) {
        return new Personal(firstName, lastName, surName);
    }

    public static Employee Employee(Personal name, int department, double salary) {
        return new Employee(department, name, salary);
    }

    public static void main(String... args) {
        Employee[] employees = new Employee[10];
        {
            employees[0] = new Employee(new Personal("Червяков ", "Евгений ", "Викторович "), 29_000.56, 3);
            employees[1] = new Employee(new Personal("Любишкин", "Алексей", "Андреевич"), 30_000.38, 1);
            employees[2] = new Employee(new Personal("Финохин", "Сергей", "Владимирович"), 20_000.86, 2);
            employees[3] = new Employee(new Personal("Толстиков", "Николай", "Валерьевич"), 40_000.45, 2);
            employees[4] = new Employee(new Personal("Иванов", "Иван", "Иванович"), 45_000.78, 4);
            employees[5] = new Employee(new Personal("Дориамедова", "Любовь", "Владимировна"), 45_000.66, 5);
            employees[6] = new Employee(new Personal("Касимов", "Сергей", "Александрович"), 70_000.89, 3);
            employees[7] = new Employee(new Personal("Михайлов", "Сергей", "Вячеславович"), 35_000.12, 4);
            employees[8] = new Employee(new Personal("Фаизов", "Эмиль", "Равилевич"), 37_000.55, 5);
            employees[9] = new Employee(new Personal("Андреев", "Виталий", "Владимирович"), 33_000.11, 1);
        }
        for (Employee employeeData : employees) {
            System.out.println(employeeData);
        }
        double result = calculateTotalSalary(employees);
        System.out.println("Общая сумма затрат на зарплату в месяц " + result + " рублей");
        double minSalary = calculateMinSalary(employees);
        for (Employee employee : employees) {
            if (employee.getSalary() == minSalary) {
                System.out.println("Минимальная зарплата сотрудника " + employee);
            }
        }
        double maxSalary = calculateMaxSalary(employees);
        for (Employee employee : employees) {
            if (employee.getSalary() == maxSalary) {
                System.out.println("Максимальная зарплата сотрудника " + employee);
            }
        }
        double averageResult = calculateAverageSalary(employees);
        String averageResult2 = String.format("%.2f", averageResult);
        System.out.println("Средняя зарплата сотрудников " + averageResult2 + " рублей");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }

        double proc = 0.18;
        double indexSalaryProc;
        for (Employee employee : employees) {
            indexSalaryProc = employee.getSalary() + (employee.getSalary() * proc);
            String indexSalaryProc2 = String.format("%.2f", indexSalaryProc);
            System.out.println(employee.getName() + " зарплата проиндексирована на " + proc * 100 + " % до "  + indexSalaryProc2 + " рублей");
        }
    }


    public static double calculateTotalSalary(Employee[] employees) {
        double result = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                result = (double) (result + employee.getSalary());
            }
        }
        return result;
    }

    public static double calculateMinSalary(Employee[] employees) {
        double minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = (double) employee.getSalary();
            }
        }
        return minSalary;
    }

    public static double calculateMaxSalary(Employee[] employees) {
        double maxSalary = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = (double) employee.getSalary();
            }
        }
        return maxSalary;
    }

    public static double calculateAverageSalary(Employee[] employees) {
        double result = calculateTotalSalary(employees);
        return result / employees.length;
    }
}



