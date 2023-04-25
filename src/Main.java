import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Employee[] storageOfEmployeeRecords = new Employee[10];

        storageOfEmployeeRecords[0] = new Employee("Иванов Иван Иванович", 1, 500f);
        storageOfEmployeeRecords[1] = new Employee("Смирнов Владимир Петрович", 2, 450f);
        storageOfEmployeeRecords[2] = new Employee("Толстенко Ярослав Юрьевич", 3, 200f);
        storageOfEmployeeRecords[3] = new Employee("Гаврилов Максим Анатолич", 4, 600f);
        storageOfEmployeeRecords[4] = new Employee("Соколов Андрей Павлович", 5, 200f);
        storageOfEmployeeRecords[5] = new Employee("Иванков Сергей Карлович", 6, 700f);
        storageOfEmployeeRecords[6] = new Employee("Вовченко Данил Романович", 7, 100f);
        storageOfEmployeeRecords[7] = new Employee("Абрамов Константин Самойлович", 8, 400f);
        storageOfEmployeeRecords[8] = new Employee("Лихочев Евгений Николаевич", 9, 500f);
        storageOfEmployeeRecords[9] = new Employee("Ефимов Павел Сергеевич", 10, 200f);


        System.out.println("Список всех сотрудников и зарплат.");
        listOfAllEmployeesAndSalaries(storageOfEmployeeRecords);
        System.out.println("Сумма трат за месяц.");
        theAmountOfExpensesPerMonth(storageOfEmployeeRecords);
        System.out.println("Cреднее значение зарплат.");
        averageSalaryValue(storageOfEmployeeRecords);
        System.out.println("Сотрудник с минимальной зарплатой.");
        employeeWithMinimumWage(storageOfEmployeeRecords);
        System.out.println("Сотрудник с максимальной зарплатой.");
        employeeWithTheMaximumSalary(storageOfEmployeeRecords);
        System.out.println("Список сотрудников:");
        FIO(storageOfEmployeeRecords);


    }
    private static void listOfAllEmployeesAndSalaries(Employee[] storageOfEmployeeRecords){
        for (int i = 0 ;i < storageOfEmployeeRecords.length;i++) {
            System.out.println(storageOfEmployeeRecords[i]);
        }
        System.out.println();
    }
    private static void theAmountOfExpensesPerMonth(Employee[] storageOfEmployeeRecords){
        int sum = 0;

        for(int i = 0; i < storageOfEmployeeRecords.length;i++){
            sum+= storageOfEmployeeRecords[i].getSalary();
        }
        System.out.println(sum + " рублей.\n");
    }
    private static void employeeWithMinimumWage(Employee[] storageOfEmployeeRecords){
        Employee employeeWithMinimumWage = storageOfEmployeeRecords[0];
        for(int i = 1; i < storageOfEmployeeRecords.length;i++) {
            if (employeeWithMinimumWage.getSalary() > storageOfEmployeeRecords[i].getSalary()) {
               employeeWithMinimumWage = storageOfEmployeeRecords[i];
            }
        }
        System.out.println(employeeWithMinimumWage + "\n");
    }
    private static void employeeWithTheMaximumSalary(Employee[] storageOfEmployeeRecords){
        Employee employeeWithTheMaximumSalary = storageOfEmployeeRecords[0];
        for(int i = 0; i < storageOfEmployeeRecords.length;i++){
            if (employeeWithTheMaximumSalary.getSalary() < storageOfEmployeeRecords[i].getSalary()){
                employeeWithTheMaximumSalary = storageOfEmployeeRecords[i];
            }
        }
        System.out.println(employeeWithTheMaximumSalary  + "\n");
    }
    private static void FIO(Employee[] storageOfEmployeeRecords){
        for (int i = 0; i < storageOfEmployeeRecords.length; i++ ){
            System.out.println(storageOfEmployeeRecords[i].getFIO());
        }
    }
    private static void averageSalaryValue(Employee[] storageOfEmployeeRecords){
        int sum = 0;

        for(int i = 0; i < storageOfEmployeeRecords.length;i++){
            sum+= storageOfEmployeeRecords[i].getSalary();
        }
        System.out.println(sum/storageOfEmployeeRecords.length + "\n");

    }
}