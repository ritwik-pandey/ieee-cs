import java.util.*;
class Node{
	int val;
	Node next;
	Node prev;
	public Node(int val){
		this.val = val;
	}
}
class DoublyLinkedList{
	Node head;
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
	//	Scanner in = new Scanner(System.in);
		DoublyLinkedList obj = new DoublyLinkedList();
		while(true){
			System.out.println("\n1. Create\n2. Insert in front\n3. Insert at back\n4. Display\n5. Display backwards.\n6. Exit");
			int choice = in.nextInt();
			
			switch(choice){
				case 1:
					System.out.println("Enter the value");
					int val = in.nextInt();
					obj.create(val);
			
					break;
				case 2:
					obj.insertFront();
					
					break;
				case 3:
					obj.insertBack();
					
					break;
				case 4:
					obj.display();
					break;
				case 5:
					obj.displayback();
					break;
				default:
					System.exit(0);

			}
		}

	}

	public void create(int val){
		head = new Node(val);
		head.next = null;
		head.prev = null;
		
	}

	public void insertFront(){
	
		if(head == null){
			System.out.println("Create a LinkedList first!");
			return;
		}
		System.out.println("Enter the value");
                int val = in.nextInt();
		Node temp = new Node(val);
		temp.next = head;
		temp.prev = null;
		head.prev = temp;
		head = temp;
	}

	public void insertBack(){
		
		if(head == null){
			System.out.println("Create a LinkedList first!");
			return;
		}
		System.out.println("Enter the value");
                int val = in.nextInt();
                Node temp = new Node(val);

		Node temp2 = head;
		while(temp2.next != null){
			temp2 = temp2.next;
		}
		temp.prev = temp2;
		temp.next = null;
		temp2.next = temp;
		
	}

	public void display(){
		if(head == null){
			System.out.println("Create a LinkedList first!");
			return;
		}
		Node temp = head;
		while(temp != null){
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void displayback(){
		if(head == null){
			System.out.println("Create a LinkedList first!");
			return;
		}
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}

		while(temp != null){
			System.out.print(temp.val + " ");
			temp = temp.prev;
		}
		System.out.println();
	}
}
