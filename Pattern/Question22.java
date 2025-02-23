import java.util.*;
public class Question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row = n;
        int star = n;
        int space = -1;

        //row
        for(int i = 0; i < row; i++){
            //star
            for(int j = 0; j < star; j++){
                System.out.print("* ");
            }
            //space
            for(int k = 0; k < space; k++){
                System.out.print("  ");
            }
            //star
            for(int l = 0; l < star; l++){
                if(i == 0 && l == n -1){
                    continue;
                }
                System.out.print("* ");
            }
            //next line pre
            star--;
            space += 2;
            System.out.println();
        }
    }
}
