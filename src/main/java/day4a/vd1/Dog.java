package day4a.vd1;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Gau gau");
    }
}
