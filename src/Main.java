public class Main {
    public static void main (String[] args){
        App app = new App();
        app.printAllEmployees();
        System.out.println(app.calculateMaxSalary());
        System.out.println(app.calculateMinSalary());
        System.out.println(app.calculateSumOfSalaries());
        System.out.println(app.calculateAverageSumOfSalaries());
    }
}