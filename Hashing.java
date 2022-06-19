import java.io.*;
import java .util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,2,1,3,1,1,3};
        int n=arr.length;
        int k=4;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int j=0;j<k;j++){
                if(!map.containsKey(arr[j])){
                    map.put(arr[j],1);
                }else{
                    int freq=map.get(arr[j]);
                    map.put(arr[j],freq+1);
                }
        }
        System.out.println(map.size());
        int i=0;
        int j=k;
        int freq;
        while(j<n){
            if(map.get(arr[i]) == 1){
                map.remove(arr[i]);
                
            }else{
               freq=map.get(arr[i]);
                map.put(arr[i],freq-1);
            }
            i++;
            if(!map.containsKey(arr[j])){
                    map.put(arr[j],1);
                }else{
                    freq=map.get(arr[j]);
                    map.put(arr[j],freq+1);
                }
            j++;
            
            System.out.println(map.size());
                
        }
        
    }
}
