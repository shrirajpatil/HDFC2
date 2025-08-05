public class Person {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age,Address address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void displayInfo(){
        System.out.println("Name is:"+name);
        System.out.println("Age is:" + age);
        System.out.println("Address is:" + address);
    }
}
