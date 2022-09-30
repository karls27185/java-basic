package academy.section04_conditional;

public class WeekDay {
    public static void main(String[] args) {
        //read source data
        var day = 1;

        //processing
        String result;
        if (day == 1) {
            result = "Monday";
        } else if (day == 2) {
            result = "Tuesday";
        } else if (day == 3) {
            result = "Wednesday";
        } else if (day == 4) {
            result = "Thursday";
        } else if (day == 5) {
            result = "Friday";
        } else if (day == 6) {
            result = "Saturday";
        } else if (day == 7) {
            result = "Sunday";
        } else {
            result = "Invalid day: " + day;
        }

        //display results
        System.out.println(result);
    }
}
