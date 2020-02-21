package Nov2019;

import java.util.Scanner;

public class CODEFORCES {
    public static boolean check(long num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long a=1,b=1;
        while(true){
            b++;
            while(check(b)){
                b++;
            }
            a=b+n;
            if(!check(a)){
                break;
            }
        }
        System.out.println(a+" "+b);
    }
}
