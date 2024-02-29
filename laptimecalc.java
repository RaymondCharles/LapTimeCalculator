import java. util. Scanner;

public class laptimecalc
{
    public static void main(String[] args)
    {
        lapTimeDiff();
    }

    // A method to input numbers

    public static String inputString(String message)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        return scanner.nextLine();
    }

    public static void lapTimeDiff()
    {
        int totalLapTime = 0;
        int totalLaps = 0;
        int previousLapTime = 0;
        int Time = 0;
        String number = "";


        System.out.println("Training Run Data");
        System.out.println("-----------------");

        while(!number.equals("XXX"))
        {
            number = inputString("What was lap time " + (totalLaps + 1) + " (in s)? ");

         if (number.equals("XXX") )
            {
                break;
            }

            Time = Integer.parseInt(number);

            totalLaps++;
            totalLapTime += Time;
            if (totalLaps > 1)
            {
                int diff = Time - previousLapTime;
                System.out.println("Difference " + Math.abs(diff) + " seconds");
            }


            previousLapTime = Time;

        }

        System.out.println("You did " + totalLaps + " laps. Your total time today was " + totalLapTime + "s");






    }

}