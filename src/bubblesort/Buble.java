package bubblesort;

public class Buble {

    public int[] sort(int[] arr){
        int tmp;
        for(int i=0; i<arr.length-1; i++){

            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }

            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        //오름차순
        Buble bubblesort01 = new Buble();
        for(int a : bubblesort01.sort(arr))
            System.out.println(a);
    }
}