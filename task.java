package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task {
    public static void main(String[] args) {
        List<Integer> num =new ArrayList<>();
        Random rnd=new Random();
        for (int i = 0; i < 10; i++) {
            num.add(rnd.nextInt(2,33));
        }
        
        
        System.out.println(num);
        DeleteNum(num);
    }  

 
    public static void DeleteNum(List<Integer> num){
        int i = 0;
        while (i < num.size()){
            if(num.get(i) % 2 == 0) num.remove(i);
            else i++;
        }
        System.out.println(num);
    }
    
}


