package day2b;

public class Main2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Nguyen Van A", 25, 20);
        Employee e2 = new Employee("Nguyen Van B", 30, 30);

        // Kiem tra xem e1, e2 có tổng lương bao nhiêu và có ai phải đóng thêm thuế
        e1.yearSalary();
        e2.yearSalary();

        e1.checkTax();
        e2.checkTax();
    }
}
