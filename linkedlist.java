//assigning one data in linkedlist from array 
// class Node{
//     int data ;
//     Node next;
//     Node(int data1){
//         this.data = data1;
//         this.next = null; // can be left/neglected 

//     }
// }
// public class linkedlist{
//     public static void main(String[] args) {
//         int[] arr = {3,4,5,6};
//         Node y = new Node(arr[0]);
//         System.err.println(y.data);
//     }
// }
//-------------------------------------------------------------------------------------
// assigning and printing all data to ll and cont the len
// class Node{
//     int data;
//     Node next;
//     Node(int data1, Node next1) {
//         this.data = data1;
//         this.next = next1;
//     }
//     Node(int data1){
//         this.data = data1;
//         this.next = null;
//     }
// }
// public class linkedlist{
//     private   static Node convarr(int[] arr){
//         Node head = new Node(arr[0]);
//         Node mover = head;
//         for(int i = 1 ; i< arr.length ; i++){
//             Node temp = new Node(arr[i]);
//             mover.next = temp;
//             mover = temp;    
//         }
//         return head; 
//     }
//     public static void main(String [] args){
//         int[] arr = {3 , 43  ,45 , 3};
//         Node head = convarr(arr);
//         int cnt = 0 ;
//         Node temp = head ;
//         while(temp != null ){
//             System.err.print(temp.data + " ");
//             temp = temp.next;
//             cnt ++;
//         }
//         System.out.println(" ");
//         System.out.print("length of arr is  - " + cnt);


//     }
// }
//------------------------------------------------------------------------------------
// inserting a value in ll
// class Node{
//     int data;
//     Node next;
//     Node(int data1 , Node next1){
//         this.data = data1;
//         this.next = next1 ;
//     }
//     Node(int data1){
//         this.data = data1;
//         this.next = null;
//     }

// }
// public class linkedlist{
    
//     public static void printll(Node head){
//         while(head != null){
//             System.out.print(head.data + " ");
//             head = head.next;
//         }
//     }
//     public static Node addnode(Node head , int val){
//         Node temp = new Node(val , head);
//         return temp;
//     }
    
//     public static void main(String[] args) {
//         int [] arr = {23 , 42  ,4   ,53  , 24 };
//         int val = 100;
//         Node head = new Node(arr[0]);
//         Node mover = head;
//         for(int i = 1 ; i< arr.length ; i++){
//             Node temp = new Node(arr[i]);
//             mover.next = temp;
//             mover = temp;
//         }
//         head = addnode(head, val);
//         printll(head);
//     }
// }
//-------------------------------------------------------------------------------------------------------
//deletion of value from ll
// class ListNode {
//     int val;
//     ListNode next;

//     ListNode(int val) {
//         this.val = val;
//     }
// }

// public class linkedlist {

//     // Method to delete a node (you only get the node to delete)
//     private void deleteNode(ListNode node) {
//         node.val = node.next.val;            // Step 1: copy next node's value
//         node.next = node.next.next;          // Step 2: skip over the next node
//     }

//     // Utility method to print the list
//     private void printList(ListNode head) {
//         ListNode current = head;
//         while (current != null) {
//             System.out.print(current.val);
//             if (current.next != null) System.out.print(" -> ");
//             current = current.next;
//         }
//         System.out.println();
//     }

//     // Main method to run the demo
//     public static void main(String[] args) {
//         Solution sol = new Solution();

//         // Step 1: Create the list 4 -> 5 -> 1 -> 9
//         ListNode head = new ListNode(4);
//         head.next = new ListNode(5);
//         head.next.next = new ListNode(1);
//         head.next.next.next = new ListNode(9);

//         System.out.print("Original list: ");
//         sol.printList(head);

//         // Step 2: Delete node with value 5 (only pass that node)
//         ListNode nodeToDelete = head.next; // node with value 5
//         sol.deleteNode(nodeToDelete);

