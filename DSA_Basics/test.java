// A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

// For example, for arr = [1,2,3], the following are considered permutations of arr: [1,2,3], [1,3,2], [3,1,2], [2,3,1].
//                                                                                     0 1 2    0 2 1   2 1 0    1 2 0
// The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, 
// if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. 
// If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

// For example, the next permutation of arr = [1,2,3] is [1,3,2].

// Similarly, the next permutation of arr = [2,3,1] is [3,1,2].

// While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.

// Given an array of integers nums, find the next permutation of nums.

// The replacement must be in place and use only constant extra memory.

// Example 1:

// Input: nums = [1,2,3]  
// 1 2 3 1 3 2 3 1 2 2 3 1
// Output: [1,3,2]

// Example 2:

// Input: nums = [3,2,1]

// Output: [1,2,3]

// Example 3:

// Input: nums = [1,1,5]    1 1 5 1 1 5

// Output: [1,5,1]
import java.util.*;
public class test {
    static void swape(int[] arr,int idx,int n_idx){
        int temp = arr[idx];
        arr[idx] = arr[n_idx];
        arr[n_idx] = temp;
    }

    static void reverse(int[] arr,int idx){
        int e_idx = arr.length-1;
        while(idx<e_idx){
            swape(arr, idx, e_idx);
            idx++;
            e_idx--;
        }
    }

    static void next_permutation(int[] arr){
        
        
        int idx = -1;
        for(int i = arr.length-1;i>0;i--){    //1 5 8 4 7 6 5 3 1 //
            if(arr[i]>arr[i-1]){               
                idx = i;
                break;
            }
        }
        if(idx>-1){
        int next_idx = idx;                     // 6
        for(int i=idx+1;i<arr.length;i++){
            if(arr[i]>arr[idx-1] && arr[next_idx]>arr[i]){
                next_idx = i;
            }
          
        }
        swape(arr,idx-1,next_idx);
        reverse(arr, idx);
        }
    else{
        reverse(arr, 0);
    }
               
    
    }
   
    public static void main(String[] args) {
        int[] arr={5,1,1};
        next_permutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
// 1 2 3 4 
// 1 2 4 3
// 1 3 2 4
// 1 3 4 2 
// 1 4 2 3
// 1 4 3 2
// 2 1 3 4
// 2 1 4 3

