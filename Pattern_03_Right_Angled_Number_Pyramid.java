import java.util.Scanner;
public class Pattern_03_Right_Angled_Number_Pyramid{
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    public void pattern_03( int n){
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern_03_Right_Angled_Number_Pyramid sol = new Pattern_03_Right_Angled_Number_Pyramid();
        System.out.print("Enter Number Of Rows : ");
        int n = sc.nextInt();
        sol.pattern_03(n);
        sc.close();
    }
}