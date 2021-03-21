package io.corejava.assignment5.Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment5Q3 {

    /**
     * 1. What are all the unique cities where the traders work?
     *
     * 2. Find all traders from Pune and sort them by name.
     *
     * 3. Return a string of all traders’ names sorted alphabetically.
     *
     * 4. Are any traders based in Indore?
     */

    public static List<String> printUniqueCities (List <Trader> traders) {
        return (List<String>) traders.stream().map(p-> p.getCity()).distinct();
    }

    public static List<String> tradersFromPuneSortByName(List<Trader> traders) {
        return (List<String>) traders.stream().filter(p->p.getCity().equals("Pune")).map(p->p.getName()).sorted();
    }
    public static String allTradersNames(List<Trader> traders) {
        return traders.stream().map(p->p.getName()).sorted().toString();
    }
    public static ArrayList<Trader> areAnyTradersFromIndore(ArrayList<Trader> traders) {
        return (ArrayList<Trader>) traders.stream().filter(p->p.getCity().equals("Indore"));
    }

    public static void main(String[] args) {
        List<Trader> traders=new ArrayList<>();
        Scanner input =new Scanner(System.in);
        System.out.println("Enter trader details : ");
        while(true)
        {
            Trader trader=new Trader();
            System.out.print("\t\tName : ");
            trader.setName(input.next());
            System.out.print("\t\tCity  : ");
            trader.setCity(input.next());
            traders.add(trader);
            System.out.println("Enter :\n\t1 :- More Entry \n\t0 :- Stop");
            if(input.nextInt()==0)
                break;
        }
        System.out.println(" unique cities where the traders work : \n"+printUniqueCities(traders));
        System.out.println("all traders from Pune and sorted by name : \n"+tradersFromPuneSortByName(traders));
        System.out.println("names sorted alphabetically : \n"+allTradersNames(traders));
        System.out.println("traders based in Indore :\n"+areAnyTradersFromIndore((ArrayList<Trader>) traders));
    }
}
