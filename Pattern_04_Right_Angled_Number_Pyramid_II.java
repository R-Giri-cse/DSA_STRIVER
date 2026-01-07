import java.util.Scanner;

public class Pattern_04_Right_Angled_Number_Pyramid_II {
    // 1
    // 2 2
    // 3 3 3
    // 4 4 4 4
    // 5 5 5 5 5
    public void pattern_04( int n){
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern_04_Right_Angled_Number_Pyramid_II sol = new Pattern_04_Right_Angled_Number_Pyramid_II();
        System.out.print("Enter Number Of Rows : ");
        int n = sc.nextInt();
        sol.pattern_04(n);
        sc.close();
    }
}
