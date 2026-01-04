import java.util.Scanner;
public class Pattern_02_Right_Angled_Triangle_Pattern {
    // * 
    // * *
    // * * *
    // * * * * 
    // * * * * *
    public void pattern_02(int n){
        for (int i = 1;i <= n;i++){
            for(int j = 1; j<=i ;  j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Pattern_02_Right_Angled_Triangle_Pattern sol = new Pattern_02_Right_Angled_Triangle_Pattern();
    System.out.print("Enter Number Of Rows : ");
    int n = sc.nextInt();
    sol.pattern_02(n);
    sc.close();
    }
}
