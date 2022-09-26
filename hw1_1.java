import java.util.*;

public class hw1_1 {
    public static void main(String[] args) {
        TreeSet<Integer> numSet = new TreeSet<Integer>();
        Random random = new Random();

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }

        for (Integer n : a) {
            numSet.add(n);
        }

        System.out.println("電腦從1~100的整數中,亂數抽取10個不重複的號碼...");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("第 %d 個號碼: %d\n", i + 1, a[i]);
        }

        System.out.printf("物件內元素個數: %d\n", a.length);
        System.out.println("物件內元素的內容: " + numSet);
        System.out.println("第一個元素內容為: " + numSet.first());
        System.out.println("最後一個元素內容為: " + numSet.last());

        SortedSet<Integer> range = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 30 && a[i] <= 70) {
                range.add(a[i]);
            }
        }
        System.out.println("內容介於30~70者: " + range);

    }

}
