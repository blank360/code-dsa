
// import java.util.Stack;

// class recursion{
    
//     public static void func(int i ,int n){
//         if(i>n) return;
//         System.out.println("neerav");
//         func(i+1 , n);
//     }
//     public static void main(String[] args){
//         int n = 4;
//         func(1,n);

//     }
// }
// ---------------------------------------------------------------------------------
// print 1 to n
// class recursion{
//     public static void func(int i , int n) {
//         if(i>n) return;

//         System.out.println(i);
//         func(i+1, n);


//     }
//     public static void main(String[] args) {
//         int n = 5;
//         func(1,n);       
//     }
// }
// --------------------------------------------------------------------------------------
// print n to 1
// class recursion{
//     public static void func(int n) {
//         if(n<1) return;
//         System.out.println(n);
//         func(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         func(n);
//     }
// }   
// -------------------------------------------------------------------------------------
// print 1 to n by backtracking
// class recursion {
    
//     static void func(int i, int n){
        
//             // Base Condition.
//             if(i<1) return;
            
//             // Function call to print(n-1) integers.
//             func(i-1,n);
//             System.out.println(i);

//     }
//     public static void main(String[] args) {

//        // Here, let’s take the value of n to be 4.
//        int n = 4;
//        func(n,n);
//     }
// }
// -----------------------------------------------------------------------------------------------
// wrong method
// class recursion{
//     public static void func(int n){
//         int sum = 0;
//         for(int i = 0 ; i < n+1; i++ ){
//             sum += i;
//         }
//         System.out.println(sum);
        
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         func(n);
//     }
// }
// ---------------------------------------------------------------------------------------------------
// class recursion{
//     public static int func(int n ){
//         if (n<1) return 0;
//         return n + func(n-1);
//     }
//     public static void main(String [] args){
//         int n = 5;
//         System.out.print(func(n));
//     }
// }
// -------------------------------------------------------------------------------------------------
// factorial of no.
// class recursion{
//     public static  int func(int n){
//         if (n<1) return 1 ;
//         return n * func(n - 1) ;
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.print(func(n));
//     } 
// }

// -------------------------------------------------------------------------------------------------
// reversing an array
// public class recursion{
//     staic void reveserArray(int arry[] , int start , int end){
//         if(start>end){
//             int tem = arry[start];
//             arry[start] = arry[end];
//             arry[end] = tem;
//             reveserArray(arry, start +1, end -1);
//         }
       
//     }
//     public static void main(String[] args) {
//         int arry[] = {5 , 1 , 4 , 2 , 6};
//         int start = 0;
//         int n = 5;
//         int end = 4;
//         reveserArray(arry , start , end);
        // for(int i = 0 ; i<n ; i++){
        //     System.out.println(arry[i]);
        // }
//     }
// }
// --------------------------------------------------------------------------------------------------
// public class recursion {
//    static void reverseArray(int arr[], int start, int end) {
//       if (start < end) {
//          int tmp = arr[start];
//          arr[start] = arr[end];
//          arr[end] = tmp;
//          reverseArray(arr, start + 1, end - 1);
//       }
//    }
//    public static void main(String[] args) {
//       int n = 5;
//       int arr[] = { 5, 4, 3, 2, 1};
//       reverseArray(arr, 0, n - 1);
//       for(int i = 0 ; i<n ; i++){
//         System.out.println(arr[i]);
//       }
//    }
// }
// --------------------------------------------------------------------------------------
// import java.util.*;
// public class recursion{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter no.");
//        int n = sc.nextInt();
//        System.out.println(n);
//    }
// }
//-----------------------------------------------------------------------------------

//  sort stack 

// import java.util.Stack;

// public class recursion{
//         private static void insrtedstack(Stack<Integer> stack , int element){
//                 if(stack.isEmpty() || stack.peek() <= element){
//                         stack.push(element);
//                         return;
//                 }
//                 int top = stack.pop();
//                 insrtedstack(stack, element);
//                 stack.push(top);
//         }
//         private static void sortstack(Stack<Integer> stack){
//                 if(stack.isEmpty()) return ;

//                 int top = stack.pop();
//                 sortstack(stack);
//                 insrtedstack(stack, top);
//         }
//         public static void main(String[] args) {
//              Stack<Integer> stack = new Stack<>();
//         stack.push(3);
//         stack.push(1);
//         stack.push(4);
//         stack.push(2);

//         System.out.println("Original Stack: " + stack);
//         sortstack(stack);
//         System.out.println("Sorted Stack: " + stack);
//         }
// }
//---------------------------------------------------------------------------------
//reevrsr a stack using recursion
// public class recursion{
//         private static void insert(Stack<Integer> stack , int element){
//                 if(stack.isEmpty()){
//                         stack.push(element);
//                 }
//                 else{
//                         int temp = stack.pop();
//                         insert(stack, element);
//                         stack.push(temp);
//                 }

//         }
//         private static void reverse(Stack<Integer> stack){
//                 if(stack.isEmpty()) return ;
                        

//                 int top = stack.pop();
//                 reverse(stack);
//                 insert(stack, top);

//         }
//         public static void main(String[] args) {
//                 Stack<Integer> stack = new Stack<>();
//                 stack.push(3);
//                 stack.push(1);
//                 stack.push(4);
//                 stack.push(2);
//                 System.out.print("original stack " + stack);
//                 reverse(stack);
//                 System.out.println("reversed stack" + stack);

            
//         }
// }
//------------------------------------------------------------------------------
