import java.util.Scanner;

public class MyTime {
    private int hours; // Write attribute for the hours.
    private int minuttes; // Write for the minuttes.
    private boolean keepruning;

    // getter for the hours.
    public int getHours(){
        return hours;
    }
    // setter for the hours:
    public void setHours(int hours){
        this.hours=hours;
    }
    // getter for the minuttes.
    public int getMinuttes(){
        return minuttes;
    }

    // setter for the minuttes
    public void setMinuttes(int minuttes){
        this.minuttes=minuttes;
    }
    // constructor for the MyTime
    public MyTime(int hours, int minuttes){
        this.hours=hours;
        this.minuttes=minuttes;
    }
    public void timeChoice() {  // Write a method for the timeChoice and use the do while loop.
        do {
            Scanner input = new Scanner(System.in);   // use the Scanner for enter the user choice.
            System.out.println("Enter the hour");
            hours = input.nextInt();  // take the input form the user.
            System.out.println("Enter the minuttes ");
            minuttes = input.nextInt(); // input the minutes from the user choice.
            System.out.println(hours + ":" + minuttes); // print the hours and minuttes.
        } while (keepruning=true);  // use the while loop to make sure to run a programme agsssing.


}
}
