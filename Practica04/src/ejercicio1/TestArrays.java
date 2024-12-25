package ejercicio1;

public class TestArrays {
    public static void main(String[] args) {
        int array1[] = {2,3,5,7,11,13,17,19};
        int array2[];
        array2 = array1;
        array2[0]=0;
        array2[2]=2;
        array2[4]=4;
        array2[6]=6;
        printArray(array1);
        printArray(array2);
        int[][] matrix = new int [5][];
        for (int i = 0; i < matrix.length; i++){
            int arr[] = new int [i];
            matrix[i] = arr;
            System.out.print("matrix ["+ i +"] es");
            for (int j=0; j < arr.length; j++){
                matrix[i][j] = i*j;
                System.out.print(" "+matrix[i][j]+" ");
            }
            System.out.println(" ");   
            
        }
    }
    public static void printArray(int[ ] array1) {
        System.out.print('<');
        for (int i = 0; i < array1.length; i++) {
                System.out.print(array1[i]);             // imprime elemento
                if ((i + 1) < array1.length) {
                        System.out.print(", ");         // imprime coma y espacio si no es el ˙ltimo

                }
        }
        System.out.println('>');
}
    
}
