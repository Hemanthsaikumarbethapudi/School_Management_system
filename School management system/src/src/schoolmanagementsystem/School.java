package schoolmanagementsystem;

import java.util.List;

public class School {
    private List<Teacher> teacher;
    private List<Student> student;
    private int totalMoneyearned;
    private int totalMoneyspent;

    public void School(List<Teacher> teacher,List<Student> student){
        this.teacher=teacher;
        this.student=student;
        totalMoneyearned=0;
        totalMoneyspent=0;

    }
       public List<Teacher> getTeacher(){
        return teacher;
       }
       public void setTeacher(List<Teacher> teacher){
        this.teacher=teacher;
       }
       public  List<Student> getStudent(){
        return student;
       }
       public void setStudent(List<Student> student){
        this.student=student;
       }
      public int getTotalMoneyearned(){
        return totalMoneyearned;
      }
      public void setTotalMoneyearned(int totalMoneyearned){
        this.totalMoneyearned=totalMoneyearned;
      }
      public int getTotalMoneyspent(){
        return totalMoneyspent;
      }
      public void setTotalMoneyspent(int totalMoneyspent){
        this.totalMoneyspent=totalMoneyspent;
      }

}
