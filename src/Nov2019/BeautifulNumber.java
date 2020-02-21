package Nov2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BeautifulNumber {
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
    public static int integer(String str,int i){
        if(str.charAt(i)=='1'){
            return 1;
        }
        if(str.charAt(i)=='2'){
            return 2;
        }
        if(str.charAt(i)=='3'){
            return 3;
        }
        if(str.charAt(i)=='4'){
            return 4;
        }
        if(str.charAt(i)=='5'){
            return 5;
        }
        if(str.charAt(i)=='6'){
            return 6;
        }
        if(str.charAt(i)=='7'){
            return 7;
        }
        if(str.charAt(i)=='8'){
            return 8;
        }
        if(str.charAt(i)=='9'){
            return 9;
        }
        return 0;
    }
    public static int func(int[] diff,int element){
            return 0;
    }
    public static int dpBuilder(int[] diff,int[] dp){

        return -1;
    }
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int[] diff= new int[8];
        diff[0]=3;
        diff[1]=8;
        diff[2]=15;
        diff[3]=24;
        diff[4]=35;
        diff[5]=48;
        diff[6]=63;
        diff[7]=80;
        int[] dp = new int[20];
        dp[0]=0;
        dp[1]=0;
        dp[2]=0;
        dp[3]=1;
        int t =s.nextInt();
        while(t>0){
            long n = s.nextLong();
            int[] arr = new int[1000006];
            for(int i=0;i<n;i++){
                arr[i]=1;
            }
            int sq = (int)Math.sqrt(n);
            if(sq*sq==n){
                for(int i=0;i<n;i++){
                    System.out.print(arr[i]);
                }
                System.out.println();
                return;
            }

            t--;
        }
    }
}
