package codeChallenges;

import java.util.Arrays;

public class sumArrayValues {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7};
        int sumofValues = 0;
        
        for(int i : values){
            sumofValues += i;
    }
    System.out.println(sumofValues);
}
}