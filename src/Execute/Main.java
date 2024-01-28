package Execute;

import DataStructure.LinearSearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8};
        int[][] jaggedArray={{1,2},{3,4,5},{6,7,8,9}};
        LinearSearch obj= new LinearSearch();
        System.out.println(obj.arrayIndex(array,7));
        System.out.println(Arrays.toString(obj.jaggedArrayIndex(jaggedArray, 9)));
    }
}
