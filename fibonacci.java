package fibonacci;

public class fibonacci {
    public static void main(String[] args) {
        int t = 1;
        while(fibonacci.of(t) < 200){
            System.out.println(fibonacci.of(t));
            t++;
        }
    }

    private static int of(int t){
        if (t == 1 || t == 2){
            return 1;
        }
        else{
            int a = 1, b = 1, temp;
            for (int i = 0; i < t - 2; i++) {
                temp = b;
                b += a;
                a = temp;
            }
            return b;
        }
    }
}
