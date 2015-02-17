/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juice;

import java.io.FileNotFoundException;
import java.util.Comparator;

class Comp implements Comparator<String> {

    @Override
    public int compare(String j1, String j2) {
        return j1.compareTo(j2);
    }
}

public class Juice {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        Juicer j = new Juicer();
        j.kindsOfJuices("juice.txt");
        j.filing(j.arr, "juice1.txt");
        Thread myThready = new Thread(() -> {
            Comp comp = new Comp();
            j.arr.sort(comp);

        });
        myThready.start();
        while (myThready.isAlive()) {
            myThready.join();
        }
        j.filing(j.arr, "juice2.txt");
    }
}
