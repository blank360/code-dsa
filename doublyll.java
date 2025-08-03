
// import java.util.Scanner;

// //converting array to doublyll
// class Node{
//     int data ;
//     Node next;
//     Node back;

//     Node(int data1 , Node next1 , Node back1 ){
//         this.data = data1;
//         this.next = next1 ; 
//         this.back = back1;
//     }
//     Node(int data1){
//         this.data = data1;
//         this.next = null;
//         this.back = null;
//     }
// }
// public class doublyll{
//     private static Node convearr(int[] arr){
//         Node head = new Node(arr[0]);
//         Node prew = head;
//         for(int i = 1 ; i< arr.length ; i++){
//             Node temp = new Node(arr[i] , null , prew);
//             prew.next = temp ;
//             prew = temp ;
//         }
//         return head;
//     }
//     public static void main(String[] args) {
//         int [] arr = {32,4,34,43,23};
//         Node head = convearr(arr);
//         Node temp = head ;
//         while(temp != null ){
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }

//     }

// }
//------------------------------------------------------------------------------------
//deletion of head , tail
// class Node{
//     int data ;
//     Node next;
//     Node back;

//     Node(int data1 , Node next1 , Node back1 ){
//         this.data = data1;
//         this.next = next1 ; 
//         this.back = back1;
//     }
//     Node(int data1){
//         this.data = data1;
//         this.next = null;
//         this.back = null;
//     }
// }
// public class doublyll{
//     private static Node convearr(int[] arr){
//         Node head = new Node(arr[0]);
//         Node prew = head;
//         for(int i = 1 ; i< arr.length ; i++){
//             Node temp = new Node(arr[i] , null , prew);
//             prew.next = temp ;
//             prew = temp ;
//         }
//         return head;
//     }
//     private static Node delhead(Node head){
//         Node prew = head;
//         head = head.next;
//         head.back = null;
//         prew.next = null;
//         return head;
//     }
//     private static Node deltail(Node head){
//         Node tail = head ;
//         while (tail.next != null){
//             tail = tail.next;
//         }
//         Node prew = tail.back;
//         prew.next = null;
//         tail.back = null;

//         return head;
//     }
//     public static void main(String[] args) {
//         int [] arr = {32,4,34,43,23};
//         Node head = convearr(arr);
//         head = delhead(head);
//         head = deltail(head);
//         Node temp = head ;
//         while(temp != null ){
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }

//     }
// }
//------------------------------------------------------------------------------------------------------
//deleting kth element 
// class Node{
//     int data ;
//     Node next;
//     Node back;

//     Node(int data1 , Node next1 , Node back1 ){
//         this.data = data1;
//         this.next = next1 ; 
//         this.back = back1;
//     }
//     Node(int data1){
//         this.data = data1;
//         this.next = null;
//         this.back = null;
//     }
// }
// public class doublyll{
//     private static Node convearr(int[] arr){
//         Node head = new Node(arr[0]);
//         Node prew = head;
//         for(int i = 1 ; i< arr.length ; i++){
//             Node temp = new Node(arr[i] , null , prew);
//             prew.next = temp ;
//             prew = temp ;
//         }
//         return head;
//     }
//     private static Node delhead(Node head){
//         Node prew = head;
//         head = head.next;
//         head.back = null;
//         prew.next = null;
//         return head;
//     }
//     private static Node deltail(Node head){
//         Node tail = head ;
//         while (tail.next != null){
//             tail = tail.next;
//         }
//         Node prew = tail.back;
//         prew.next = null;
//         tail.back = null;

//         return head;
//     }
//     private static void printdll(Node head){
//         Node temp = head ;
//         while(temp != null ){
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//     }
//     private static Node delkthindex(Node head , int n){
//         if(head == null){
//             return null;
//         }
//         int ctr = 0;
//         Node knode = head;
//         while(knode != null){
//             ctr ++;
//             if(ctr == n) break;
//             knode = knode.next;
//         }
//         Node prew = knode.back;
//         Node front = knode.next;


//         if(prew == null && front == null ) return null;

//         else if(prew == null){
//             return delhead(head);
//         }

//         else if(front == null){
//             return deltail(head);
//         }

//         else{
//             prew.next = front;
//             front.back = prew;

//             knode.next = null;
//             knode.back = null;
            
//             return head;
//         }
//     }
    
