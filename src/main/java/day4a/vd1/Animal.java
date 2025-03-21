package day4a.vd1;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // Hanh vi: tao ra am thanh
    public void makeSound(){
        System.out.println("Animal make sound!");
    }
    // Hanh vi: co the chay hoac di chuyen
    public void run(){
        System.out.println("Animal can run");
    }
}
