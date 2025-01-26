import java.util.*;

public class FibonacciNumber {
    static int iterativeWay(int n){
        int num1=0,num2=1;
        if(n==0 || n==1)
            return n;
        if(n==2)
            return 1;
        int fib=0;
        for(int i=3;i<=n;i++){
            fib=num1+num2;
            num1=num2;
            num2=fib;
        }
        return fib;
    }
    static int recursiveWay(int n){
        if(n<=1)
            return n;
        return recursiveWay(n-1)+recursiveWay(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        for(int i=0;i<=input;i++){

            System.out.println(i+"=="+ recursiveWay(i));
        }
    }
}
