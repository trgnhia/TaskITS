public class FullTimeEmployee extends Employee {
    private double salary;
    private double MonthSalary;
    private int Day;
    private Double thuong;

    // Constructor
    public FullTimeEmployee(String name, int age,double salary, int Day, Double thuong) {
        super(name, age); //gọi constructor của lớp cha, cho phép khởi tạo các thuộc tính mà lớp con kế thừa từ lớp cha.
        this.salary = salary;
        this.Day = Day;
        this.thuong = thuong;
    }

    // Override phương thức tính lương
    @Override
    public double TinhLuong() {
        MonthSalary = Day * salary + thuong;
        return MonthSalary;
    }

    // Getters và Setters cho monthlySalary
    public double getMonthlySalary() {
        return MonthSalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.MonthSalary = monthlySalary;
    }

    public static void main(String[] args) {

    }
}