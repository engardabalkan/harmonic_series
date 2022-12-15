import java.util.Scanner;
public class harmonic_series {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter n number:");
        int n=inp.nextInt();
        double result=0;

        for (double i=1;i<=n;i++){
            result+=1/i;
        }
        System.out.println("Harmonic series:"+result);

    }
}