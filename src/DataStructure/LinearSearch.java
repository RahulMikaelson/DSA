package DataStructure;

public class LinearSearch {

    public int arrayIndex(int[] array, int target){
        int arrayLength=array.length;
        if(arrayLength==0){
            return -1;
        }
        for (int index = 0; index < arrayLength; index++) {
            if(array[index]==target){
                return index;
            }
        }
        return -1;
    }

    public int[] jaggedArrayIndex(int[][] array,int target){
        int arrayLength=array.length;
        if (arrayLength==0){
            return new int[]{-1,-1};
        }
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
