import java.util.Scanner;

public class HMSConverter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of hours: ");
        int hours = sc.nextInt();
        System.out.print("Enter the number of minutes: ");
        int minutes = sc.nextInt();
        System.out.print("Enter the number of seconds: ");
         int seconds = sc.nextInt();

        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        System.out.println("Total seconds: " + totalSeconds);
    
       
        
    sc.close();
    }
}
