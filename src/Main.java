public class Main {
    public static void main(String[] args) {
        Employee[] storageOfEmployeeRecords = new Employee[10];

        storageOfEmployeeRecords[0] = new Employee("Иванов Иван Иванович", 1, 500f);
        storageOfEmployeeRecords[1] = new Employee("Смирнов Владимир Петрович", 2, 450f);
        storageOfEmployeeRecords[2] = new Employee("Толстенко Ярослав Юрьевич", 3, 200f);
        storageOfEmployeeRecords[3] = new Employee("Гаврилов Максим Анатолич", 4, 600f);
        storageOfEmployeeRecords[4] = new Employee("Соколов Андрей Павлович", 5, 200f);
        storageOfEmployeeRecords[5] = new Employee("Иванков Сергей Карлович", 6, 600f);
        storageOfEmployeeRecords[6] = new Employee("Вовченко Данил Романович", 7, 100f);
        storageOfEmployeeRecords[7] = new Employee("Абрамов Константин Самойлович", 8, 400f);
        storageOfEmployeeRecords[8] = new Employee("Лихочев Евгений Николаевич", 9, 500f);
        storageOfEmployeeRecords[9] = new Employee("Ефимов Павел Сергеевич", 10, 200f);

        for (int i = 0 ;i < storageOfEmployeeRecords.length;i++) {
            System.out.println(storageOfEmployeeRecords[i]);
        }
        System.out.println();



        int sum = 0;

        for(int i = 0; i < storageOfEmployeeRecords.length;i++){
            sum+= storageOfEmployeeRecords[i].getSalary();
        }
        System.out.println("Сумма трат за месяц составила:" + sum + " рублей.\n");
        System.out.println("Cреднее значение зарплат:" + sum/storageOfEmployeeRecords.length + "\n");



        float max = storageOfEmployeeRecords[0].getSalary();
        float min = storageOfEmployeeRecords[0].getSalary();

        for(int i = 0; i < storageOfEmployeeRecords.length;i++){
            if (max < storageOfEmployeeRecords[i].getSalary()){
                max = storageOfEmployeeRecords[i].getSalary();
            }
            if (min > storageOfEmployeeRecords[i].getSalary()){
                min = storageOfEmployeeRecords[i].getSalary();
            }
        }
        System.out.println("Максимальная сумма:" + max + ", Минимальная сумма:" + min + "\n");



        for (int i = 0; i < storageOfEmployeeRecords.length; i++ ){
            System.out.println(storageOfEmployeeRecords[i].getFIO());
        }
    }
}