import java.util.Scanner;

public class Exercitii {
    public static void main(String[] args) {
        Scanner exerciseNumber = new Scanner(System.in);
        System.out.println("Introduceti numarul exercitiului dorit, intre 1 si 3");
        int exNumber = exerciseNumber.nextInt();
        switch (exNumber) {
            case 1:
                checkOddEven();
                break;
            case 2:
                evenDigitSum();
                break;
            case 3:
                sumOfSeries();
                break;


            default:
                System.out.println("Exercitiul selectat nu a fost gasit, va rog introduceti un numar intre 1 si 7");
                break;
        }

        System.out.println("Programul a fost inchis, la revedere !");
    }
//Exercitiul 1 :
    public static void checkOddEven() {
        System.out.println("Introduceti un numar:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("Numarul ales este PAR");
        } else {
            System.out.println("Numarul ales este IMPAR");
        }

    }


//Exercitiul 2:
        public static void evenDigitSum() {

            Scanner input = new Scanner(System.in);
            System.out.print("Introduceti un numar pentru a calcula suma cifrelor pare: ");
            int number = input.nextInt();
            int sum, lastDigit;
            int parsingNumber = number;

            for(sum=0; parsingNumber!=0; parsingNumber/=10){
                lastDigit = parsingNumber%10;
                if(lastDigit % 2 == 0)
                    sum += lastDigit;
            }

            System.out.println("Suma cifrelor pare ale numarului " + number + " este  = " + sum);

        }
        //Exercitiul 3:
    public static void sumOfSeries() {

        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti un numar 'n' pentru a calcula S=1^1+2^2+...+n^n : ");
        int number = input.nextInt();

        double sum=0;
        int n= number;

        for(int i=1, a=1; i<=n; i++, a+=1){
            sum= sum + Math.pow(i,a) ;
        }
        System.out.println("Suma este : "+sum);

    }
}
