public class Main {
    public static void main(String[] args) {

        System.out.println("Switch");
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        System.out.println("If then else");
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
    }

    public static void printDayOfWeek(int day){
        String dayOfTheWeek = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println("Day " + day + " is a " + dayOfTheWeek);
    }

    public static void printWeekDay(int day){
        String dayOfTheWeek = "Invalid Day";
        if(day == 0){
            dayOfTheWeek = "Sunday";
        } else if(day == 1){
            dayOfTheWeek = "Monday";
        } else if(day == 2){
            dayOfTheWeek = "Tuesday";
        } else if(day == 3){
            dayOfTheWeek = "Wednesday";
        } else if(day == 4){
            dayOfTheWeek = "Thursday";
        } else if(day == 5){
            dayOfTheWeek = "Friday";
        } else if(day == 6){
            dayOfTheWeek = "Saturday";
        }
        System.out.println("Day " + day + " is a " + dayOfTheWeek);
    }
}