import java.util.ArrayList;

abstract class Employee {
    protected String name;
    protected String surname;
    protected int experience;
    public enum Profession {DIRECTOR, WORKER};
    protected Profession profession;

    public Employee(String name, String surname, int experience, Profession profession ) {
        this.name = name;
        this.surname = surname;
        this.experience = experience;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Employee:" +
                "name='" + name + '\'' +
                " " + surname  +
                ", experience=" + experience +
                ", profession=" + profession +
                '.';

    }

    public abstract void printInfo();
}

class Worker extends Employee {
    protected Worker(String name, String surname, int experience, Profession profession) {
        super(name, surname, experience, profession);
    }

    @Override
    public String toString() {
        return "Worker:" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", experience=" + experience +
                ", profession=" + profession +
                '.';
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }
}

class Director extends Employee {
    protected ArrayList<Employee> employees;

    protected Director(String name, String surname, int experience, Profession profession) {
        super(name, surname, experience, profession);
        employees = new ArrayList<>();
    }
    protected boolean hasEmployeeInHierarchy(Director director, String employeeName) {

        for (Employee emp : director.getEmployees()) {
            if (emp instanceof Worker && emp.name.equals(employeeName)) {
                return true;
            }
        }

        for (Employee emp : director.getEmployees()) {
            if (emp instanceof Director) {
                if (hasEmployeeInHierarchy((Director) emp, employeeName)) {
                    return true;
                }
            }
        }
        return false;
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Метод для проверки наличия сотрудника в текущем директоре или у его подчиненных
    protected boolean hasEmployee(Employee employee) {
        if (employees.contains(employee)) {
            return true;
        }
        for (Employee emp : employees) {
            if (emp instanceof Director) {
                if (((Director) emp).hasEmployee(employee)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + name + " " + surname + ", experience:" + experience + " Profession:" + profession);
        System.out.println("Employees:");
        for (Employee emp : employees) {
            emp.printInfo();
        }
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

}
