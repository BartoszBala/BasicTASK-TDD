package SDA.TDD;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskBasic {

    public static int[] random3NumbersFromRange1to12()

    {int[] array=new int[3];
        Random random = new Random();
    for(int i=0;i<3;i++)
    {array[i]=random.nextInt(12);


    }
    Arrays.sort(array);
        return array;
    }

    public static int[] give3Numbers()

    { int[] userNumbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            System.out.println("podaj liczbę z zakresu 1-12");
            userNumbers[i]=scanner.nextInt();
        }

        Arrays.sort(userNumbers);
        return userNumbers;

    }

    public static int returnAmountOfWinNumber(int[] userNumber, int[] systemNumber)

    {
        int counter=0;


        for(int i=0; i<3;i++)
        {

            for(int j=0;j<3;j++)
            { if(userNumber[i]==systemNumber[j])

            {
                counter++;

            }

            }


        }




        return counter;
    }

    public static void showResult()

    {
int x=returnAmountOfWinNumber(give3Numbers(),random3NumbersFromRange1to12());
switch(x)

{

    case 0:
        System.out.println("IDIOT");
        break;
    case 1:
        System.out.println("POOR");
        break;
    case 2:
        System.out.println("NOT BAD");
        break;
    case 3:
        System.out.println("WIN");
        break;
}
    }






    public static void main(String[] args) {
showResult();


    }


}
