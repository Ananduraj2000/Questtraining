package oops.test2;

public class ReverseTwo {
    public static void main(String[] args) {
        int [][] array={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("Orginal array is: ");
        for(int[] row:array){
            for(int num:row){
                System.out.print(num+" ");
            }
            System.out.println();
        }

        for(int i=0;i<array.length;i++){
            int first=0;
            int second= array[i].length-1;
            while(first<second){
                int temp=array[i][first];
                array[i][first]=array[i][second];
                array[i][second]=temp;
                first++;
                second--;

            }
        }
        System.out.println("Reversed Array is: :");
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
