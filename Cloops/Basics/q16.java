package Cloops.Basics;
import java.util.Scanner;

public class q16 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int sum=0;
    while(true) { 
        int n=sc.nextInt();
        if(n==0)
        {
            break;
        }
        sum=sum+n;
        
    }
    System.out.println(sum);
}    
}
