import java.util.*;

class ReverseLL{
	Node head = null;
	Node tail = null;
    class Node{
		int data;
		Node next;
		Node(int data){
		this.next = null;
		this.data = data;
		}
		}
		
		void Insert(int data)
		{
			Node newNode = new Node(data);
			if(head == null){
				head = newNode;
				tail = newNode;
			}
			else{
				tail.next = newNode;
				tail = newNode;
			}
		}
		
		void display(){
			Node temp = head;
			if(head == null){
				System.out.println("List is empty");
			}
			else{
				
				while(temp!=null){
					System.out.print(temp.data+ " ");
					temp = temp.next;
				}
			}
		}
		
		Node reverse()
		{
			Node temp = head;
			Node prev = null;
			Node next = null;
			
			while(temp!=null){
				next = temp.next;
				temp.next = prev;
				prev = temp;
				temp = next;
			}
			head = prev;
			return head;
		}
		
		public static void main(String []args){
			ReverseLL r1 = new ReverseLL();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no of elements");
			int n = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter elements");
				for(int i = 0; i<n; i++){
					int k = sc.nextInt();
					r1.Insert(k);
				}
				
			// r1.Insert(10);
			// r1.Insert(20);
			// r1.Insert(30);
			r1.reverse();
			System.out.println();
			System.out.println();
			r1.display();
		}
}
			