package com.zhanghongze.learning.algorithms.sort;

public class ShellSort<T extends Comparable<T>> {

    public void sort(T [] arr){
        int n = arr.length;
        int h = 1;

        while (h< n/3){
            h = h*3+1;
        }

        while(h>=1) {
            for (int i = h; i < n; i++) {
                T t = arr[i];
                int j = i;
                while (j >= h) {
//                    T temp = arr[j - h];
//                    arr[j - h] = arr[j];
//                    arr[j] = temp;
                    if(t.compareTo(arr[j-h]) <0){
                        arr[j] = arr[j-h];
                        j = j - h;
                    }else {
                        break;
                    }
                }
                arr[j] = t;
            }
            h = h / 3;
        }
    }

    public static void main(String [] args){
        ShellSort shellSort = new ShellSort();

//        Integer[] a = {9,8,7,6,5,4,3,2,1};

        Integer[] a = {3,8,7,6,5,4,2,9,1};

        shellSort.sort(a);

        for(int i=0;i< a.length;i++){
            System.out.println(a[i]);
        }
    }
}
