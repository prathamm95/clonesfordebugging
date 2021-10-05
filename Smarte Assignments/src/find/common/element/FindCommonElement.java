package find.common.element;

public class FindCommonElement {


    public static void main(String[] args) {

        int[] array1 = {1, 5, 10, 20, 40, 80};
        int[] array2 = {6, 7, 20, 80, 100};
        int[] array3 = {3, 4, 15, 20, 30, 70, 80, 120};
        findCommonElement(array1, array2, array3);
    }

    //method for finding the common element
    public static void findCommonElement(int[] array1, int[] array2, int[] array3) {

        //using three nested for loops to iterate through all 3 arrays
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                for (int k = 0; k < array3.length; k++) {

                    //passing an if condition to check the common elements in the 3 arrays
                    if (array1[i] == array2[j] && array2[j] == array3[k]) {
                        System.out.println(array1[i]);
                    }
                }
            }
        }


    }

}
