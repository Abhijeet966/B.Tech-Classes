import java.util.*;

public class Q {
    public static void main(String[] args) {
        int arr[] =  {6,3,2,5,7,3,2,6,7,4,3,9,0 };
          int n =  arr.length;
          HashMap <Integer, Integer>hm = new HashMap<>();
          for(int i =0; i<n; i++){
            if(hm.containsKey(arr[i])){
                int a = hm.get(arr[i]);
                    hm.put(arr[i], a+1);
            } else {
                hm.put(arr[i],1);
            }

          }
          System.out.print(hm);
}

    }
    
