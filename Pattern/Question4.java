import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row = n;
        int space = n-1;
        int star = 1;

        //row
        for(int i = 0; i < row; i++){
            //space
            for(int s = 0; s < space; s++){
                System.out.print("  ");
            }
            //star
            for(int j = 0; j < star; j++){
                System.out.print("* ");
            }
            //next line pre
            space--;
            star++;
            System.out.println();
        }
    }
}