//     public static void main(String[] args){
//         int [] arr = {32,4,34,43,23};
//         Node head = convearr(arr);
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the index to delete -->");
//         int n = sc.nextInt();
//         head = delkthindex(head, n);
//         printdll(head);
//         sc.close();

//     }
// }
//-------------------------------------------------------------------------------------------------------
//insert 






//--------------------------------------------------------------------------------------------
//reversing doubling ll
// class Node{
//     int data ;
//     Node next;
//     Node back;

//     Node(int data1 , Node next1 , Node back1 ){
//         this.data = data1;
//         this.next = next1 ; 
//         this.back = back1;
//     }
//     Node(int data1){
//         this.data = data1;
//         this.next = null;
//         this.back = null;
//     }
// }
// public class doublyll{
//     private static Node convearr(int[] arr){
//         Node head = new Node(arr[0]);
//         Node prew = head;
//         for(int i = 1 ; i< arr.length ; i++){
//             Node temp = new Node(arr[i] , null , prew);
//             prew.next = temp ;
//             prew = temp ;
//         }
//         return head;
//     }
//     private static Node reversenode(Node head ){
//         Node prew = head ;
        

//         return prew.back ;

//     }
//     public static void main(String[] args) {
//         int [] arr = {32,4,34,43,23};
//         Node head = convearr(arr);
//         Node temp = head ;

//         while(temp != null ){
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }

//     }

// }
//-----------------------------------------------------------------------------------------------------
//Delete all occurrences of a key in DLL
// class Node{
//     int data;
//     Node next;
//     Node back;

//     Node(int data1 , Node next1 , Node back1){
//         this.data = data1;
//         this.next = next1 ; 
//         this.back = back1;

//     }
//     Node(int data1){
//         this.data = data1;
//         this.next = null;
//         this.back = null;

//     }
// }
// public class doublyll{
//     private static Node printdll(Node head){
//         Node temp = head ;
//         while(temp != null){
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         return head;

//     }
//     private static Node delocurr(Node head , int key){
//         Node temp = head ;
//         while(temp != null){
//             if(temp.data == key){
//                 if(temp == head){
//                     head = temp.next;
//                 }
//                 Node front = temp.next;
//                 Node prew = temp.back;
//                 if(front != null) front.back = prew;
//                 if(prew != null) prew.next = front;
//                 temp = front;
//             }
//             else{
//                 temp = temp.next;
//             }
//         }
//         return head;
//     }
//     private static Node convearr(int[] arr){
//         Node head = new Node(arr[0]);
//         Node prew = head;
//         for(int i = 1 ; i< arr.length ; i++){
//             Node temp = new Node(arr[i] , null , prew);
//             prew.next = temp ;
//             prew = temp ;
//         }
//         return head;
//     }
//     public static void main(String[] args) {
//         int[] arr = { 10 , 4 ,10 ,10 , 6 ,10};
//         Node head = convearr(arr);
//         head = delocurr(head,10);
//         printdll(head);
//     }

// }
//-----------------------------------------------------------------------------------------------------
//Remove duplicates from sorted DLL
// class Node{
//     int data;
//     Node next;
//     Node back;

//     Node(int data1 , Node next1 , Node back1){
//         this.data = data1;
//         this.next = next1 ; 
//         this.back = back1;

//     }
//     Node(int data1){
//         this.data = data1;
//         this.next = null;
//         this.back = null;

//     }
// }
// public class doublyll{
//     private static Node printdll(Node head){
//         Node temp = head ;
//         while(temp != null){
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         return head;

//     }
//     private static Node removedup(Node head){
//         Node temp = head ;
//         while(temp != null && temp.next != null){
//             Node nextnode = temp.next;
//             while(nextnode != null && nextnode.data == temp.data){
//                 nextnode = nextnode.next;
//             }
//             temp.next = nextnode;
//             if(nextnode != null){
//                 nextnode.back = temp;
//             }
//             temp = temp.next;

//         }   
//         return head;
//     }
//     private static Node convearr(int[] arr){
//         Node head = new Node(arr[0]);
//         Node prew = head;
//         for(int i = 1 ; i< arr.length ; i++){
//             Node temp = new Node(arr[i] , null , prew);
//             prew.next = temp ;
//             prew = temp ;
//         }
//         return head;
//     }
//     public static void main(String[] args) {
//         int[] arr = { 1,1,1,2,3,3,4};
//         Node head = convearr(arr);
//         head = removedup(head);
//         printdll(head);
//     }

// }
//----------------------------------------------------------------------------------------
//

