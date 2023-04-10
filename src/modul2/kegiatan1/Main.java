package modul2.kegiatan1;

import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> listAnimal = new ArrayList<>();
// 1
        System.out.println();
        listAnimal.add("Angsa");
        listAnimal.add("Bebek");
        listAnimal.add("Cicak");
        listAnimal.add("Domba");
        listAnimal.add("Elang");
        listAnimal.add("Gajah");
        System.out.println(listAnimal);

// 2
        listAnimal.add("Badak"); // add badak and bebek
        listAnimal.add("Bebek"); System.out.println();
        System.out.println(listAnimal);
        int totalGoose = Collections.frequency(listAnimal, "Bebek"); // count many goose
        System.out.println("Total Bebek : " +totalGoose);
        System.out.print("Index of Bebek: "); // index of goose
        System.out.print("| ");
        for (int i = 0; i < listAnimal.size(); i++){
            if (listAnimal.get(i) == "Bebek"){
                System.out.print(i);
            } System.out.print(" | ");
        }

// 3
        System.out.println("\n");
        listAnimal.remove(1); // remove first goose
        System.out.println(listAnimal);

// 4
        System.out.println("Index 0: " +listAnimal.get(0)); // display element index 0 & 2
        System.out.println("Index 2: " +listAnimal.get(2));
        listAnimal.remove(0); // remove index 0
        System.out.println(listAnimal); System.out.println();

// 5
        listAnimal.set(0, "Ular"); // change lizard to snake
        System.out.println(listAnimal);
        listAnimal.add(2, "Itik");
        System.out.println(listAnimal); System.out.println();

// 6
        listAnimal.remove("Bebek");  // index 2
        listAnimal.remove("Elang");  // index 3
        listAnimal.remove("Gajah");  // index 4
        System.out.println(listAnimal);

// 7
        System.out.println("The first element\t: " + listAnimal.get(0));
        System.out.println("The last element\t: " + listAnimal.get(listAnimal.size()-1));

// 8
        System.out.println("Size of List\t: " +listAnimal.size());

// 9
        System.out.println("Index of Badak\t: " +listAnimal.indexOf("Badak"));

    }
}
