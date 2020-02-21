package Jan2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Doremon {
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

    public static void main(String[] args) {
        FastReader s = new FastReader();
        int t = s.nextInt();
        while(t>0){
            int n = s.nextInt();
            int m = s.nextInt();
            int[][] a = new int[n][m];
            for(int i =0 ;i <n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]= s.nextInt();
                }
            }
            int count = 0;
            for(int i=0;i<n;i++) {
                for (int j = 0; j < m; j++) {
                    int l = 1;
                    while (i + l < n && j + l < m && i - l >= 0 && j - l >= 0) {
                        if (a[i][j + l] == a[i][j - l] && a[i - l][j] == a[i + l][j]) l++;
                        else break;
                    }
                    count += l;
                }
            }
            System.out.println(count);
            t--;
        }

        }
    }
