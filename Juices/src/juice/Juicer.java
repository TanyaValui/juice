/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juice;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Juicer {

    HashSet<String> set = new HashSet<String>();
    ArrayList<String> arr = new ArrayList<String>();

    void kindsOfJuices(String file) throws FileNotFoundException {

        Scanner in = new Scanner(new BufferedReader(new FileReader(file)));
        String str = new String();
        while (in.hasNext()) {
            while (in.hasNext()) {
                str += in.next();
                str += " ";
            }
        }
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            set.add(st.nextToken());
        }

        for (String entry : set) {
            arr.add(entry);
        }

    }


    void filing(ArrayList<String> list, String file) throws FileNotFoundException {
        File f = new File(file);
        Iterator it = list.iterator();
        PrintWriter out = new PrintWriter(f.getAbsoluteFile());
        while (it.hasNext()) {
                    out.println(it.next());
                }
        out.close();
    }

}
