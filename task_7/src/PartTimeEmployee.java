public class PartTimeEmployee extends Employee {
    private double GioLam;
    private double salary;

    // Constructor
    public PartTimeEmployee(String name, int age, double gioLam, double salary) {
        super(name, age);
        this.GioLam = gioLam;
        this.salary = salary;
    }

    // Override phương thức tính lương
    @Override
    public double TinhLuong() {
        return GioLam * salary; // Nhân viên part-time nhận lương theo số giờ làm
    }

    // Getters và Setters cho hourlyRate và hoursWorked
    public double getGioLam() {
        return GioLam;
    }

    public void setLuong(double hourlyRate) {
        this.salary = hourlyRate;
    }

    public static void main(String[] args) {

    }

}