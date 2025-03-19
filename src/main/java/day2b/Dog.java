package day2b;

public class Dog {
    // Thuộc tính (khai báo như biên) và hành vi (hàm)
    public String name;
    public int age;
    public String color;

    // Phương thức khởi tạo
    public Dog() {

    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // Hành vi
    public void eat() {
        // Con chó + tên của nó + ăn thức ăn
        System.out.printf("Con chó %s ăn thức ăn \n", this.name);
    }

    public void run(String description) {
        System.out.printf("Con chó %s chạy rất %s \n", this.name, description);
    }

}

