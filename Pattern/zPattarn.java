import java.util.*;
public class zPattarn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int star = n;

        //row
        for(int i = 0; i < n; i++){
            //star
            for(int j = 0; j < n; j++){
                if(i == 0 || i == n-1 ){
                    System.out.print("* ");
                }
                else if(j == star-1){
                    System.out.print("* ");

                }
                else{
                    System.out.print("  ");
                }
            }
            //next row pre
            star--;
            System.out.println();
        }
    }
}
