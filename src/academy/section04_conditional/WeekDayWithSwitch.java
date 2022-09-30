package academy.section04_conditional;


public class WeekDayWithSwitch {
    public static void main(String[] args) {
        // read source data
        var day = 8;

        // processing
        String result;
        switch (day) {
            case 1: {
                result = "Monday";
                break;
            }
            case 2: {
                result = "Tuesday";
                break;
            }
            case 3: {
                result = "Wednesday";
                break;
            }
            case 4: {
                result = "Thursday";
                break;
            }
            case 5: {
                result = "Friday";
                break;
            }
            case 6: {
                result = "Saturday";
                break;
            }
            case 7: {
                result = "Sunday";
                break;
            }
            default: {
                result = "Invalid day: " + day;
            }
        }

        // display results
        System.out.println(result);
    }
}
