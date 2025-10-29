

public class LoopDemo {

    public static void main(String[] args) {
        
        // for-loop
        System.out.println("For Loop: ");
        for (int i=1; i<5; i++) {
            System.out.println("i = " + i);
        }

        // 2. While loop
        System.out.println("\nWhile Loop");
        int j = 1;
        while (j<=5) {
            System.out.println("j = " + j);
            j++;
        }

        // 3. Do-while Loop
        System.out.println("\nDo-while Loop");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);

        // 4. Enhanced For-Loop
        System.out.println("\nEnhanced For Loop");
        int[] numbers = {10,20,30,40,50};
        for(int num:numbers) {
            System.out.println("num = " + num);
        }
    }
    
}
