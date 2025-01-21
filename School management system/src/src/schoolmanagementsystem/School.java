package schoolmanagementsystem;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyearned;
    private static  int totalMoneyspent;

    public  School(List<Teacher> teachers,List<Student> students){
        this.teachers=teachers;
        this.students=students;
        totalMoneyearned=0;
        totalMoneyspent=0;

    }
       public List<Teacher> getTeacher(){
        return teachers;
       }
       public void addTeacher(Teacher teacher){
            teachers.add(teacher);
       }
       public  List<Student> getStudent(){
        return students;
       }
       public void addStudent(Student student){
        students.add(student);
       }


      public int getTotalMoneyearned(){
        return totalMoneyearned;
      }
      public static void updateTotalMoneyearned(int Moneyearned)
      {
        totalMoneyearned+=Moneyearned;

      }
      public int getTotalMoneyspent(){
        return totalMoneyspent;
      }
      public static void updateTotalMoneyspent(int moneyspent){
        totalMoneyspent-=moneyspent;

      }

}
