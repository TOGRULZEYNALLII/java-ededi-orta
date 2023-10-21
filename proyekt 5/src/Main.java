import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("reqemlerin sayini daxil et ");
      Scanner scanner= new Scanner(System.in);
        int count;
        count=scanner.nextInt();
        System.out.println("reqemleri daxil et");
      double number,sum=0;

        for ( int i=0;i<count;i++){
            number=scanner.nextInt();
            sum=sum+number;
        }
        double avarage=sum/count;
        System.out.println("reqemlerin ededi ortasi :" +avarage);

    }
}