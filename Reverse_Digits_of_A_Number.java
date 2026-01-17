import java.util.Scanner;
public class Reverse_Digits_of_A_Number {
    public void Solution(int num){
        int rev_num=0;
        while(num>0){
            int digit = num%10;
            num = num/10;
            rev_num=rev_num*10 + digit;
        }
        System.out.print("The Reverse Number Of This Number Is : " + rev_num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reverse_Digits_of_A_Number sol = new Reverse_Digits_of_A_Number();
        System.out.print("Entre A Number To Reverse The Number : ");
        int n = sc.nextInt();
        sol.Solution(n);
        sc.close();
    }
}
