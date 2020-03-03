import java.util.Scanner;

public class Solution {
    //找零钱，化成同一的单位找零钱
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        String[] a=s[0].split("\\.");
        String[] b=s[1].split("\\.");
        int need=Integer.parseInt(a[0])*17*29+Integer.parseInt(a[1])*29+Integer.parseInt(a[2]);
        int give=Integer.parseInt(b[0])*17*29+Integer.parseInt(b[1])*29+Integer.parseInt(b[2]);
        int change=give-need;
        if(change<0){
            System.out.print("-");
            change=-change;
        }
        int g=change/17/29;
        System.out.print(g);
        System.out.print(".");
        int sick=change%(17*29)/29;
        System.out.print(sick);
        System.out.print(".");
        int k=change-g*17*29-sick*29;
        System.out.print(k);

    }
}
