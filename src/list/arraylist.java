package list;
import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<EMPLOYEE> a=new ArrayList<EMPLOYEE>();
        EMPLOYEE e1=new EMPLOYEE("nikhil",27,"admin");
        EMPLOYEE e2=new EMPLOYEE("rahul",29,"log");
        EMPLOYEE e3=new EMPLOYEE("aman",30,"met");

        a.add(e1);
        a.add(e2);
        a.add(e3);

        Iterator<EMPLOYEE> it=a.iterator();
        while(it.hasNext()){
            EMPLOYEE emp= it.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);

        }

    }

}