public class InfiniteMultiplication {
    public static void main(String[] args) {
        int product = 1;
        int count = 0;
        while(true) {
            product *= 2;
            count++;

            if (product > 1000) {
                System.out.println("Total product: " + product + ",\nMultiplication performed: " + count + " times");
                break;
            }
        }
    }
}
