public class App {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i]; // Seleccionamos el elemento a insertar en su posicion correcta
            int j = i - 1;

            // Mover elementos de arr[0..i-1], que son mayores que key,
            // a una posición adelante de su posición actual
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; // insertamos key en su posicion correcta
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };
        System.out.println("Arreglo Original:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();


        System.out.println("===================================");
        insertionSort(arr); // Llamada al método de ordenamiento por inserción

        System.out.println("Arreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