//         System.out.print("After deletion: ");
//         sol.printList(head);
//     }
// }
//------------------------------------------------------------------------------------------------
//deletion of last element in ll
// Node class definition
// class Node {
//     int data;
//     Node next;
//     // Constructor with both data and next pointer
//     Node(int data1, Node next1) {
//         this.data = data1;
//         this.next = next1;
//     }
//     // Constructor with only data (next pointer set to null)
//     Node(int data1) {
//         this.data = data1;
//         this.next = null;
//     }
// }
// // LinkedList class
// public class  linkedlistist {
//     // Function to delete the tail of the linked list
//     private static Node deleteTail(Node head) {
//         // Check if the linked list is empty or has only one node
//         if (head == null || head.next == null)
//             return null;
//         // Create a temporary pointer for traversal
//         Node temp = head;
//         // Traverse the list until the second-to-last node
//         while (temp.next.next != null) {
//             temp = temp.next;
//         }
//         // Nullify the connection from the second-to-last node to delete the last node
//         temp.next = null;
//         // Return the updated head of the linked list
//         return head;
//     }
//     // Function to print the linked list
//     private static void printLL(Node head) {
//         while (head != null) {
//             System.out.print(head.data + " ");
//             head = head.next;
//         }
//     }
//     // Main method
//     public static void main(String[] args) {
//         // Initialize an array with integer values
//         int[] arr = {2, 5, 8, 7};
//         // Create the linked list with nodes initialized with array values
//         Node head = new Node(arr[0]);
//         head.next = new Node(arr[1]);
//         head.next.next = new Node(arr[2]);
//         head.next.next.next = new Node(arr[3]);
//         // Delete the tail of the linked list
//         head = deleteTail(head);
//         // Print the modified linked list
//         printLL(head);
//     }
// }
//------------------------------------------------------------------------------------------
//Find middle element in a Linked List
// class Node{
//     int data;
//     Node next;
//     Node(int data1, Node next1) {
//         this.data = data1;
//         this.next = next1;
//     }
//     Node(int data1){
//         this.data = data1;
//         this.next = null;
//     }
// }
// public class linkedlist{
//     private   static Node convarr(int[] arr){
//         Node head = new Node(arr[0]);
//         Node mover = head;
//         for(int i = 1 ; i< arr.length ; i++){
//             Node temp = new Node(arr[i]);
//             mover.next = temp;
//             mover = temp;    
//         }
//         return head; 
//     }
//     public static void main(String [] args){
//         int[] arr = {3 , 43  ,45 , 3};
//         Node head = convarr(arr);
//         int cnt = 0 ;
//         Node temp = head ;
//         while(temp != null ){
//             System.err.print(temp.data + " ");
//             temp = temp.next;
//             cnt ++;
//         }
//         System.out.println(" ");
//         System.out.print("length of arr is  - " + cnt);
//         int count =0;
//         System.out.println(" ");
//         while(temp != null){
//             temp = temp.next;
//             count ++;
//         }
//         int mid = count / 2 +1 ;
//         temp = head;
//         while(temp != null ){
//             mid = mid-1;
//             if(mid == 0) break ;
//             temp = temp.next;
//         }
//         System.out.print(temp.data);


//     }
// }
//-----------------------------------------------------------------------------
////reversing 
// class Node{
//     int data;
//     Node next;
//     Node(int data1, Node next1) {
//         this.data = data1;
//         this.next = next1;
//     }
//     Node(int data1){
//         this.data = data1;
//         this.next = null;
//     }
// }
// public class linkedlist{
//     private   static Node convarr(int[] arr){
//         Node head = new Node(arr[0]);
//         Node mover = head;
//         for(int i = 1 ; i< arr.length ; i++){
//             Node temp = new Node(arr[i]);
//             mover.next = temp;
//             mover = temp;    
//         }
//         return head; 

//     }
//     private static   Node reverseList(Node head) {
//         Node temp = head;
//         Node pre = null;

//         while( temp != null){
//             Node front = temp.next ;

//             temp.next = pre ;

//             pre = temp;

//             temp = front;
//         }
//         return pre;

//     }
//     public static void main(String [] args){
//         int[] arr = {3 , 43 ,56 , 67 ,45 };
//         Node head = convarr(arr);
//         int cnt = 0 ;
//         Node temp = head ;
//         while(temp != null ){
//             System.err.print(temp.data + " ");
//             temp = temp.next;
//             cnt ++;
//         }
//         System.out.println(" ");
//         System.out.print("length of arr is  - " + cnt);
//         int count =0;
//         System.out.println(" ");
//         Node pp = reverseList(head);
//         temp = pp;
//         while(temp != null ){
//             System.err.print(temp.data + " ");
//             temp = temp.next;
//             cnt ++;
//         }
//     }
// }
//--------------------------------------------------------------------------------------
//segregating even odd
// public ListNode oddEvenList(ListNode head) {
//     if (head == null || head.next == null) return head;

//     ListNode odd = head;
//     ListNode even = head.next;
//     ListNode evenHead = even;

//     while (even != null && even.next != null) {
//         odd.next = even.next;
//         odd = odd.next;

