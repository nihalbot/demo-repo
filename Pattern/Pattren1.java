import java.util.*;

class Pattren1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter value of n : ");
    int n = sc.nextInt();

    int row = n;
    int star = n;

    for(int i = 0; i < row; i++){
        //print star
        for(int j = 0; j < star; j++){
            System.out.print("* ");
        }

        //next line preparation
        System.out.println();
    }
}
    
}