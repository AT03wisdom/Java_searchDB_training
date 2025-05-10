import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import printAssist.*;
import searchIntArray.*; // 3. & 4.

public class ArraySearcherApp {
    public static void main(String[] args) throws Exception {

        int[] degrees = {2, 345, 89, 132, 44, 288, 160, 91, 357, 60};
        ArrayList<Integer> listDegrees = new ArrayList<Integer>();
        for (int i : degrees) {
            listDegrees.add(i);
        }
        
        System.out.println("並び替え・探索アルゴリズムの演習");

        // 1. 配列のソートと線形探索
        System.out.println(Arrays.toString(degrees)); // ランダムなまま出力
        System.out.println(linearSearchIntArray(50, degrees));
        System.out.println(linearSearchIntArray(60, degrees));

        // 2. 配列のソート
        Arrays.sort(degrees);
        PrintAssist.printIntArray(degrees); // 昇順に並び替えたものを出力
        // （降順はIntegerじゃないと行えない, IntegerでもStringでも第二引数にCollections.reverseOrder()でできる）

        // // 3. 配列の二分探索 - 基本基本
        // BinarySearch.binarySearchIntIndex(357, degrees);
        // BinarySearch.binarySearchIntIndex(0, degrees);

        // 4. 配列の二分探索 - 指定の数より大きい値のうちの最小値
        // BinarySearch.binarySearchIntLowerBound(0, degrees);
        BinarySearch.binarySearchIntLowerBound(257, degrees);
        // BinarySearch.binarySearchIntLowerBound(358, degrees);

        // 5. ライブラリを使った降順ソートと二分探索
        System.out.println("並び替え・探索アルゴリズムの演習 : ArrayList");
        System.out.println(listDegrees);
        System.out.println(Collections.binarySearch(listDegrees, 0));
        System.out.println(listDegrees);

        Collections.sort(listDegrees);
        System.out.println(listDegrees);
        System.out.println(Collections.binarySearch(listDegrees, 2));
        System.out.println(Collections.binarySearch(listDegrees, 300));
        System.out.println(Collections.binarySearch(listDegrees, 357));
        System.out.println(Collections.binarySearch(listDegrees, 360));
    }

    // 線形探索法
    public static boolean linearSearchIntArray(int searchingNum, int[] nums) {
        for (int indexNum : nums) {
            if (indexNum == searchingNum) {
                return true;
            }
        }
        return false;
    }

    // 二分探索法
    // -> BinarySearch.binarySearchIntIndex(int searchingNum, int[] nums)
    // -> BinarySearch.binarySearchIntLowerBound(int minimumInput, int[] nums)
}
