package day2b;

public class Employee {
    // Thông tin
    public String name;
    public int age;
    public int salary;

    // Phương thức
    public Employee() {
    }

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Phuong thuc
    // In ra tong luong trong 1 nam
    public void yearSalary() {
        int yearSalary = this.salary * 12;
        System.out.println("Tổng lương: " + yearSalary);
    }

    // Co phai dong them thue hay ko?
    // VD: tong luong > 300tr -> dong them thue
    public void checkTax(){
        int yearSalary = this.salary * 12;
        if(yearSalary > 300){
            System.out.println("Cần đóng thêm thuế");
        }
    }
}
