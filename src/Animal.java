public class Animal {
    private String name;
    public Animal(){
        this.name= "animal1";
    }
    public Animal(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void  eat(){
        System.out.println(name + " is eating");
    }
    public void makenoise(){
        System.out.println(name + " is making noise");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public void roam(){
        System.out.println(name + " is roaming");
    }
}
