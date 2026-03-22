public class WeekendSnacks{
    public int countEven(int[] numbers){
        int count = 0;
        for(int number: numbers){
            if (number % 2 == 0)
                count++;
        }

         return count;
    

    }

    public int linearSearch(int[] numbers, int target) {
        for (int index = 0; index < numbers.length; index++){

            if(numbers[index] == target){
              return index;  
                }
        

        }
        return -1;
}
    public int[] squares(int number){
         int[] perfectSquare = new int [number];

        for(int index = 0; index < number; index++){
            perfectSquare[index] = (index + 1) * (index + 1);
        

        }
        return perfectSquare;
    }

    
    public boolean arrayEquals(int[] firstArray, int[] secondArray){
        if (firstArray.length != secondArray.length){
         return false;
            }
        for (int index = 0; index < firstArray.length; index++){
            if (firstArray[index] != secondArray[index]){
                    return false;
            }


        }
        return true;

        }

    public int[] flatten(int[][] arrays){
        int total = 0;
        for(int[] row : arrays) {
            total += row.length;
                }

        int[] result = new int[total];
        int index = 0;
        for(int[] row :arrays){
            for(int number : row){
                result[index++] = number;

            }

        }
        return result;
    }




}
