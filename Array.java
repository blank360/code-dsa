

//     public static void gratest(int[] arry, int low) {
//         int i =0 ;
//         int k = 0;
//         int counter = 0;
//         // while (counter < 2) {
//         for (int j = 0; j <= arry.length - 1; j++) {
//              i = arry[low];

//             if (i < arry[j]) {
//                 i = arry[j];
//                 k = j;
//             }
//         }
//         // }
//         // arry[k] = 0;
//         i = arry[low];
//         System.out.println("Greatest no. " + i);
//         for(int j = 0 ; j<=arry.length -1; j++){
//             if(i<arry[j] && i!=arry[k]){
//                 i = arry[j];

//             }
//         }
//         System.out.println("second greatest value is " + i);

//         // int highest = arry[low];
//         // // int lowest = arry[low];

//         // for (int j = 0; j <= arry.length - 1; j++) {
//         //     if(arry[j] > highest){
//         //         highest = arry[j];
//         //     }
//         // }
//         // int lowest=arry[low];
//         // for(int j = 0; j <= arry.length - 1; j++)
//         // {
//         //     if(arry[j] < highest && arry[j] >= lowest){
//         //         lowest = arry[j];
//         //     }
//         // }
//         // System.out.println(arry [j]);

//     }

//     public static void main(String[] args) {
//         int arry[] = {35, 345, 2, 654, 43, 654};
//         int low = 0;
//         gratest(arry, low);

//     }
// }
// --------------------------------------------------
// Check if the array is sorted
// public class Array{
//    static boolean isSorted(int arr[], int n) {
//     for (int i = 1; i < n; i++) {
//       if (arr[i] < arr[i - 1])
//         return false;
//     }

//     return true;
//     }
//     public static void main(String[] args) {
//         int [] arr = {2 , 3 , 5 , 4};
//         int n = arr.length;
//         isSorted(arr, n);
//     }
// }
// --------------------------------------------------
// Remove duplicates from Sorted array
// public class Array{
//     public static void main(String[] args) {
//        int arr[] = {1,1,2,2,2,3,3};
//         int k = removeDuplicates(arr);
//         System.out.println("The array after removing duplicate elements is ");
//         for (int i = 0; i < k; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     static int removeDuplicates(int[] arr) {
    //     int i = 0;
    //     for (int j = 1; j < arr.length; j++) {
    //         if (arr[i] != arr[j]) {
    //             i++;
    //             arr[i] = arr[j];
    //         }
    //     }
    //     return i + 1;
    // }
// }
// --------------------------------------------------------------
// public class Array{
//     public static void leftshift(int[] nums , int k){
//         int temp = nums[0];
//         for(int i = 0 ; i< k-1 ; i++){
//             nums[i] = nums[i+1];
//         }
//         nums[k-1] = temp;
//         for(int i = 0; i<=k-1 ; i++){
//             System.out.println(nums[i]);
//         }
//     }
//     public static void main(String[] args) {
//         int[] nums = {4 , 5, 3,2 ,3};
//         int k = nums.length;
//         leftshift(nums, k);
//     }
// }
// ===========================
// class Array{
// static void solve(int arr[], int n) {
//   int temp = arr[0]; // storing the first element of array in a variable
//   for (int i = 0; i < n - 1; i++) {
//     arr[i] = arr[i + 1];
//   }
//   arr[n - 1] = temp; // assigned the value of variable at the last index
//   for (int i = 0; i < n; i++) {
//     System.out.print(arr[i]+" ");
//   }

  
// }
// public static void main(String args[]) {
//   int n=5;
  
//   int arr[]= {1,2,3,4,5};
//   solve(arr, n);
// }
// }
// ---------------------------------------------------------
// shifting left from d position 
// public class Array{
//     public static void leftsort(int[] arr , int n , int k ){
//         k = k%n ;
//         int [] temp = new int[k];
//         for(int i = 0; i<k ; i++){
//             temp[i] = arr[i];
//         }
//         for(int i = 0 ; i<n-k ; i++){
//             arr[i] = arr[i+k];
//         }
//         int j = 0 ;
//         for(int i =k; i<n-1 ; i++){
//             arr[i] = temp[j];
//             j++;
//         }
//         for ( int i = 0; i<n ; i++){
//             System.out.println(arr[i]);
//         }

//     }
//     public static void main(String[] args) {
//         int[] arr = {3 , 4, 4,3,2, 5};
//         int n = arr.length;
//         int k = 3; 
//         leftsort(arr, n , k);

//     }
// }
// ------------------------------------------------------
// putting zero at the end 
// public class Array{
    // public static void zeroend(int[]arry , int n){
    //     int count = 0 ;
    //     for(int i = 0 ; i < n ; i++){
    //         if(arry[i] != 0){
    //             count ++;
    //         }
    //     }
    //     System.err.println(count);
    //     int j = 0;
    //     int [] temp = new int[count];
    //     for (int i = 0; i <n; i++){
    //         if (arry[i] != 0 ){
    //             temp[j]= arry[i];
    //             j++;
    //         }
    //     }
    //     for(int i =0 ; i<count;i++ ){
    //         arry[i] = temp[i];
    //     }
    //     for(int i = count ; i < n ; i++){
    //         arry [i] = 0 ;
    //     }
    //     for(int i = 0 ; i < n ; i++ ){
    //         System.out.print(arry[i]);
    //     }
    // }
