import java.util.Scanner;

public class GiftTax{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int price = Integer.valueOf(scan.nextLine());
        double tax = 0;

        if (price<5000) {
            System.out.println("No Tax!");
        }else if (price>=5000 && price<25000) {
            tax = (100+(price-5000)*0.08);
            System.out.println(tax);
        }else if (price>=25000 && price<55000) {
            tax = (1700+(price-25000)*0.1);
            System.out.println(tax);
        }else if (price>=55000 && price<200000) {
            tax = (4700+(price-55000)*0.12);
            System.out.println(tax);
        }else if (price>=200000 && price<1000000) {
            tax = (22100+(price-200000)*0.15);
            System.out.println(tax);
        }else{//above of 1000000
            tax = (142100+(price-1000000)*0.17);
            System.out.println(tax);
        }
    }
}