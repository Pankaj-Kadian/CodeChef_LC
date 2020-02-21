package Nov2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class PhysicalExercise {
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
            int x =s.nextInt();
            int y =s.nextInt();
            int n = s.nextInt();
            int m = s.nextInt();
            int k = s.nextInt();
            long[] arr=new long[2*n];
            long[] brr=new long[2*m];
            long[] crr=new long[2*k];
            for(int i=0;i<2*n;i++){
                arr[i]=s.nextLong();
            }
            for(int i=0;i<2*m;i++){
                brr[i]=s.nextLong();
            }
            for(int i=0;i<2*k;i++){
                crr[i]=s.nextLong();
            }
            double d1[]= new double[m];
            int l=0;
            double lans=0;
            for(int i=0;i<2*m;i=i+2){
                double min = Double.MAX_VALUE;
                long mm = 1000000;
                for(int j=0;j<2*k;j=j+2){
                    double value = Math.sqrt(((brr[i]-crr[j])*(brr[i]-crr[j]))+((brr[i+1]-crr[j+1])*(brr[i+1]-crr[j+1])));
                    long vv=((brr[i]-crr[j])*(brr[i]-crr[j]))+((brr[i+1]-crr[j+1])*(brr[i+1]-crr[j+1]));
                    if(min>value){
                        min = value;
                        mm=vv;
                    }
                }
                lans=mm;
                d1[l] = (min);
                l++;
            }
            int p=0;
            double  d2[] =new double[n];
            for(int i=0;i<2*n;i=i+2){
                double min =Double.MAX_VALUE;
                l=0;
                for(int j=0;j<2*m;j=j+2){
                    double value = Math.sqrt(((arr[i]-brr[j])*(arr[i]-brr[j]))+((arr[i+1]-brr[j+1])*(arr[i+1]-brr[j+1])));
                    if(min>(value+d1[l])){
                        lans=((arr[i]-brr[j])*(arr[i]-brr[j]))+((arr[i+1]-brr[j+1])*(arr[i+1]-brr[j+1]));
                        min=value+d1[l];
                    }
                    l++;
                }
                d2[p]=min;
                p++;
            }
            double ans = Double.MAX_VALUE;
            p=0;
            for(int i=0;i<2*n;i=i+2){
             double value = Math.sqrt((x-arr[i])*(x-arr[i])+(y-arr[i+1])*(y-arr[i+1]))+d2[p];
             if(ans>value){
                 lans=((x-arr[i])*(x-arr[i]))+(y-arr[i+1])*(y-arr[i+1]);
                 ans=value;
             }
             p++;
            }

            double c1[]= new double[n];
            l=0;
            for(int i=0;i<2*n;i=i+2){
                double min = Double.MAX_VALUE;
                for(int j=0;j<2*k;j=j+2){
                    double value = Math.sqrt(((arr[i]-crr[j])*(arr[i]-crr[j]))+((arr[i+1]-crr[j+1])*(arr[i+1]-crr[j+1])));
                    if(min>value){
                        min = value;
                    }
                }
                c1[l] = min;
                l++;
            }
            p=0;
            double  c2[] =new double[m];
            lans=0;
            for(int i=0;i<2*m;i=i+2){
                double min =Double.MAX_VALUE;
                l=0;
                for(int j=0;j<2*n;j=j+2){
                    double value = Math.sqrt(((brr[i]-arr[j])*(brr[i]-arr[j]))+((brr[i+1]-arr[j+1])*(brr[i+1]-arr[j+1])));
                    if(min>(value+c1[l])){
                        min=value+c1[l];
                    }
                    l++;
                }
                c2[p]=min;
                p++;
            }
            p=0;
            for(int i=0;i<2*m;i=i+2){
                double value = Math.sqrt((x-brr[i])*(x-brr[i])+(y-brr[i+1])*(y-brr[i+1]))+c2[p];
                if(ans>value){
                    ans=value;
                }
                p++;
            }
            System.out.println(ans);
            t--;
        }
    }
}
