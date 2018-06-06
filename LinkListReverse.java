import java.util.LinkedList;

class ReverseLinkedList {
  public static void main(String[] args) {
    
    System.out.println("Linked List Implementation");
    
   
    MyList list = new MyList();
    list.add(new Node(5));
    list.add(new Node(3));
    list.addFirst(new Node(1));
    list.add(new Node(9));
    
    System.out.println("Original list is: ");
    list.traverse();
    list.reverse();
    System.out.println("Reverse list is: ");
    list.traverse();
    System.out.println("Size of list is: " + list.getSize());
    
  }
}

class Node{

  int data;
  Node next = null;
  
  public Node(int d){
    this.data = d;
  }
   
}

class MyList{
  Node start;
  Node end;
  
  void addFirst(Node n){
    n.next = start;
    start = n;
  }
  
  void add(Node n){
    //if empty list
    if(this.end == null){
      start = n;
      end = n;
    }
    else{
   		this.end.next = n;
      	end = n;
    }
  }
  
  void deleteFirst(){
    start = start.next;
  }
  
  int getSize(){
    int length = 0;
    Node ptr = start;
    while(ptr.next != null){
      length++;
      ptr = ptr.next;
    }
    return length+1;
  }
  
  void delete(int index){
    
  }
  
  void traverse(){
    Node ptr = start;
    while(ptr.next != null){
      System.out.println(ptr.data + " ");
      ptr = ptr.next;
    }
     System.out.println(ptr.data + " ");
    
  }
  
  void reverse(){
    Node currentNode = start;
    Node previousNode = null;
    
    while(currentNode.next != null){
      Node nextNode = currentNode.next;
      if(currentNode == start){
        currentNode.next = null;
      }
      else{
        currentNode.next = previousNode;
      }
      previousNode = currentNode;
      currentNode = nextNode;
      
    }
    currentNode.next = previousNode;
    start = currentNode;
    
    
  }
  
}
