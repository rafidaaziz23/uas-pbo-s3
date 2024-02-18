interface Employee {
    double calculateSalary(int hoursWorked);
}

class Supervisor implements Employee {
    private static final double BASE_SALARY = 10000000;
    private static final double TRANSPORT_ALLOWANCE = 1000000;
    private static final double OVERTIME_RATE = 10000;
    private static final double SPOUSE_ALLOWANCE = 300000;
    private static final double CHILD_ALLOWANCE_FIRST = 100000;
    private static final double CHILD_ALLOWANCE_REST = 200000;

    @Override
    public double calculateSalary(int hoursWorked) {
        double salary = BASE_SALARY + TRANSPORT_ALLOWANCE;
        if (hoursWorked > 8) {
            salary += (hoursWorked - 8) * OVERTIME_RATE;
        }
        salary += SPOUSE_ALLOWANCE;
        salary += (hoursWorked > 8) ? CHILD_ALLOWANCE_REST : CHILD_ALLOWANCE_FIRST;
        return salary;
    }
}

class HRD implements Employee {
    private static final double BASE_SALARY = 5000000;
    private static final double TRANSPORT_ALLOWANCE = 750000;
    private static final double OVERTIME_RATE = 7500;
    private static final double SPOUSE_ALLOWANCE = 250000;
    private static final double CHILD_ALLOWANCE_FIRST = 90000;
    private static final double CHILD_ALLOWANCE_REST = 190000;

    @Override
    public double calculateSalary(int hoursWorked) {
        double salary = BASE_SALARY + TRANSPORT_ALLOWANCE;
        if (hoursWorked > 8) {
            salary += (hoursWorked - 8) * OVERTIME_RATE;
        }
        salary += SPOUSE_ALLOWANCE;
        salary += (hoursWorked > 8) ? CHILD_ALLOWANCE_REST : CHILD_ALLOWANCE_FIRST;
        return salary;
    }
}

class Technician implements Employee {
    private static final double BASE_SALARY = 3000000;
    private static final double TRANSPORT_ALLOWANCE = 500000;
    private static final double OVERTIME_RATE = 5000;
    private static final double SPOUSE_ALLOWANCE = 200000;
    private static final double CHILD_ALLOWANCE_FIRST = 75000;
    private static final double CHILD_ALLOWANCE_REST = 150000;

    @Override
    public double calculateSalary(int hoursWorked) {
        double salary = BASE_SALARY + TRANSPORT_ALLOWANCE;
        if (hoursWorked > 8) {
            salary += (hoursWorked - 8) * OVERTIME_RATE;
        }
        salary += SPOUSE_ALLOWANCE;
        salary += (hoursWorked > 8) ? CHILD_ALLOWANCE_REST : CHILD_ALLOWANCE_FIRST;
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {

        Employee supervisor = new Supervisor();
        Employee hrd = new HRD();
        Employee technician = new Technician();

        int hoursWorked = 10;
        double supervisorSalary = supervisor.calculateSalary(hoursWorked);
        double hrdSalary = hrd.calculateSalary(hoursWorked);
        double technicianSalary = technician.calculateSalary(hoursWorked);

        System.out.println("Supervisor Salary: " + supervisorSalary);
        System.out.println("HRD Salary: " + hrdSalary);
        System.out.println("Technician Salary: " + technicianSalary);
    }
}