//     public static void main(String[] args) {
//         int [] arry = {1, 2 , 4 ,0 , 5 ,0 , 0 };
//         int n = arry.length;
//         zeroend(arry, n);
//     }
// }
// -----------------------------------------------------
// lenear search 
// public class Array{
//     public static int linearsearch(int[]arr , int n){
//         for(int i = 0; i < n ; i++){
//             if(arr[i] == n){
//                 return i;
//             }
//         }
//         return-1;
//     }
//     public static void main(String[] args) {
//         int[] arr = {2 , 34 ,42 ,5 ,54 ,6,3};
//         int n = 3 ;
//         int k = linearsearch(arr , n);
//         System.err.println(k);
//     }
// }
// --------------------------------------------------------
// intersection
// import java.util.ArrayList;

// public class Array {
//     public static void inter(int[] arr, int[] arr1) {
//         ArrayList<Integer> temp = new ArrayList<Integer>();
        
//         // Finding common elements
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr1.length; j++) {
//                 if (arr[i] == arr1[j]) {
//                     temp.add(arr[i]);  // Add to ArrayList
//                     break;  // Move to the next element in arr
//                 }
//             }
//         }

//         // Printing common elements
//         for (int i = 0; i < temp.size(); i++) {
//             System.out.print(temp.get(i) + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {3, 4, 5, 54, 3, 5};
//         int[] arr1 = {4, 3, 4, 65, 4, 3};
//         inter(arr, arr1);
//     }
// }
// ------------------------------
// Maximum Consecutive Ones

// public class Array{
//     static int findMaxConsecutiveOnes(int nums[]) {
//         int cnt = 0;
//         int maxi = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == 1) {
//                 cnt++;
//             } else {
//                 cnt = 0;
//             }

//             maxi = Math.max(maxi, cnt);
//         }
//         return maxi;
//     }
//     public static void main(String args[]) {
//         int nums[] = { 1, 1, 0, 1, 1, 1 };
//         int ans = findMaxConsecutiveOnes(nums);
//         System.out.println("The maximum  consecutive 1's are " + ans);
//     }
// }
// ----------------------------------------------------
// finding missing no.
// public class Array {
//     public static int missingNumber(int []a, int N) {

//         // Outer loop that runs from 1 to N:
//         for (int i = 1; i <= N; i++) {

//             // flag variable to check
//             //if an element exists
//             int flag = 0;

//             //Search the element using linear search:
//             for (int j = 0; j < N - 1; j++) {
//                 if (a[j] == i) {

//                     // i is present in the array:
//                     flag = 1;
//                     break;
//                 }
//             }

//             if (flag == 0) return i;
//         }

//         // The following line will never execute.
//         // It is just to avoid warnings.
//         return -1;
//     }

//     public static void main(String args[]) {
//         int N = 8;
//         int a[] = {1, 2, 4, 5 , 6 , 7 , 8 , 9};

//         int ans = missingNumber(a, N);
//         System.out.println("The missing number is: " + ans);
//     }

// }
// it can also be done by hashing(for better solution)

// optimal solution ---> 1
// public class Array{
//     public static void missingno(int [] arr , int n ) {
//         int sum = (n* (n+1)) / 2 ;
//         int sum2 = 0 ;
//         for(int i = 0 ; i < n-1 ; i ++ ){
//             sum2 += arr[i];  
//         }
//         System.out.print(sum - sum2);
        
//     }
//     public static void main(String[] args) {
//         int [] arr = {1,2,4,5};
//         int n = arr.length +1 ;
//         missingno(arr, n);
//     }
// }
// optimal solution ---> 2
// public class Array {
//     public static int missingNumber(int []a, int N) {

//         int xor1 = 0, xor2 = 0;

//         for (int i = 0; i < N - 1; i++) {
//             xor2 = xor2 ^ a[i]; // XOR of array elements
//             xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
//         }
//         xor1 = xor1 ^ N; //XOR up to [1...N]

//         return (xor1 ^ xor2); // the missing number
//     }

//     public static void main(String args[]) {
//         int N = 5;
//         int a[] = {1, 2, 4, 5};

//         int ans = missingNumber(a, N);
//         System.out.println("The missing number is: " + ans);
//     }
// }
// 
// --------------------------------------------
// appear once in the arry
// public class Array{
//     public static int  appearonce(int []arr , int n){
//         for(int i = 1 ; i < n; i++){
//             int co = arr[i];
//             int ctr = 0 ;
//             for(int j = 0 ; j < n ; j++){
//                 if(arr[j] == co){
//                     ctr ++;
//                 }
//             }
//             if (ctr == 1) return co;   
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int [] arr = {1 , 1 ,3 ,4 ,3 ,3 };
//         int n = arr.length;
//         int k = appearonce(arr, n);
//         System.out.print(k);
//     }
// }
// --------------------------------------------------

