import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Student {
    public String name;
    public int age;
    public double[] diemso;
    public static List<Student> danhSachSinhVien = new ArrayList<>();
    public Student(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên: ");
        this.name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        this.age = scanner.nextInt();
        System.out.print("Nhập số lượng điểm: ");
        int soluongDiemso = scanner.nextInt();
        this.diemso = new double[soluongDiemso];
        for (int i = 0; i < soluongDiemso; i++) {
            System.out.println("Nhập điểm số thứ " + (i + 1) + ": ");
            this.diemso[i] = scanner.nextDouble();
        }
        danhSachSinhVien.add(this);
    }
    public static void hienThiDanhSachSinhVien() {
        for (Student sinhVien : danhSachSinhVien) {
            sinhVien.showAll();
        }
    }
    public static void luaChonThemSinhVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn có muốn thêm một sinh viên mới không? (Y/N): ");
        String luaChon = scanner.nextLine();
        if (luaChon.equalsIgnoreCase("Y")) {
            new Student();
        }
    }

    public static void luaChonHienThiDanhSachSinhVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn có muốn hiển thị thông tin của tất cả sinh viên không? (Y/N): ");
        String luaChon = scanner.nextLine();
        if (luaChon.equalsIgnoreCase("Y")) {
            hienThiDanhSachSinhVien();
        }
    }



    public void luaChonThayDoiThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn có muốn thay đổi thông tin sinh viên không? (Y/N): ");
        String luaChon = scanner.nextLine();
        if (luaChon.equalsIgnoreCase("Y")) {
            thaydoiThongTin();
        }
    }

    public void thaydoiThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên thay đổi: ");
        this.name = scanner.nextLine();
        System.out.print("Nhập tuổi thay đổi: ");
        this.age = scanner.nextInt();
        System.out.print("Nhập số lượng điểm thay đổi: ");
        int soluongdiemmoi = scanner.nextInt();
        this.diemso = new double[soluongdiemmoi];
        for (int i = 0; i < soluongdiemmoi; i++) {
            System.out.println("Nhập điểm số thay đổi thứ " + (i + 1) + ": ");
            this.diemso[i] = scanner.nextDouble();

        }
    }

    public void showAll(){
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Điểm: " + Arrays.toString(diemso));
        System.out.println("Điểm trung bình: " + GPA());

    }
    public double GPA(){
        if(diemso.length ==0){
            return 0;
        }
        double tongDiem = 0;
        for (double diem : diemso){
            tongDiem += diem;
        }
        return tongDiem / diemso.length;
    }
//    public void nhapEnterDeTiepTuc() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhấn Enter để tiếp tục...");
//        scanner.nextLine();
//    }
}
class Main3{
    public static void main(String[] args) {
        Student student = new Student();
        student.showAll();
        student.luaChonThayDoiThongTin();
        student.showAll();
        Student.luaChonThemSinhVien();
        student.showAll();
        Student.luaChonHienThiDanhSachSinhVien();
        Student student1 = new Student();
        Student.hienThiDanhSachSinhVien();
        double Sv1 = student.GPA();
        double Sv2 = student1.GPA();
        System.out.println("Sinh viên có ddiien cao la: ");
        if (Sv1 > Sv2){

         student.showAll();
        }else{
            student1.showAll();
        }

    }

}

