import java.util.ArrayList;
import java.util.Arrays;

import printAssist.*;
import searchIntArray.*;

public class ArraySearcherApp {
    public static void main(String[] args) throws Exception {

        int[] degrees = {2, 345, 89, 132, 44, 288, 160, 91, 357, 60};
        ArrayList<int[]> listDegrees = new ArrayList<int[]>();
        listDegrees.add(degrees);
        
        System.out.println("並び替え・探索アルゴリズムの演習");

        // 1. 配列のソートと線形探索
        System.err.println(Arrays.toString(degrees)); // ランダムなまま出力
        System.out.println(linearSearchIntArray(50, degrees));
        System.out.println(linearSearchIntArray(60, degrees));

        // 2. 配列のソート
        Arrays.sort(degrees);
        PrintAssist.printIntArray(degrees); // 昇順に並び替えたものを出力
        // （降順はIntegerじゃないと行えない, IntegerでもStringでも第二引数にCollections.reverseOrder()でできる）

        // 2. 配列の二分探索 - 基本基本
        BinarySearch.binarySearchIntIndex(357, degrees);
        BinarySearch.binarySearchIntIndex(0, degrees);

        // 3. 配列の二分探索 - 指定の数より大きい値のうちの最小値
        BinarySearch.binarySearchIntLowerBound(0, degrees);
        BinarySearch.binarySearchIntLowerBound(257, degrees);
        BinarySearch.binarySearchIntLowerBound(358, degrees);
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
