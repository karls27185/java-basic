package academy.section04_conditional;

import java.util.Arrays;
import java.util.Scanner;

public class UniversalWeekDay {
    public static void main(String[] args) {

        // read source data
        Scanner sc = new Scanner(System.in);
        var isMondayFirst = sc.nextBoolean();
        var day = sc.nextInt();
        String result = null;

        // processing
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (!isMondayFirst) {
            System.out.println("Array " + Arrays.toString(days));
            int n = 6;
            System.out.println(n);
            ShiftToRight(days, n);
        }
        for (int i = 0; i < days.length; i++) {
            if (day == i + 1) {
                result = days[i];
            }
        }
        System.out.println(Arrays.toString(days));

        // display results
        System.out.println(result);
    }

    public static void ShiftToRight(String[] a, int n) {
        String temp = a[n];
        for (int f = n; f > 0; f--) {
            a[f] = a[f - 1];
        }
        a[0] = temp;
        System.out.println("Array after shifting to right by one : " + Arrays.toString(a));
    }
}
