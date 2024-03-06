import java.util.ArrayList;
import java.util.Collection;

import javax.sound.sampled.SourceDataLine;

import java.util.*;
public class CollectionArrayList {


    public static void main(String[] args) {
           List<Integer> nums = new Vector<Integer>();
    
        System.out.println(nums);
    nums.add(6);
    nums.add(5);
    nums.add(6);
    nums.add(6);
    nums.add(6);
    System.out.println(nums);
    
    nums.remove(4);
    for(int n:nums){
        System.out.println(n);
    }
    System.out.println(nums.indexOf(6));
    System.out.println(nums.size());
        
    }

 

    
}
