import java.util.*;
public class numberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int space = n - 1;
        int star = 1;
        int num = 1;

        //row
        for(int i = 0; i < n; i++){
            
            //space
            for(int j = 0; j < space; j++){
                System.out.print("\t");
            }
            //star
            for(int k = 0; k < star; k++){
                System.out.print(num + "\t");
                num++;
            }

            //next row prep
            star+=2;
            space--;
            System.out.println();

        }
    }
}
