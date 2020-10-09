import java.util.Scanner;
/** the program will allow the user to enter 10 integers and then find the largest integer out of the group
 *
 * @author Isaac
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    int arnum = 10;
    int[] num =new int[arnum];
    System.out.println("Please enter 10 integers");
    for(int i =0; i < num.length; i++){
    num[i] = input.nextInt();
    }
    int lgnum = num[0];
    for(int i=0; i < num.length; i++){
      if (num[i] > lgnum){
        lgnum = num[i];
      }
      }
      System.out.println("The largest number is " + lgnum);
    }
  }

