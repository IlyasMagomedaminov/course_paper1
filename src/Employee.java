public class Employee {
    private String FIO;
    private int department;
    private float salary;
    private static int counter;
    private int Id;

    public Employee(String FIO,int department,float salary) {
        this.FIO = FIO;
        this.department = department;
        this.salary = salary;
        this.Id = ++counter;

    }


    public String getFIO(){
        return this.FIO;
    }
    public int getDepartment(){
        return this.department;
    }
    public float getSalary(){
        return this.salary;
    }
    public int getId(){
        return this.Id;
    }



    // public void setFIO(String fio){
    //     this.FIO = fio;
    //}
    public void setDepartment(int department1){
        this.department = department1;
    }
    public void setSalary(int salary1){
        this.salary = salary1;
    }


    @Override
    public String toString() {
        return "Id:" + Id + ", Отдел:" + department + ", Ф.И.О: " + FIO + ", Зарплата: " + salary ;
    }
}