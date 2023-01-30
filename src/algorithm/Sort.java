package algorithm;

public class Sort {

    int[] array = {-1,2,5,9,7,8,56,89,4,5,9,7,5,2,6,4,4,98,56,45,21,69,-12,-13,89,99,100};

    public Sort(){
        //selectionSort(array);
        recursiveSelectionSort(array,0,0);
        for(int x =0;x<array.length;x++){
            System.out.print(array[x]+" ");
        }
    }

    private void selectionSort(int[] array){

        for(int x = 0;x<array.length;x++){
            int index = x;

            for(int y = x+1;y< array.length;y++){
                if(array[x] > array[y]){
                    index = y;
                }
            }

            int temp = array[x];
            array[x] = array[index];
            array[index] = temp;
        }

        for(int x =0;x<array.length;x++){
            System.out.print(array[x]+" ");
        }
    }

    private void recursiveSelectionSort(int[] array, int number, int index){

        if(number < array.length){

            for(int x = number +1;x<array.length;x++){
                if(array[number] > array[x]){
                    index = x;
                }
            }
            int temp = array[number];
            array[number] = array[index];
            array[index] = temp;

            recursiveSelectionSort(array,number+1, number);

        }
        else{
            return;
        }
    }
}
