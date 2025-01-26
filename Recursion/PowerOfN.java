import java.util.Scanner;

public class PowerOfN {
    static int powerOfN(int n) {
        if (n == 0)
            return 1;
        int smaller=powerOfN(n-1);
        int bigger=2*smaller;
        return bigger;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(powerOfN(n));
    }
}
