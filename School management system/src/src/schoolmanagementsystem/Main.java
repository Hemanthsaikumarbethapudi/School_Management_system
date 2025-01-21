package schoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Teacher hemanth=new Teacher(1,"Hemanth",5000);
    Teacher sai=new Teacher(2,"sai",30000);
    Teacher kumar=new Teacher(3,"kumar",4000);
        List<Teacher> teacherList=new ArrayList<>();
        teacherList.add(hemanth);
        teacherList.add(sai);
        teacherList.add(kumar);


        Student amaran=new Student(510,"amaran",3);
        Student guy=new Student(345,"guy",5);
        Student tip=new Student(346,"tip",5);

        List<Student> studentList=new ArrayList<>();
        studentList.add(amaran);
        studentList.add(guy);
        studentList.add(tip);


        School ghs=new School(teacherList,studentList);


        amaran.payFees(3000);
        guy.payFees(5000);
        System.out.println("Lendischool is earned Rs "+ ghs.getTotalMoneyearned());

        System.out.println("----ghs pay the salary to the teacher----");
        hemanth.recievesalary(hemanth.getSalary());
        System.out.println("GHS has spent for salry "+hemanth.getName()+"and get ghs"+ghs.getTotalMoneyearned());

    }
}
