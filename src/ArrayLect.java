import java.util.Arrays;
import java.util.Scanner;

public class ArrayLect {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int four = 4;
        int two = 2;

        int[] myArr;

        myArr = new int[four];

        int[] myArr2 = new int[two];

        System.out.println("myArr[1] = " + myArr[1]);

        System.out.println(myArr2[0]);
        System.out.println(myArr2[1]);

        myArr2[0] = 13;
        myArr2[1] = 21;

        System.out.println(myArr2[0]);
        System.out.println(myArr2[1]);

        String[] myStringArr = new String[1];
        System.out.println(myStringArr[0]);

        String[] myStringArr2 = new String[2];
        myStringArr2[0] = "A nice day today.";
//        myStringArr2[1] = 2;
        System.out.println(myStringArr2[0]);

        String[] mexicanPlates = {"soup", "apple", "tacos", "arroz con pollo"};
        System.out.println(mexicanPlates[3]);

        for (int i = 0; i < mexicanPlates.length; i += 1) {
            System.out.println(mexicanPlates[i]);
        }

        for (String mexicanPlate : mexicanPlates) {
            System.out.println(mexicanPlate);
        }

        int[] myFavorietNumber100Times = new int[100];
        Arrays.fill(myFavorietNumber100Times, 7);
        for (int myFavNum100x : myFavorietNumber100Times) {
            System.out.println(myFavNum100x);
        }

        int[] myFavNum100TimesAgain = Arrays.copyOf(myFavorietNumber100Times, 100);
        for (int i : myFavNum100TimesAgain) {
            System.out.println(i);
        }

        int[] myFavNum100TimesAgainAgain = Arrays.copyOf(myFavorietNumber100Times, 1);
        for (int i : myFavNum100TimesAgainAgain) {
            System.out.println(i);
        }

        System.out.println("Are these two arrays equal? " + Arrays.equals(myFavorietNumber100Times, myFavNum100TimesAgain));

        System.out.println("Are these two arrays equal? " + Arrays.equals(myFavorietNumber100Times, myFavNum100TimesAgainAgain));

        System.out.println(Arrays.toString(mexicanPlates));

        Arrays.sort(mexicanPlates);

        System.out.println(Arrays.toString(mexicanPlates));

        int[][] myMatrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Arrays.toString(myMatrix));

        for (int[] matrix : myMatrix) {
            System.out.println(Arrays.toString(matrix));
        }

        System.out.println(myMatrix[1][2]);

    }

}