//         even.next = odd.next;
//         even = even.next;
//     }

//     odd.next = evenHead;
//     return head;
// }
//---------------------------------------------------------------------------------------------------
//finding loop length
// class Node{
//     int data;
//     Node next;
//     Node(int data1, Node next1) {
//         this.data = data1;
//         this.next = next1;
//     }
//     Node(int data1){
//         this.data = data1;
//         this.next = null;
//     }
// }
// public class linkedlist{
// static int findLength(Node slow, Node fast){
        
//         // count to keep track of 
//         // nodes encountered in loop
//         int cnt = 1;
        
//         // move fast by one step
//         fast = fast.next;
        
//         // traverse fast till it 
//         // reaches back to slow
//         while(slow!=fast){
            
//             // at each node increase
//             // count by 1 and move fast
//             // forward by one step
//             cnt++;
//             fast = fast.next;
//         }
        
//         // loop terminates when fast reaches
//         // slow again and the count is returned
//         return cnt;
//     }

//     // Function to find the length
//     // of the loop in a linked list
//     static int lengthOfLoop(Node head) {
//         Node slow = head;
//         Node fast = head;

//         // Step 1: Traverse the list to detect a loop
//         while (fast != null && fast.next != null) {
//             // Move slow one step
//             slow = slow.next;  
            
//             // Move fast two steps
//             fast = fast.next.next; 

//             // Step 2: If the slow and fast
//             // pointers meet, there is a loop
//             if (slow == fast) {
//                 return findLength(slow, fast);
//             }
//         }

//         // Step 3: If the fast pointer reaches the end
//         // there is no loop
        
//         return 0; 
//     }


//     public static void main(String[] args) {
//         // Create a sample linked list with a loop
//         Node head = new Node(1);
//         Node second = new Node(2);
//         Node third = new Node(3);
//         Node fourth = new Node(4);
//         Node fifth = new Node(5);

//         // Create a loop from fifth to second
//         head.next = second;
//         second.next = third;
//         third.next = fourth;
//         fourth.next = fifth;
//         // This creates a loop
//         fifth.next = second; 

//         int loopLength = lengthOfLoop(head);
//         if (loopLength > 0) {
//             System.out.println("Length of the loop: " + loopLength);
//         } else {
//             System.out.println("No loop found in the linked list.");
//         }
//     }
// }
//----------------------------------------------------------------------------------------
// delting N th node from back 
// class Node {
//     int data ;
//     Node next ;

//     Node(int data1 , Node next1){
//         this.data = data1;
//         this.next = next1;        
//     }
//     Node(int data1){
//         this.data = data1;
//         this.next = null;
//     }
// }
// public class linkedlist{
//     private static void printll(Node head){
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//     }
//     private static Node convearr(int[] arr){
//         Node head = new Node(arr[0]);
//         Node mover = head;
//         for(int i = 1 ; i < arr.length ; i++){
//             Node temp = new Node(arr[i]);
//             mover.next = temp;
//             mover = temp;
//         }
//         return head;

//     }
//     private static Node delnthbacNode(Node head , int n ){
//         Node fast = head ;
//         Node slow = head;
//         for(int i = 0 ; i<n ; i++){
//             fast = fast.next;
//         }
//         if(fast == null) return head;
//         while(fast.next != null){
//             slow = slow.next;
//             fast = fast.next;
//         }
//         Node temp = slow.next;
//         slow.next = slow.next.next;
//         return head;

//     }
//     public static void main(String [] args ){
//         int [] arr = {23 , 32 ,4 , 34 ,43 };
//         Node head = convearr(arr);
//         int n = 2;
//         head = delnthbacNode(head, n);
//         printll(head);


//     }
// }
//--------------------------------------------------------------------------------------------
//delete the middle node of ll
// class Node {
//     int data ;
//     Node next ;

//     Node(int data1 , Node next1){
//         this.data = data1;
//         this.next = next1;        
//     }
//     Node(int data1){
//         this.data = data1;
//         this.next = null;
//     }
// }
// public class linkedlist{
//     private static void printll(Node head){
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//     }
//     private static Node convearr(int[] arr){
//         Node head = new Node(arr[0]);
//         Node mover = head;
//         for(int i = 1 ; i < arr.length ; i++){
//             Node temp = new Node(arr[i]);
//             mover.next = temp;
//             mover = temp;
//         }
//         return head;

