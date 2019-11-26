package HW1;
//Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
public class Swap {
    public static <T> void  swapElements(T []array, int index1, int index2){
        if(array!=null&&checkIndex(index1,array)&&checkIndex(index2,array)){
           T tempValue = array[index1];
           array[index1] = array[index2];
           array[index2] = tempValue;
        } else System.out.println("Swap is impossible");
    }
    public static <T> boolean checkIndex(int index,T []arr){
        return (index>=0&&index<arr.length);
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        display(intArray);
        swapElements(intArray, 0, 4);
        display(intArray);

        String[] strArray = {"s", "t", "r"};
        display(strArray);
        swapElements(strArray, 0, 1);
        display(strArray);
    }

    private static void display(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("---------");
    }
}
