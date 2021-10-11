import java.util.*;
class Hash_set
{
    public static void main(String[] args)
    {
        HashSet<String> h = new HashSet<String>();
        h.add("Mumbai");
        h.add("Ratnagiri");
        h.add("pune");
        h.add("Jaipur");
        h.add("Nashik");
        h.remove("pune");          //to remove specific string
        System.out.println(h.contains("America"));// To check given string is present or not
        System.out.println(h);
        System.out.println(h.size());        //use to print size of hash set
        System.out.println(h.isEmpty());      //to check hash set is empty or not
        Iterator<String> it = h.iterator();

        while(it.hasNext())
            System.out.println(it.next());
    }
}

