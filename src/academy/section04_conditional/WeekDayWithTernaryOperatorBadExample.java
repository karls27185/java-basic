package academy.section04_conditional;

public class WeekDayWithTernaryOperatorBadExample {
    public static void main(String[] args) {
        {
            var day = 1;
            System.out.println(
                    day == 1 ? "Monday" :
                            day == 2 ? "Tuesday" :
                                    day == 3 ? "Wednesday" :
                                            day == 4 ? "Thursday" :
                                                    day == 5 ? "Friday" :
                                                            day == 6 ? "Saturday" :
                                                                    day == 7 ? "Sunday" :
                                                                            "Invalid day" + day);
        }
        {
            var day = 7;
            var isMondayFirst = true;

            System.out.println(
                    (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 1 ? "Monday" :
                            (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 2 ? "Tuesday" :
                                    (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 3 ? "Wednesday" :
                                            (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 4 ? "Thursday" :
                                                    (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 5 ? "Friday" :
                                                            (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 6 ? "Saturday" :
                                                                    (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 7 ? "Sunday" :
                                                                            "Invalid day: " + day);
        }
    }
}
