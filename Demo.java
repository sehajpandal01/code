import java.util.ArrayList;
import java.util.Iterator;
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("a");
        aList.add("b");
        aList.add("c");
        aList.add("d");
        aList.add("e");
        System.out.println("The ArrayList elements are: ");
        for (String s: aList) {
            System.out.println(s);
        }
        Iterator i = aList.iterator();
        String str = "";
        while (i.hasNext()) {
            str = (String) i.next();
            if (str.equals("d")) {
                i.remove();
                System.out.println("\nThe element d is removed");
                break;
            }
        }
        System.out.println("\nThe ArrayList elements are: ");
        for (String s: aList) {
            System.out.println(s);
        }
    }
}