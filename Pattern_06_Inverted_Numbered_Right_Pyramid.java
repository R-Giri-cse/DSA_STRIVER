import java.util.Scanner;
public class Pattern_06_Inverted_Numbered_Right_Pyramid {
    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    public void pattern_06(int n){
        for(int i = 0;i<n;i++){
            for(int j = 1 ;j<n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern_06_Inverted_Numbered_Right_Pyramid sol = new Pattern_06_Inverted_Numbered_Right_Pyramid();
        System.out.print("Enter Number Of Rows : ");
        int n = sc.nextInt();
        sol.pattern_06(n);
        sc.close();
    }
}
