// Write a program to find whether a year is leap or not.
public class Q18 {

  public static void main(String[] args) {

    int year = 2004;
    boolean leap = false;


    if (year % 4 == 0) {

      if (year % 100 == 0) {

        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }

      else
        leap = true;
    }
    
    else
      leap = false;

    if (leap)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");
  }
}