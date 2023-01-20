import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean employed = true;
        int noticePeriod = 2;
        int weeksWorked = 0;

        double payRate = 0;
        System.out.print("Enter your pay rate: ");
        payRate = input.nextDouble();

        String daysWorked = "";

        while (employed) {
            int weekNumber = 1;
            int weekHours = 0;
            double weekPay = 0;

            System.out.print("Week " + weekNumber + "\n");
            System.out.print("Enter the days you are available (M, T, W, TR, F, St, SN) separated by ',' or q to quit: ");
            daysWorked = input.nextLine();

            if (daysWorked.toUpperCase().equals("Q")) {
                if (weeksWorked >= noticePeriod) {
                    employed = false;
                    System.out.println("Thank you for two weeks notice");
                    break;
                } else {
                    System.out.println("You need to work " + noticePeriod + " more weeks after this week before quitting");
                    weeksWorked += 1;
                    continue;
                }
            }

            String[] days = daysWorked.toUpperCase().split(",");
            for (String day : days) {
                if (!day.equals("M") && !day.equals("T") && !day.equals("W") && !day.equals("TR") && !day.equals("F") && !day.equals("ST") && !day.equals("SN")) {
                    System.out.println("Invalid day. Please enter a valid day.");
                    continue;
                }

                if (day.equals("M")) {
                    weekHours += 5;
                }
                if (day.equals("T")) {
                    weekHours += 5;
                }
                if (day.equals("W")) {
                    weekHours += 5;
                }
                if (day.equals("TR")) {
                    weekHours += 5;
                }
                if (day.equals("F")) {
                    weekHours += 5;
                }
                if (day.equals("ST")) {
                    weekHours += 5;
                }
                if (day.equals("SN")) {
                    weekHours += 5;
                }
                weekPay += weekHours * payRate;
            }
            System.out.println("Weekly Hours: " + weekHours);
            System.out.printf("Weekly Pay: $%.2f", weekPay);
            weekNumber += 1;
            weekHours = 0;
            weekPay = 0;
        }
    }
}
