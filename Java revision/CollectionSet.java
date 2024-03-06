import java.util.ArrayList;

import java.util.*;
public class CollectionSet {


    public static void main(String[] args) {
           Set<Integer> nums = new LinkedHashSet<Integer>();
    
        System.out.println(nums);
    nums.add(6);
    nums.add(5);
    nums.add(6);
    nums.add(6);
    nums.add(6);
    System.out.println(nums);

    Iterator<Integer> values = nums.iterator();
    while(values.hasNext()){
        System.out.println(values.next());
    }
    
    for(int n:nums){
        System.out.println(n);
    }
    System.out.println(nums.size());
        
    }

 

    
}