//     }
//     private static Node delmiidlenode(Node head){
//         Node fast = head;
//         Node slow = head;
//         fast = fast.next.next;
//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         slow.next = slow.next.next;
//         return head;
//     }
//     public static void main(String[] args) {
//         int [] arr = {23 , 32 ,4 , 34 ,43 };
//         Node head = convearr(arr);
//         head = delmiidlenode(head);
//         printll(head);
        
//     }

// }
//------------------------------------------------------------------------------------------
                                
// import java.util.*;

// // Node class represents a
// // node in a linked list
// class Node {
//     // Data stored in the node
//     int data;
    
//     // Pointer to the next node in the list
//     Node next;

//     // Constructor with both data and
//     // next node as parameters
//     Node(int data1, Node next1) {
//         data = data1;
//         next = next1;
//     }

//     // Constructor with only data as a
//     // parameter, sets next to null
//     Node(int data1) {
//         data = data1;
//         next = null;
//     }
// }

// // Class to perform operations on Linked List
// public class linkedlist{

//     // Function to sort a linked list
//     // using Brute Force approach
//     public static Node sortLL(Node head){
//         // Create a list to
//         // store node values
//         List<Integer> arr = new ArrayList<>();
        
//         // Temporary pointer to
//         // traverse the linked list
//         Node temp = head;
        
//         // Traverse the linked list and
//         // store node values in the list
//         while(temp != null){
//             arr.add(temp.data);
//             temp = temp.next;
//         }
        
//         // Sort the list
//         // containing node values
//         Collections.sort(arr);
        
//         // Reassign sorted values to
//         // the linked list nodes
//         temp = head;
//         for(int i = 0; i < arr.size(); i++){
//             // Update the node's data
//             // with the sorted values
//             temp.data = arr.get(i); 
//             // Move to the next node
//             temp = temp.next; 
//         }
        
//         // Return the head of the
//         // sorted linked list
//         return head; 
//     }

//     // Function to print the linked list
//     public static void printLinkedList(Node head) {
//         Node temp = head;
//         while (temp != null) {
//             // Print the data of the current node
//             System.out.print(temp.data + " "); 
//             // Move to the next node
//             temp = temp.next; 
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         // Linked List: 3 2 5 4 1
//         Node head = new Node(3);
//         head.next = new Node(2);
//         head.next.next = new Node(5);
//         head.next.next.next = new Node(4);
//         head.next.next.next.next = new Node(1);

//         System.out.print("Original Linked List: ");
//         printLinkedList(head);

//         // Sort the linked list
//         head = sortLL(head);

//         System.out.print("Sorted Linked List: ");
//         printLinkedList(head);
//     }
//}
//----------------------------------------------------------------------------
//Find the intersection point of Y LL
// class Node {
//     int data ;
//     Node next ;

//     Node(int data1 , Node next1){
//         this.data = data1;
//         this.next = next1;        
//     }
//     Node(int data1){
//         this.data = data1;
//         this.next = null;
//     }
// }
// public class linkedlist{
//     private static void printll(Node head){
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//     }
//     private static Node convearr(int[] arr){
//         Node head = new Node(arr[0]);
//         Node mover = head;
//         for(int i = 1 ; i < arr.length ; i++){
//             Node temp = new Node(arr[i]);
//             mover.next = temp;
//             mover = temp;
//         }
//         return head;

//     }
//     private static Node intersectionnode(Node head1 , Node head2){

//     }
//     public static void main(String[] args) {
//         int [] arr = {23 , 32 ,4 , 34 ,43 };
//         Node head = convearr(arr);
//         printll(head);
        
//     }
// }
//---------------------------------------------------------------------------------------------
//add 1 to to number formed by ll 
// class Node {
//     int data ;
//     Node next ;

//     Node(int data1 , Node next1){
//         this.data = data1;
//         this.next = next1;        
//     }
//     Node(int data1){
//         this.data = data1;
//         this.next = null;
//     }
// }
// public class linkedlist{
//     private static Node convearr(int[] arr){
//         Node head = new Node(arr[0]);
//         Node mover = head;
//         for(int i = 1 ; i < arr.length ; i++){
//             Node temp = new Node(arr[i]);
//             mover.next = temp;
//             mover = temp;
//         }
//         return head;

//     }
//     private static int addtonumber(Node head){
//         Node temp = head;
//         int k = 0 ;
//         while(temp != null){
//             k = k*10 + temp.data;
//             temp = temp.next;
//         }
//         k = k+1;
//         return k;
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5};
//         Node head = convearr(arr);
//         int j = addtonumber(head);
//         System.out.print(j);
//     }
// }
//----------------------------------------------------------------------------------------------------------------------

