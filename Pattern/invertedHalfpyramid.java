
import java.util.*;
public class invertedHalfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int star = n;

        //row
        for(int i = 0; i < n; i++){
            //star
            for(int j = 0; j < star; j++){
                System.out.print("* ");
            }
            //next line prep
            star--;
            System.out.println();

        }
    }
}
