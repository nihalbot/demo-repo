import java.util.*;
public class halfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int star = 1;

        //row
        for(int i = 0; i < n; i++){
            //print star
            for(int j = 0; j < star; j++){
                System.out.print("* ");
            }
            //next row preparation
            star++;
            System.out.println();
        }
    }
}
