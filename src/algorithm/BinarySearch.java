package algorithm;

public class BinarySearch implements Array{

    public BinarySearch(){
        int locateNumber = 81;

        int getResult = search(locateNumber);

        if(getResult != -1){
            System.out.println("Binary Search: location of "+locateNumber+" in the array is "+getResult);
        }
        else{
            System.out.println(+locateNumber+" does not exist in the array");
        }

        int getRecursiveResult = recursiveSearch(locateNumber, 0, array.length -1);

        if(getRecursiveResult != -1){
            System.out.println("Binary Recursive Search: location of "+locateNumber+" in the array is "+getResult);
        }
        else{
            System.out.println(+locateNumber+" does not exist in the array");
        }
    }

    private int search(int number){

        int left = 0;
        int right = array.length - 1;

        while(left <= right){
            int median = (left+right)/2;

            if(number > array[median]){
                left = median + 1;
            }
            else if(number < array[median]){
                right = median - 1;
            }
            else{
                return median;
            }
        }
        return -1;
    }

    private int recursiveSearch(int number, int left, int right){

        if(left <= right){
            int median = (left+right)/2;

            if(number < array[median]){
                return recursiveSearch(number, left, (median-1));
            }
            else if(number > array[median]){
                return recursiveSearch(number, (median+1), right);
            }
            else{
                return median;
            }
        }
        else{
            return -1;
        }
    }
}
