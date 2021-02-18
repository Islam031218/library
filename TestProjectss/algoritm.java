package TestProjectss;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class algoritm {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        int[]array=new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i]=Integer.parseInt(reader.readLine());
        }

        sort(array);
        System.out.println(array[2]);
        System.out.println(array[4]);
    }public  static  void sort(int[] array){
        int a=0;
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j <array.length-1; j++) {
                if (i<j){
                    a=array[0];
                    if (array[j]<a){
                        array[0]=array[j];
                        array[j]=a;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
