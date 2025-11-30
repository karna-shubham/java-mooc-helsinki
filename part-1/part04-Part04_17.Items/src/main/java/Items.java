
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Boolean flag = true;
        while (flag){
            System.out.println("Enter the name of product; Empty ends it");
            String product = scanner.nextLine();
            if (product.equals("")){
                break;
            }else{
                items.add(new Item(product));
            }
        }
        System.out.println(items);
            
        }

    }

