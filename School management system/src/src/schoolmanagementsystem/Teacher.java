package schoolmanagementsystem;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    public int  getId(){
    return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
}
