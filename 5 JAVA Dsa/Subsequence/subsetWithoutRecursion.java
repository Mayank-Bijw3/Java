package Subsequence;

import java.util.ArrayList;
import java.util.List;

public class subsetWithoutRecursion {
    // Online Java Compiler

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        
        List<List<Integer>> ans = subset(arr);
        
        for(List<Integer>k:ans){
            System.out.println(k);
        }
    }
        public static List<List<Integer>> subset(int[] ans){
            List<List<Integer>> outer=new ArrayList<>();
            
            outer.add(new ArrayList<>());
            
            for(int num :ans){
                int n =outer.size();
                for(int i=0;i<n;i++){
                    List<Integer> internal = new ArrayList<>(outer.get(i));
                    internal.add(num);
                    outer.add(internal);
                }
            }
            return outer;
        } 
        
        
    
}

