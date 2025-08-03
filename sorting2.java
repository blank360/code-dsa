// // merge sort
// import java.util.ArrayList;
// public class sorting2{
//     public static void merge(int[] arr , int low , int mid , int high){
//         ArrayList<Integer> tem = new ArrayList<Integer>();
//         int left = low;
//         int right = high;
//         while(left<=mid && right <= high){
//             if(arr[left] <= arr[right]){
//                 tem.add(arr[left]);
//                 left++;
//             }else{
//                 tem.add(arr[right]);
//                 right++;
//             }
//         }
//         while(left<=mid){
//             tem.add(arr[left]);
//             left++;
//         }
//         while(right<=high){
//             tem.add(arr[right]);
//             right++;
//         }
//         for (int i = low; i <= high; i++) {
//             arr[i] = tem.get(i - low);
//         }
                 
//     }
//     public static void mergesort(int[] arr , int low , int high){
//         if(low<=high) return;
//         int mid = (low + high) / 2;
//         mergesort(arr, low, mid);
//         mergesort(arr, mid+1 , high);
//         merge(arr, low, mid, high);

        
//     }
//     public static void main(String[] args) {
//         int[] arr = {5 , 7 ,34 , 34, 65,32};
//         int low = 0;
//         int high = arr.length -1;
//         mergesort(arr, low, high);
//         for(int i = 0 ; i<= high -1 ; i++){
//             System.out.println(arr[i]);
//         }
//     }

// }
// ------------------------------------------------------------------------
// quic sort 
