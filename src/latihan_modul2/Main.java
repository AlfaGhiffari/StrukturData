package latihan_modul2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        ArrayList<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");

        Iterator<String> iterator = hewan.iterator();
        while(iterator.hasNext()){
            String animal = iterator.next();
            if(deleteHewan.contains(animal)){
                iterator.remove();
            }
        }

        System.out.println("Hasil penghapusan data:");
        for(String animal : hewan){
            System.out.println(animal);
        }
    }
}
