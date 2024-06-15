import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Main demo = new Main();
        System.out.println(demo.FindDecimal(60, 20, 10));
    }

    public int FindDecimal(int a, int b, int d ) {
        int num = a - b - d;
        int dec = num * 10 / 2;
        return dec;
    }

}