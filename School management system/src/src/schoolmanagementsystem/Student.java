package schoolmanagementsystem;

public class Student {

            private int id;
            private  String name;
            private int grade;
            private int feesPaid;
            private int feesTotal;
            public Student(int id,String name,int grade){
                feesPaid=0;
                feesTotal=40000;
                this.id=id;
                this.name=name;
                this.grade=grade;
            }
            public void setGrade(int grade){
                this.grade=grade;
            }
            public void updateFeespaid(int fees){
                feesTotal+=fees;
            }
            public int getId(){
                return id;
            }
            public String getName(){
                return name;
            }
            public int getGrade(){
                return grade;
            }
            public int getFeesPaid(){
                return getFeesPaid();
            }
            public int getFeesTotal(){
                return getFeesTotal();
            }


}
