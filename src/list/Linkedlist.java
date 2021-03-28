package list;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.add("india");
        l.add("is");
        l.add("best");
        l.add("country");
        System.out.println("contents of the linked list are ==>" + l);
        l.addFirst("first");
        System.out.println("contents of the linked list are ==>" + l);
        l.removeFirst();
        Iterator<String> i = l.iterator();
        while (i.hasNext()) {
            String S = new String();
            S = i.next();
            System.out.println(S);

        }
        int a = 0;
        System.out.println("printing with while");
        while (l.size() > a) {
            System.out.println(l.get(a));
            a++;


        }
    }
}
