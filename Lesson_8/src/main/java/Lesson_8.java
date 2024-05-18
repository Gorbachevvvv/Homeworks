public class Lesson_8 {
        public static void main(String[] args) {

            Worker worker1 = new Worker("worker1", "1", 5, Employee.Profession.WORKER);
            Worker worker2 = new Worker("worker2", "2", 3, Employee.Profession.WORKER);
            Worker worker3 = new Worker("worker3", "3", 7, Employee.Profession.WORKER);


            System.out.println("Worker 1:");
            worker1.printInfo();
            System.out.println("Worker 2:");
            worker2.printInfo();
            System.out.println("Worker 3:");
            worker3.printInfo();


            Director director1 = new Director("director1", "1", 10, Employee.Profession.DIRECTOR);


            director1.addEmployee(worker1);
            director1.addEmployee(worker2);


            System.out.println("Director 1:");
            director1.printInfo();


            Director director2 = new Director("director2", "2", 8, Employee.Profession.DIRECTOR);


            director1.addEmployee(director2);


            System.out.println("Director 1 new:");
            director1.printInfo();


            String employeeNameToFind = "worker1";
            System.out.println(director1.hasEmployeeInHierarchy(director1, employeeNameToFind));
        }



    }

