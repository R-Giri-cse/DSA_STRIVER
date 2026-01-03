import java.util.*;
// * * * * * 
// * * * * *
// * * * * *
// * * * * *
// * * * * *  
public class Pattern_01_Rectangular_Star_Pattern {
    public void pattern_01(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        Pattern_01_Rectangular_Star_Pattern sol = new Pattern_01_Rectangular_Star_Pattern();
        System.out.print("Enter Number Of Rows & Columns : ");
        int n = sc.nextInt();
        sol.pattern_01(n);
        sc.close();
    }
}

