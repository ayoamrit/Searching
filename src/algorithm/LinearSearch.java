package algorithm;

public class LinearSearch implements Array{

    public LinearSearch(){
        int locateNumber = 81;   //the number that we will locate in the array

        long startTime = System.nanoTime();  //starting nano time to check elapsed time

        search(locateNumber);  //calling method to perform linear search without recursion
        long medianTime = System.nanoTime();  //starting median nano time to get elapsed time to perform linear search function
        System.out.println("Time Elapsed: "+Integer.parseInt(String.valueOf(medianTime-startTime)));  //printing time elapsed

        recursiveSearch(locateNumber, 0);  //calling method to perform linear search using recursion
        long endTime = System.nanoTime();  //starting end nano time to get elapsed to perform linear search function using recursion

        //printing time elapsed to perform linear search function using recursion
        System.out.println("Time Elapsed (Recursion): "+Integer.parseInt(String.valueOf(endTime-medianTime)));
    }

    public void search(int number){

        //using for loop to scan for the number in the array
        for(int x = 0;x<array.length;x++){
            if(number == array[x]){  //checking whether the number is equals to array's element
                System.out.println("Linear Search: "+array[x]);  //printing it on the screen if both are equal
            }
        }
    }

    private void recursiveSearch(int number, int x){

        if(x >= array.length){
            System.out.println(number+" does not exist in the array");
        }
        else{
            if(array[x] == number){
                System.out.println("Recursive Linear Search: "+array[x]);
            }
            else{
                recursiveSearch(number, x+1);
            }
        }
    }
}
