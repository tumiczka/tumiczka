import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] threeSum = new int[4];
        threeSum[0] = 1;
        threeSum[1] = 341;
        threeSum[2] = 145;
        threeSum[3] = 13;
        System.out.println(Arrays.toString(threeSum));
        Arrays.sort(threeSum);
        System.out.println("A számok növekvő sorrendben: ");
        for (int i : threeSum)
            if (i > 0)
                System.out.println(i);
        System.out.println();
        int resultSum = 0;
        resultSum = threeSum[0] + threeSum[1] + threeSum[2];
        if (threeSum.length > 3)
            System.out.println(resultSum);
        else
            System.out.println(-1);

    }

}




