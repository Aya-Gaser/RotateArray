import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arri = {1, 2, 3, 4, 5, 6};
        int[] newarr = rotate_arrSolution(arri,2);
        for (int i = 0; i < newarr.length ; i++) {
            System.out.println(newarr[i]);

        }
        int[] newarr2 = rotate_swap(arri, 2);
        for (int i = 0; i < newarr2.length; i++) {
            System.out.println(newarr2[i]);

        }
    }


    public static int[] rotate_swap(int[] arr, int shift){
        int n = shift%arr.length;
        //System.out.println(n);
        if(n>0) {
            int t = arr[0];
            for (int i = 0; i < arr.length-n; i++) {
                //System.out.println(arr[i]+" "+ arr[i+n]);
                arr = swape(arr, i, i-n+(i-n<0? arr.length : 0));

            }
            //arr[arr.length-1] = t;
        }
        return arr;
    }
    public static int[] swape(int[] arr, int index1, int index2){

        int t;
        t = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = t;
        return arr;
    }
    public static int[] rotate_arrSolution(int[] arr, int shift){
        int tail;
        int head;
        int[] backArr = new int[shift];
        int[] frontArr = new int[arr.length-shift];
        int[] newArr = new int[arr.length];
        for (int i = 0; i < shift ; i++) {
            backArr[i] = arr[i];
        }
        int k=0;
        for (int i = shift; i < arr.length ; i++) {
            frontArr[k] = arr[i];
            k++;
        }
        int t=0;
        for (int i = 0; i < newArr.length ; i++) {
            if(i< newArr.length-shift)
                newArr[i] = frontArr[i];
            else {

                newArr[i] = backArr[t];
                t++;
            }

        }
        return newArr;



    }
}
