package com.company;

public class Main {

    public static void selectionSort(int[] array, int low){
        if(low < array.length){
            int min = array[low];
            int indexOfMin = low;
            for(int i = low+1 ; i < array.length; i++){

                if(min >= array[i]) {
                    min = array[i];
                    indexOfMin = i;
                }
            }
            array[indexOfMin] = array[low];
            array[low] = min;



            selectionSort(array, low+1);
        }

    }
    public static void main(String[] args) {
	// write your code here
        int[] nums = {4,1,5,9,15};
        selectionSort(nums,0);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
