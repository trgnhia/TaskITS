
//Mục tiêu: Tạo lớp Employee với các thuộc tính cơ bản, và các lớp con như FullTimeEmployee, PartTimeEmployee kế thừa từ Employee.
//Yêu cầu:
//Mỗi lớp con sẽ có phương thức tính lương khác nhau.
//In ra thông tin và lương của từng nhân viên.

public class Employee {
    private String name;
    private int age;

    // Constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Phương thức tính lương (sẽ được override - ghi đè trong lớp con)
    public double TinhLuong() {
        return 0.0;
    }

    //pt in tt
    public void printInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Lương: " + TinhLuong());
    }

    // Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//Setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Nguyen Van A", 30, 1234.0, 24, 120.0 );
        // Tạo nhân viên part-time
        PartTimeEmployee partTimeEmp = new PartTimeEmployee("Tran Thi B", 25, 15.0, 80);

        // In thông tin và lương của từng nhân viên
        System.out.println("Thông tin nhân viên full-time:");
        fullTimeEmp.printInfo();

        System.out.println("\nThông tin nhân viên part-time:");
        partTimeEmp.printInfo();
    }
}

