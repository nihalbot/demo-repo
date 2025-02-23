import java.util.*;
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row = n;
        int space = n-1;
        int star = 1;

        //row
        for(int i = 0; i < row; i++){
            //space
            for(int j = 0; j < space; j++){
                System.out.print("  ");
            }
            //star
            for(int k = 0; k < star; k++){
                System.out.print("* ");
            }
            //next line pre
            space--;
            star +=2;
            System.out.println();
        }
    }
}
