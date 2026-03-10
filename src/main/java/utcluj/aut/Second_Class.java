package utcluj.aut;
import java.util.Scanner;
public class Second_Class { new*
    public static void main(String[] args){ new*
        System.out.println("Da un numar plis: "); //sout tab
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        System.out.println("Suma primelor" + n + "numerele pare sunt:"+ firstNEvenSum);
}//psvm tab
    public static int firstNEvenSum(int n) { new*
            int sum =0;
            int i=0;
            for(int i=0;i<n;i++){//fori tab
                sum+= i;
                i+=2;
    }
            return sum;
}
