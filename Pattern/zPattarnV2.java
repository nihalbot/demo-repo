import java.util.*;

public class zPattarnV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int star = n;
        int space = (n-2);

        //make row
        for(int i = 0; i < n; i++){
            //print star
            for(int j = 0; j < star; j++){
                if (i == 0 || i == n-1) {
                    System.out.print("* ");
                }
            }
            //print space
            for(int k = 0; k <= space; k++){
                System.out.print("  ");
            }

            //again print star
            if(i >= 1 && i <= n-2){
                for(int m = 0; m < 1; m++){
                System.out.print("* ");
            }
            }
            //next row prepararion
            space--;
            System.out.println();
        }
    }
}
