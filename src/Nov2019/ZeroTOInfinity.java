package Nov2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ZeroTOInfinity {
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
    public static boolean check(String str){
        int vowel=0;
        int cons=0;
        for(int j=0;j<str.length();j++) {
                if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o' || str
                        .charAt(j) == 'u') {
                    vowel++;
                }else{
                    cons++;
                }
            }
        if(vowel<cons)
            return false;

        return true;
    }
    public static boolean check3(String str,int j){
        if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o' || str
                .charAt(j) == 'u'){
            return true;
        }
        return false;
    }
    public static int check2(String str,char c){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
    public static char getChar(int i){
        if(i==0){
            return 'a';
        }

        if(i==1){
            return 'b';
        }

        if(i==2){
            return 'c';
        }

        if(i==3){
            return 'd';
        }

        if(i==4){
            return 'e';
        }

        if(i==5){
            return 'f';
        }

        if(i==6){
            return 'g';
        }

        if(i==7){
            return 'h';
        }

        if(i==8){
            return 'i';
        }

        if(i==9){
            return 'j';
        }

        if(i==10){
            return 'k';
        }

        if(i==11){
            return 'l';
        }

        if(i==12){
            return 'm';
        }

        if(i==13){
            return 'n';
        }

        if(i==14){
            return 'o';
        }

        if(i==15){
            return 'p';
        }

        if(i==16){
            return 'q';
        }

        if(i==17){
            return 'r';
        }

        if(i==18){
            return 's';
        }

        if(i==19){
            return 't';
        }

        if(i==20){
            return 'u';
        }

        if(i==21){
            return 'v';
        }

        if(i==22){
            return 'w';
        }

        if(i==23){
            return 'x';
        }

        if(i==24){
            return 'y';
        }
        else
            return 'z';

    }
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int t = s.nextInt();
        while(t>0){
            int n = s.nextInt();
            String[] str = new String[n];
            for(int i=0;i<n;i++){
                str[i]=s.next();
            }
            ArrayList<String> a = new ArrayList<>();
            ArrayList<String> b = new ArrayList<>();
            for(int i=0;i<str.length;i++){
               if(check(str[i])==false){
                   b.add(str[i]);
               }else{
                   int flag=0;
                   for(int j=0;j<str[i].length()-1;j++){
                       if(check3(str[i],j)==false && check3(str[i],j+1)==false){
                           b.add(str[i]);
                           flag=1;
                           break;
                       }
                   }
                   if(flag==1){
                        break;
                   }
                   int vowel=0;
                   int cons=0;
                   flag=0;
                   for(int j=0;j<str[i].length();j++){
                       if(check3(str[i],j)){
                           vowel++;
                       }else{
                           cons++;
                       }
                        if(j!=0 && check3(str[i],j)==false){
                            if(vowel<cons){
                                b.add(str[i]);
                                flag=1;
                                vowel=0;
                                cons=1;
                                break;
                            }
                        }
                   }
                   if(flag==0){
                       a.add(str[i]);
                   }
               }
            }
//            for(int i=0;i<a.size();i++){
//                System.out.print(a.get(i)+" ");
//            }
//            System.out.println();
//            for(int i=0;i<b.size();i++){
//                System.out.print(b.get(i)+" ");
//            }
            double ans1 = 1.0;
            for(int i=0;i<26;i++){
                int totalRe=0;
                int totalCo=0;
                for(int j=0;j<a.size();j++){
                    int localCo=check2(a.get(j),getChar(i));
                    if(localCo!=0){
                        totalRe++;
                        totalCo=totalCo+localCo;
                    }
                }
                if(totalCo!=0){
                    ans1=ans1*totalRe/(Math.pow(totalCo,a.size()));
                }
            }
            //System.out.println("ans1 is "+ans1);
            double ans2 = 1.0;
            for(int i=0;i<26;i++){
                int totalRe=0;
                int totalCo=0;
                for(int j=0;j<b.size();j++){
                    int localCo=check2(b.get(j),getChar(i));
                    if(localCo!=0){
                        totalRe++;
                        totalCo=totalCo+localCo;
                    }
                }
                if(totalCo!=0){
                    ans2=ans2*totalRe/(Math.pow(totalCo,b.size()));
                }
            }
            double ans3 = ans1/ans2;
            if(ans3>10000000){
                System.out.println("Infinity");
            }else
            System.out.println(ans3);
            t--;
        }
    }
}
