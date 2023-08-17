package Lists;

import java.util.*;

public class List {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> rashan = new ArrayList<>();

        while(flag){
            printMessage();
            switch(Integer.parseInt(sc.nextLine())){
                case 0 -> flag = false;
                case 1 -> addItems(rashan);
                case 2 -> removeItems(rashan);
                default -> flag = false;
            }
        }
        rashan.sort(Comparator.naturalOrder());
            System.out.println(rashan);
    }

    public static void addItems(ArrayList<String> grocList){
        System.out.print("Add item(s) in your list (seprate it by comma): ");
        String[] item = sc.nextLine().split(",");
        // grocList.addAll(Arrays.asList(item));

        for(String i : item){
            String trimmed = i.trim();
            if(grocList.indexOf(trimmed) < 0){
                grocList.add(trimmed);
            } 
        }
    }

    public static void removeItems(ArrayList<String> grocList){
        System.out.print("Remove item(s) in your list (seprate it by comma): ");
        String[] item = sc.nextLine().split(",");
        // grocList.addAll(Arrays.asList(item));

        for(String i : item){
            String trimmed = i.trim();
            grocList.remove(trimmed);
            }
            
    }

    public static void printMessage(){
        String text = """
                Choose operations:
                0 -> to shutDown.
                1 -> to add item(s) to the list.
                2 -> to remove item(s) from the list.

                Enter your option :""";
        System.out.print(text + " ");
    }
}