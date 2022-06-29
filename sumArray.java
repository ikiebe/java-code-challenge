package codeChallenges;

public class sumArray {
    public static void main(String[] args) {
        int[]ary={4, 3, 1, 12, 10};
        int sum=0;

        for(int i = 0; i<ary.length; i++){
            sum += ary[i];
        }
        System.out.println(sum);
    }
}
