package Nov2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeaponValue {
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        FastReader s = new FastReader();
        int t = s.nextInt();
        while(t>0){
            int n=s.nextInt();
            String[] str = new String[n];
            for(int i=0;i<n;i++) {
                str[i] = s.next();
            }
            for(int i=0;i<n;i++){
                System.out.println(str[i]);
            }
            String ans ="";
            for(int i=0;i<10;i++){
                if(str[0].charAt(i)=='0'){
                    ans=ans+"0";
                }else{
                    ans=ans+"1";
                }
            }
            for(int i=1;i<n;i++){
                int j=0;
                String newAns="";
                while(j<10){
                    if((str[i].charAt(j)=='1' && ans.charAt(j)=='1') || (str[i].charAt(j)=='0' && ans.charAt(j)=='0')){
                        newAns=newAns+"0";
                    }else
                    if(str[i].charAt(j)=='1' || ans.charAt(j)=='1'){
                        newAns=newAns+"1";
                    }else{
                        newAns=newAns+"0";
                    }
                    j++;
                }
                ans="";
                j=0;
                while(j<10){
                    if(newAns.charAt(j)=='0'){
                        ans=ans+"0";
                    }else{
                        ans=ans+"1";
                    }
                    j++;
                }
            }
            int count=0;
            for(int i=0;i<10;i++){
                if(ans.charAt(i)=='1'){
                    count++;
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
