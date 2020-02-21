package Jan2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakingBricks {
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
            int power=s.nextInt();
            int w1=s.nextInt();
            int w2=s.nextInt();
            int w3=s.nextInt();
            if(w1+w2+w3<=power){
                System.out.println("1");
                t--;
                continue;
            }
            if(w1==w2 && w2==w3){
                if(w1==power){
                    System.out.println("3");
                }else{
                    if(w1+w2<=power){
                        System.out.println("2");
                    }
                    else{
                        System.out.println("3");
                    }
                }
                t--;
                continue;
            }
             if(power>=7){
                 System.out.println("1");
                 t--;
                 continue;
             }
             if(w1+w2<=power){
                 System.out.println("2");
             }else if(w2+w3<=power){
                 System.out.println("2");
             }
            System.out.println("3");
            t--;
        }
    }
}
