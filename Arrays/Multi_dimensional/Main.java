package Arrays.Multi_dimensional;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] numbers = new int[2][3];
        numbers[0][1] = 1;
        System.out.println(Arrays.deepToString(numbers));
    }
    
}


// int[][] numbers = {{1,2,3}. {4,5,6}}
// Output ;- [[1,2,3],[4,5,6]]