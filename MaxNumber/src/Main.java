public class Main {
    public static void main(String[] args) {
        int maxNumber = max(300, 10);
        System.out.println(maxNumber);
    }


    public static int max(int a, int b) {
        if(a >= b) {
            return a;
        }
        return b;
    }
}