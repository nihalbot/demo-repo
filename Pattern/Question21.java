import java.util.*;
public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row = n;
        int star = 1;
        int space = (2*n)-3;
        
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
            //again stat
            for(int l = 0; l < star; l++){
                if(row-1 == n-1 && l == n-1){
                    continue;
                }
                System.out.print("* ");
            }
            //next row pre
            star++;
            space -=2;
            System.out.println();
        }
    }
}
