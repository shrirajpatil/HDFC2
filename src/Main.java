//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Address addr1 = new Address("Mumbai","Maharashtra",400703 );
    Employee emp = new Employee("Shriraj",21,addr1,23,"SDE",95000.00f);
    emp.displayInfo();

            System.out.println();
        Address addr2 = new Address("Jalgaon","Maharashtra",425001 );
        Student stu = new Student("Shriraj",21,addr2,23,"A");
        stu.displayInfo();

    }
}

