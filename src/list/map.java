package list;
import list.EMPLOYEE;


import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class map {


    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int a=S.nextInt();
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1,"india");
        hm.put(2,"bangladesh");
        hm.put(3,"china");
        

        for(HashMap.Entry m : hm.entrySet()){
            System.out.println(m.getKey()+"    "+ m.getValue());



        }
        hm.replace(3,"pak");
        for(HashMap.Entry m : hm.entrySet()){
            System.out.println(m.getKey()+"    "+ m.getValue());



        }
        HashMap<Integer, EMPLOYEE> emp=new HashMap<Integer,EMPLOYEE>();
        EMPLOYEE e1=new EMPLOYEE("nikil",25,"qa");
        EMPLOYEE e2=new EMPLOYEE("nikil",25,"qa");
        EMPLOYEE e3=new EMPLOYEE("nikil",25,"qa");
        emp.put(1,e1);
        emp.put(2,e2);
        emp.put(3,e3);


        for(HashMap.Entry<Integer,EMPLOYEE> m: emp.entrySet()){
            int k=m.getKey();
            EMPLOYEE e=m.getValue();
            System.out.println(k+"   "+e.name);

        }

    }
}
