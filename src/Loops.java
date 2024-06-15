public class Loops {
    public static void main(String[] args) {

        Loops demo = new Loops();
        System.out.println(demo.print(3));

    }

    public int print(int n ) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=n; j++) {
                System.out.println("i = " + i + " , j = " + j );
            }
            System.out.println("End of inner loop");
        }
        System.out.println("End of outer loop");
        return n;
    }
}
