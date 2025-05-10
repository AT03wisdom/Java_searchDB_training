package printAssist;

public class PrintAssist {
    public static void printIntArray(int[] intArray) {
        StringBuilder lineBuilder = new StringBuilder();
        for (int num : intArray) {
            lineBuilder.append(num);
            if (num != intArray[intArray.length-1]) {
                lineBuilder.append(" , ");
            }
        }
        System.out.println(lineBuilder.toString());
    }
}
