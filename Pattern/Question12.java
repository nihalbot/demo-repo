import java.util.*;
public class Question12 {
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
                if(k % 2 != 0){
                    System.out.print("! ");
                }else{
                    System.out.print("* ");
                }
            }
            //next line pre
            star += 2;
            space--;
            System.out.println();
        }
    }
}
