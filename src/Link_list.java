class Link_List
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d; next = null;
        }
    }
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void insertAfter(Node prev_node, int new_data)
    {
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }
    public void append(int new_data)
    {
        Node new_node = new Node(new_data);
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = new_node;
        return;
    }
    public void printList()
    {
        Node newnode = head;
        while (newnode != null)
        {
            System.out.print(newnode.data+" ");
            newnode = newnode.next;
        }
    }
    public static void main(String[] args)
    {
        Link_List newlist = new Link_List();
        newlist.push(1);
        newlist.append(3);
        newlist.insertAfter(newlist.head.next, 5);

        System.out.println("Display Linked List: ");
        newlist.printList();
    }
}
