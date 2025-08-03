// selection sort
// public class sorting{
//     public static void func(int n , int arr[]){
//         for(int i = 0; i<n-1 ; i++){
//             int mini = i;
//             for( int j = i + 1; j<n-1; j++){
//                 if(arr[mini]>arr[j]){
//                     mini = j;
//                 }
//             }
//             int tem = arr[mini];
//             arr[mini] = arr[i];
//             arr[i] = tem;
//         }
//         System.out.print("array after sorting");
//         for(int i = 0 ; i<n ; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {43 , 64 , 32 ,34 ,56}; 
//         int n = arr.length;
//         func(n , arr);
//     }
// }
// -------------------------------------------------------------
// buble sort
// public class sorting{
//     public static void func(int n , int arr[]){
//         for(int i = n-1 ; i >=0 ; i--){
//             for(int j = 0; j<n-1; j++){
//                 if(arr[j]> arr[j+1]){
//                     int tem = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = tem;
//                 }
//             }
//         }
//         System.out.print("after sorting array");
//         for(int i = 0; i<n ; i++ ){
//             System.out.println(arr[i]);
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {34 , 53, 64 , 45, 74,69};
//         int n = arr.length;
//         func(n , arr);
//     }
// }
// --------------------------------------------------------------------------
// insertion sort
