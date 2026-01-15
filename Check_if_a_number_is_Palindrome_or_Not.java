import java.util.Scanner;
public class Check_if_a_number_is_Palindrome_or_Not {
    
    public void Solution(int num){
        int copy = num;
        int rev_num=0;
        while(copy>0){
            int digit = copy%10;
            copy = copy/10;
            rev_num=rev_num*10 + digit;
        }
        if(rev_num == num){
            System.out.print(num+" - Is A Palindorme Number .");
        }else{
            System.out.print( num+" - Is Not  A Palindorme Number. " );
        }
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Check_if_a_number_is_Palindrome_or_Not sol = new Check_if_a_number_is_Palindrome_or_Not();
        System.out.print("Entre A Number To Check Palindrome or Not : ");
        int n = sc.nextInt();
        sol.Solution(n);
        sc.close();
    }
}

