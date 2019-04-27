import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class counter {



        static Scanner keyb = new Scanner(System.in);
        static Random rand = new Random();
        static DecimalFormat formatter = new DecimalFormat("0.0%");

        public static void main(String[] args) {
            int oneDigitCounter = 0;
            int twoDigitCounter = 0;
            int threeDigitCounter = 0;
            int fourDigitCounter = 0;
            int fiveDigitCounter = 0;
            int sixDigitCounter = 0;
            int sevenDigitCounter = 0;
            int eightDigitCounter = 0;
            int nineDigitCounter = 0;

            int numbersToTest = getNumbersToTest();
            System.out.println("\nRandom numbers");
            for(int counter = 1; counter <= numbersToTest; counter++) {
                int number = getRandomNumber();
                System.out.println(number);
                int digit = getFirstDigit(number);

                if(digit == 1) {
                    oneDigitCounter++;
                }
                else if(digit == 2) {
                    twoDigitCounter++;
                }
                else if(digit == 3) {
                    threeDigitCounter++;
                }
                else if(digit == 4) {
                    fourDigitCounter++;
                }
                else if(digit == 5) {
                    fiveDigitCounter++;
                }
                else if(digit == 6) {
                    sixDigitCounter++;
                }
                else if(digit == 7) {
                    sevenDigitCounter++;
                }
                else if(digit == 8)
                {
                    eightDigitCounter++;
                }
                else {
                    nineDigitCounter++;
                }
            }

            printTable(numbersToTest,oneDigitCounter,twoDigitCounter,threeDigitCounter,fourDigitCounter,fiveDigitCounter,
                    sixDigitCounter,sevenDigitCounter,eightDigitCounter,nineDigitCounter);
        }

        public static int getNumbersToTest() {
            int number = -1;
            do {
                System.out.print("Enter the number of integers to process >> ");
                if(keyb.hasNextInt())
                {
                    number = keyb.nextInt();
                }
                else
                {
                    keyb.nextLine();
                }
            } while(number == -1);

            return number;
        }

        public static int getRandomNumber() {
            int number = rand.nextInt(999999) + 1;

            return number;
        }
        public static int getFirstDigit(int number) {
            int remainder = -1;

            while(number > 0)
            {
                remainder = number % 10;
                number = number / 10;
            }

            return remainder;
        }

        public static void printTable(int numbersToTest,int one,int two,int three,int four,int five, int six,int seven, int eight,int nine) {
            if(numbersToTest == 0)
            {
                System.out.println("No numbers to process");
            }
            else {
                System.out.println("\nFirst Digit Counter\n");
                System.out.printf("\tFirst Digit\tCount\tFrequency\n");
                System.out.printf("%14d %12d %10s\n",1,one,formatter.format((double)one/numbersToTest));
                System.out.printf("%14d %12d %10s\n",2,two,formatter.format((double)two/numbersToTest));
                System.out.printf("%14d %12d %10s\n",3,three,formatter.format((double)three/numbersToTest));
                System.out.printf("%14d %12d %10s\n",4,four,formatter.format((double)four/numbersToTest));
                System.out.printf("%14d %12d %10s\n",5,five,formatter.format((double)five/numbersToTest));
                System.out.printf("%14d %12d %10s\n",6,six,formatter.format((double)six/numbersToTest));
                System.out.printf("%14d %12d %10s\n",7,seven,formatter.format((double)seven/numbersToTest));
                System.out.printf("%14d %12d %10s\n",8,eight,formatter.format((double)eight/numbersToTest));
                System.out.printf("%14d %12d %10s\n",9,nine,formatter.format((double)nine/numbersToTest));
            }
        }
    }


