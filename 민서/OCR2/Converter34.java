package OCR2;
import java.util.Scanner;
abstract class Converter{
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;

    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
        System.out.println(getSrcString()+ "을 입력하세요>> ");
        double val = sc.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: " + res + getDestString()+ "입니다");
        sc.close();
    }
}

class Won2Dollar extends Converter{
    private int money;
    Won2Dollar(int money){
        super();
        this.money=money;
    }

    @Override
    protected double convert(double src) {
         src = src/money;
        return src;

    }

    @Override
    protected String getDestString() {
        return "달러";
    }

    @Override
    protected String getSrcString() {
        return "원";
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
        System.out.println(getSrcString()+ "을 입력하세요>> ");
        double val = sc.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: " + res + getDestString()+ "입니다");

    }
}

class Km2Mile extends Converter{
    private double mile;
    Km2Mile(double mile){
        this.mile =mile;
    }

    @Override
    protected String getSrcString() {
        return "Km";
    }

    @Override
    protected String getDestString() {
        return "mile";
    }

    @Override
    protected double convert(double src) {
        src = src/mile;
        return src;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
        System.out.println(getSrcString()+ "을 입력하세요>> ");
        double val = sc.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: " + res + getDestString()+ "입니다");
        sc.close();
    }
}

public class Converter34 {
    public static void main(String[] args) {
        Won2Dollar toDollar = new Won2Dollar(1200);
        toDollar.run();

        Km2Mile toMile = new Km2Mile(1.6);
        toMile.run();
    }


}
