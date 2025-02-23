import java.util.*;

public class hollowInvertedHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int star = n;
        int space = n - 2;

        //row
        for(int i = 0; i < n; i++){
            //star
            for(int j = 0; j < star; j++){
                if(i ==0 || j == 0 || j == star-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            //next line pre
            star--;
            System.out.println();
        }
    }
}
