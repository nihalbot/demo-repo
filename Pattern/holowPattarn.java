
import java.util.*;

public class holowPattarn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int star = (2*n) - 1;
        int space = star - 2;

        //for row
        for(int i = 0; i < n; i++){
            for(int j = 0; j < star; j++){
                if(i == 0 || i == n-1 || j == 0 || j == (2*n-2)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
