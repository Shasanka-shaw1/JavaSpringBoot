import java.util.*;

public class FirstJavaClass {
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(3);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
