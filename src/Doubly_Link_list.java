public class Doubly_Link_list {
    Node head;
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) { data = d; }
    }
    public void InsertBefore(Node next_node, int new_data)
    {

        if (next_node == null) {
            System.out.println("The given next node can not be NULL");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.prev = next_node.prev;
        next_node.prev = new_node;
        new_node.next = next_node;
        if (new_node.prev != null)
            new_node.prev.next = new_node;
        else
            head = new_node;
    }
    public void push(int new_data)
    {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        new_Node.prev = null;
        if (head != null)
            head.prev = new_Node;
        head = new_Node;
    }
    public void printlist(Node node)
    {
        Node last = null;
        System.out.println(
                "Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println(
                "Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }
    public static void main(String[] args)
    {
        Doubly_Link_list dll = new Doubly_Link_list();
        dll.push(6);
        dll.push(7);
        dll.push(1);
        dll.push(9);
        dll.InsertBefore(dll.head.next.next, 5);

        System.out.println("Created DLL is: ");
        dll.printlist(dll.head);
    }
}

