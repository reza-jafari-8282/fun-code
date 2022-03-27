import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner myObj = new Scanner (System.in);
      System.out.print ("Enter a number: ");
    int myNum = myObj.nextInt ();
    int myNum2 = myNum - 2;
    for (int i = 1; i <= myNum; i++)
      {
	System.out.print ("* ");
	if (i == myNum)
	  {
	    System.out.print ("\n");
	  }
      }
    for (int i = 1; i <= myNum2; i++)
      {
	System.out.print ("* ");
	for (int j = 1; j <= myNum2; j++)
	  {
	    System.out.print ("  ");
	  }
	System.out.print ("* \n");
      }
    for (int i = 1; i <= myNum; i++)
      {
	System.out.print ("* ");
	if (i == myNum)
	  {
	    System.out.print ("\n");
	  }
      }
  }
}
