import java.util.Scanner;

public class Rectangle {
    public int length;
    public int width;
    public Rectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        this.length = scanner.nextInt();
        System.out.print("Nhập chiều rộng: ");
        this.width = scanner.nextInt();
    }
    public int acreage(){
        return length * width;
    }
    public  int perimeter(){
        return (length + width) * 2;
    }
    public void hienthi(){
        System.out.println("Chiều dài HCN là: " + length);
        System.out.println("Chiều rộng HCN là: " + width);
        System.out.println("Diện tích HCN là: " + acreage());
        System.out.println("Chu vi HCN là: " + perimeter());

    }
    public void lengthNew() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài mới: ");
        this.length = scanner.nextInt();
    }

    public void widthNew() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng mới: ");
        this.width = scanner.nextInt();
    }
}
class Main2{
    public static void main(String[] args) {
        Rectangle hcn = new Rectangle();
        hcn.hienthi();
        hcn.lengthNew();
        hcn.widthNew();
        hcn.hienthi();
    }

}
