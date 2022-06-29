package codeChallenges;

public class averageValue {
    public static void main(String[] args) {
        int[]array = {4, 5, 7, 8, 11};
        int sum = 0;
        int avgVal = 0;

        for(int i : array){
            sum += i;
        }
        int arrLen = array.length;
        int j = sum/arrLen;
        avgVal+=j;
        System.out.println(avgVal);
    }
}
