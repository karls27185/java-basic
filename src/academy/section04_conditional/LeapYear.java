package academy.section04_conditional;

public class LeapYear {
    public static void main(String[] args) {
        var year = 2020;

        boolean isLeap;
//        if (year % 400 == 0) {
//            isLeap = true;
//        } else if (year % 100 == 0) {
//            isLeap =false;
//        } else if (year % 4 == 0) {
//            isLeap = true;
//        } else {
//            isLeap = false;
//        }

//        if ((year % 400 == 0) || ((year % 100 != 0 && (year % 4 == 0)))) {
//            isLeap = true;
//        } else {
//            isLeap = false;
//        }

        isLeap = (year % 400 == 0) || ((year % 100 != 0 && (year % 4 == 0)));


        System.out.println(isLeap ? year + " is leap year" : year + "is not leap year");
    }
}
