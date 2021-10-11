import java.util.*;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Stack<String>stack=new Stack<String>();
        stack.push("Rajanikant");
        Queue<String>q1=new PriorityQueue();
        Queue<String>q2=new ArrayDeque();
        PriorityQueue<String>queue=new PriorityQueue<String>();
        Deque d=new ArrayDeque();

        Iterator<String> it = cars.iterator();

        while(it.hasNext())
        System.out.println(it.next());

    }
}