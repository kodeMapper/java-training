package generalQuestions;

public class Fibo {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 8;
        System.out.println(0);

        for (int i = 0; i < n; i++) {
            int result = a + b;
            a = b;
            b = result;
            System.out.println(result);
        }
    }
}
