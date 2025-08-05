public class Student extends Person{
    private int rollno;
    private String grade;

    public Student(String name,int age,Address address,int rollno,String grade){
        super(name,age,address);
       this.rollno = rollno;
       this.grade=grade;
}

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    public void displayInfo(){
        super.displayInfo();
        System.out.println("Rollno:"+rollno);
        System.out.println("Grade:" + grade);
    }
}
