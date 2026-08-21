public class pp {

    public static void main(String[] args) {

        int[]arr = {10,45,23,67,34};
        
        int largest = arr[0];
        int secondlargest = arr[0];

            for(int i = 0;i<arr.length;i++)
                {
                if(arr[1]>secondlargest)
                     {
                    secondlargest=largest;
                    largest=arr[i];
                }

            }System.out.println(secondlargest);
    
        //program is second largest number find
        
    }
}