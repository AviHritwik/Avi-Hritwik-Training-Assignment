import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Assignment5Q1 {
    public static List<String> reverseSort(ArrayList<Fruit> fruits) {
        List<String> fruitName=new ArrayList<>();
        return (List<String>) fruits.stream().filter(f1 -> f1.getCalories() < 100)
                .sorted(Comparator.comparing(Fruit::getCalories).reversed());

    }

    public static ArrayList<Fruit> sort(ArrayList<Fruit> fruits) {
        return (ArrayList<Fruit>) fruits.stream().
                sorted(Comparator.comparing(Fruit::getColor));
    }

    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits){
        return (ArrayList<Fruit>) fruits.stream().filter(f1->f1.getColor().equals("RED"))
                .sorted(Comparator.comparing(Fruit::getPrice));
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Fruit fruit = new Fruit();
        ArrayList<Fruit> fruitList=new ArrayList<>();
        List<String> reverseSort=new ArrayList<>();
        ArrayList<Fruit> sort=new ArrayList<>();
        ArrayList<Fruit> filterRedSortPrice=new ArrayList<>();
        System.out.println("Enter fruit details : ");
        while(true)
        {
            System.out.print("Name : ");
            fruit.setName(input.next());
            System.out.print("Calorie : ");
            fruit.setCalories(input.nextInt());
            System.out.print("Price : ");
            fruit.setPrice(input.nextInt());
            System.out.println("Colour : ");
            fruit.setColor(input.next());
            fruitList.add(fruit);
            System.out.println("Enter \n\t1:- For more entry\n\t0:- to stop");
            if(input.nextInt()==0)
                break;
        }
        reverseSort=Assignment5Q1.reverseSort(fruitList);
        System.out.println("fruit names of low calories fruits(calories < 100) sorted in descending order of calories:\n"
                +reverseSort);
        sort=Assignment5Q1.sort(fruitList);
        System.out.println("color wise list of fruit names :\n"+sort);
        filterRedSortPrice=Assignment5Q1.filterRedSortPrice(fruitList);
        System.out.println("RED color fruits sorted as per their price in ascending order : \n"+filterRedSortPrice);
    }
}
