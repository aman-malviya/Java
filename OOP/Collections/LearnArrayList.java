import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList{
    public static void main(String[] args) {
        
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(5);    //This adds 5 to the end of nums
        nums.add(1,567); //This adds 567 at index 1

        ArrayList<Integer> newList=new ArrayList<>();
        newList.add(150);
        newList.add(350);

        nums.addAll(newList);   //This will add all elements in newList towards the end of nums

        System.out.println(nums.get(4));    //This will get the number at index 4

        nums.remove(3);     //This will remove the element at index 3

        nums.remove(Integer.valueOf(350));  //This will remove 350 from nums

        // nums.clear(); //Removes all elements from nums

        nums.set(0,456);    //Changes the value at inde 0 to 456

        System.out.println(nums.contains(567)); //Checks is 567 is present in nums

        System.out.println(nums);

        for(int i=0; i<nums.size(); i++){
            System.out.println("Normal for loop "+nums.get(i));
        }
        for(Integer element:nums){
            System.out.println(("ForEach loop "+element));
        }
        Iterator<Integer> it=nums.iterator();

        while(it.hasNext()){
            System.out.println("Iterator "+it.next());
        }
    }
}