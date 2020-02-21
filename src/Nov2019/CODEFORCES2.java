package Nov2019;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Scanner;

public class CODEFORCES2 {
    public  static boolean check(HashMap<Integer, Integer> A, HashMap<Integer,Integer> B){
        return A.equals(B);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        HashMap<Integer,Integer> hash1 = new HashMap<>();
        HashMap<Integer,Integer> hash2 = new HashMap<>();
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            a[i]=a[i]%m;
            if(hash1.containsKey(a[i])){
                int val = hash1.get(a[i]);
                val=val+1;
                hash1.put(a[i],val);
            }else{
                hash1.put(a[i],1);
            }
        }
        for(int i=0;i<n;i++){
            b[i]=s.nextInt();
            if(hash2.containsKey(b[i])){
                int val = hash2.get(b[i]);
                val=val+1;
                hash2.put(b[i],val);
            }else{
                hash2.put(b[i],1);
            }
        }
        int x=0;
        if(check(hash1,hash2)){
            System.out.println(x);
        }else{
            int j=1;
            while(j<m){
                hash1= new HashMap<>();
                for(int i=0;i<n;i++){
                    a[i]=a[i]%m+j%m;
                    a[i]=a[i]%m;
                    if(hash1.containsKey(a[i])){
                        int val = hash1.get(a[i]);
                        val=val+1;
                        hash1.put(a[i],val);
                    }else{
                        hash1.put(a[i],1);
                    }
                }
                if(check(hash1,hash2)){
                    System.out.println(j);
                    break;
                }
                j++;
            }
        }
    }
}
