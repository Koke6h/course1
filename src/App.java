public class App {
    private static Employee[] employees = new Employee[10];

    public App() {
        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 123123);
        employees[1] = new Employee("Павлов", "Иван", "Иванович", 1, 123412);
        employees[2] = new Employee("Сергеев", "Иван", "Иванович", 1, 123421);
        employees[3] = new Employee("Петров", "Иван", "Иванович", 1, 123432);
        employees[4] = new Employee("Сидоров", "Иван", "Иванович", 1, 1234123);
        employees[5] = new Employee("Суворов", "Иван", "Иванович", 1, 231224);

    }
    public void printAllEmployees(){
        System.out.println("Сотрудники:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public void printFullNameEmployees(){
        System.out.println("ФИО сотрудников:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public double calculateSumOfSalaries() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee!=null){
            sum+=employee.getSalary();
            }
        }
        return sum;
    }
    public Employee calculateMinSalary(){
        Employee calculateMinSalary = null;
        for (Employee employee: employees){
                if (employee!=null){
                    if (calculateMinSalary==null){
                        calculateMinSalary=employee;
                        continue;
                    }
            if (employee.getSalary() < calculateMinSalary.getSalary()){
                calculateMinSalary=employee;
                }
            }
        }return calculateMinSalary;
    }
    public Employee calculateMaxSalary(){
        Employee calculateMaxSalary=null;
        for (Employee employee: employees){
            if (employee!=null){
                if (calculateMaxSalary == null){
                    calculateMaxSalary = employee;
                    continue;
                }
            if (employee.getSalary()>calculateMaxSalary.getSalary()){
                calculateMaxSalary=employee;
            }
            }
        }return calculateMaxSalary;
    }
    public double calculateAverageSumOfSalaries(){
        int count = 0;
        for (Employee employee : employees){
            if (employee!=null){
                count++;
            }
        }
        return calculateSumOfSalaries()/count;
    }
}

