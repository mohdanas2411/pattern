import java.util.*;

public class Pattern11 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                 System.out.print("*\t");
                 System.out.print("\t");
            }   
            System.out.println();
        }

    }
}

