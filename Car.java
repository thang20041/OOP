public class Car {
    public String name;
    public double cannang;
    public String mau;
    public int sobanh;
    public Car (String name, double cannang, String mau, int sobanh){
        this.name = name;
        this.cannang = cannang;
        this.mau = mau;
        this.sobanh = sobanh;
    }
    public void go(){
        System.out.println("dang chay ");
    }
}
class Main1{
    public static void main(String[] args) {
        Car oto1 = new Car("Mec",23.4,"Do",4);
    }
}

