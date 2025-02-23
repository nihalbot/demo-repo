import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row = n;
        int star = n;
        int space = 0;

        //row create
        for(int i = 0; i < row; i++){
            //space taking
            for(int j = 0; j < space; j++){
                System.out.print("  ");
            }
            //star print
            for(int k = 0; k < star; k++){
                System.out.print("* ");
            }
            //next line preparation
            space++;
            star--;
            System.out.println();
        }
    }
}
