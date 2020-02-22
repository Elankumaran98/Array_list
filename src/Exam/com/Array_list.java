package Exam.com;
import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {
    public void Array(){
        int i,j,k,n,a,b;
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("How many numbers:");
        Scanner in=new Scanner(System.in);
        i=in.nextInt();
        System.out.println("Enter "+i+" numbers:");
        for (j=0;j<i;j++){
            k=in.nextInt();
            list.add(k);
        }
        System.out.println("Your numbers:");
        for (Integer x:list){
            System.out.println(x);
        }
        System.out.println("Size :"+list.size());

        System.out.println("Remove number position:");
        n=in.nextInt();
        list.remove(n-1);
        for (Integer x:list)
            System.out.println(x);
        System.out.println("Size :"+list.size());

        System.out.println("Set a number:");
        System.out.println("Set a number(enter position):");
        System.out.println("Set a number(enter number):");
        a=in.nextInt();
        b=in.nextInt();
        list.set(a-1,b);
        for (Integer x:list)
            System.out.println(x);
        System.out.println("Size :"+list.size());
    }
}
