package task3;
import java.util.Random;
import java.util.ArrayList;
import java.util.*;

public class tasksort {
    public static void main(String[] args) {
        ArrayList<Integer> spisok = new ArrayList<>();
        Random rnd= new Random();
        int n=10;
        for (int i = 0; i < n; i++) {
            spisok.add(rnd.nextInt(2,10));
        }
        System.err.println(spisok);
        Integer max = Collections.max(spisok);
        System.out.println("Maximum element : "+max);
        Integer min = Collections.max(spisok, Collections.reverseOrder());
        System.out.println("Minimum element : "+min);
        ex1(spisok);
    }
    static void ex1(ArrayList<Integer> arr){
        double sum =0;
        for(int i=0; i< arr.size();i++ ){
            sum+=arr.get(i);
        }
        System.out.println("arithmetic mean : "+ sum/arr.size());
    }
}
