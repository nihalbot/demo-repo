import java.util.*;
public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row = (2*n)-1;
        int star = 1;

        //row
        for(int i = 0; i < row; i++){
            //star
            for(int j = 0; j < star; j++){
                System.out.print("* ");
            }
            //next pre task
            if(i >= n-1){
                star--;
            }else{
                star++;
            }
            
            System.out.println();
        }
    }
}
