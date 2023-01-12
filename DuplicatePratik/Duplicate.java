public class Duplicate {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {3 , 6 , 22 , 15 , 4, 1 , 8, 6 , 3 , 5, 15 , 4 , 19 , 22 , 5};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0 ; i < list.length ; i++){
            for (int j = 0 ; j < list.length ; j++){
                if ((i != j) && (list[i] == list[j]) && (list[i]%2) == 0 ){
                    if (!isFind(duplicate , list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value : duplicate){
            if (value != 0){
                System.out.println(value);
            }
        }
    }
}