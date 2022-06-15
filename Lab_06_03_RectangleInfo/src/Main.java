import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length = 0;
        int width = 0;
        int area = 0;
        double diagonal = 0;
        String trash = "";
        boolean notInt = true;

        Scanner in = new Scanner(System.in);

        do
        {
            System.out.print("What is the length of the rectangle: ");
            if (in.hasNextInt())
            {
                length = in.nextInt();
                in.nextLine();

                if (length <=0)
                {
                    System.out.println("The length of a rectangle cannot be less than or equal to 0: " + length);
                    notInt = true;
                }
                else
                {
                    notInt = false;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please input a positive integer: " + trash);
                notInt = true;
            }
        }
        while (notInt);

        do
        {
            System.out.print("What is the width of the rectangle: ");
            if (in.hasNextInt())
            {
                width = in.nextInt();
                in.nextLine();

                if (width <=0)
                {
                    System.out.println("The width of a rectangle cannot be less than or equal to 0: " + width);
                    notInt = true;
                }
                else
                {
                    notInt = false;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please input a positive integer: " + trash);
                notInt = true;
            }
        }
        while (notInt);

        area = length * width;
        diagonal = Math.sqrt((length * length) + (width * width));

        System.out.println("The area of the rectangle is " + area + " and the length of the diagonal of the rectangle is " + diagonal + ".");



    }
}