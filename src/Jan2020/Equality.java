package Jan2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketTimeoutException;
import java.util.StringTokenizer;

public class Equality {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static int increasing(int l, int r, int[] arr) {
        int i = l;
        int count = 0;
        while (i <= r) {

            if (i == l) {
                while (i < r && arr[i] < arr[i + 1]) {
                    i++;
                }
                if (i != l) {
                    if (i != r) {
                        if (arr[i] > arr[i + 1]) {
                            count++;
                        }
                    } else {
                        count++;
                    }
                }
                i++;
            } else
                if (arr[i] < arr[i - 1]) {
                    int k = i;
                    while (i < r && arr[i] < arr[i + 1]) {
                        i++;
                    }

                    if (i != k) {
                        if (i != r) {
                            if (arr[i] > arr[i + 1]) {
                                count++;
                            }
                        } else {
                            count++;
                        }
                    }
                    i++;
                } else {
                    while (i < r && arr[i] >= arr[i - 1]) {
                        i++;
                    }
                }
            if(i==r){
                break;
            }
        }
        return count;
    }

    public static int decreasing(int l, int r, int[] arr) {
        int i = l;

        int count = 0;
        while (i <= r) {
            if (i == l) {
                while (i < r && arr[i] > arr[i + 1]) {
                    i++;
                }
                if (i != l) {
                    if (i != r) {
                        if (arr[i] < arr[i + 1]) {
                            count++;
                        }
                    } else {
                        count++;
                    }
                }
                i++;
            } else
                if (arr[i] > arr[i - 1]) {
                    int k = i;
                    while (i < r && arr[i] > arr[i + 1]) {
                        i++;
                    }

                    if (i != k) {
                        if (i != r) {
                            if (arr[i] < arr[i + 1]) {
                                count++;
                            }
                        } else {
                            count++;
                        }
                    }
                    i++;
                } else {
                    while (i < r && arr[i] <= arr[i - 1]) {
                        i++;
                    }
                }
            if(i==r){
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        FastReader s = new FastReader();
        int n = s.nextInt();
        int q = s.nextInt();
        int arr[] = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            arr[i] = s.nextInt();
        }
        int queries[][] = new int[q][2];
        for (int i = 0; i < q; i++) {
            queries[i][0] = s.nextInt();
            queries[i][1] = s.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            System.out.println(increasing(l,r,arr));
            System.out.println(decreasing(l,r,arr));
            if(increasing(l,r,arr)==decreasing(l,r,arr)){
                System.out.println("Yes");
            }else{
                System.out.println("NO");
            }
        }
    }
}

