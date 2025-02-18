package W02.chap06;

import java.util.Arrays;

public class E6_20 {

    static int[] shuffle(int[] arr) {
        int[] shuffled = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            shuffled[i] = (int) (Math.random() * arr.length + arr[0]);
            for (int j = 1; j < arr.length; j++) {
                if (shuffled[i] == shuffled[j]) {
                    j--;
                }
            }
            System.out.println(shuffled[i] );
        }


//        int[] shuffled = arr.clone();
//        int[] shuffled = new int[arr.length];
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                index = (int) (Math.random() * arr.length);
//                shuffled[j] = arr[index];
//            }
//            if (shuffled[index] == shuffled[i]) {
//                i--;
//            }
//        }

        return shuffled;
    }


    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(original));

        int[] result = shuffle(original);

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result));

    }
}
