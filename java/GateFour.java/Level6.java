 public class Level6{

    public int[][] splitEvenOdd(int [] numbers){
        int countEven = 0;
        int countOdd = 0;
        for(int number : numbers){
         if (number % 2 == 0){
            countEven++;
        
          }

           else{
                countOdd++;       
                }
            }
        int [] even = new int[countEven];
        int [] odd = new int [countOdd];
        
        int evenIndex = 0;
        int oddIndex = 0;
        for(int number : numbers){
             if (number % 2 == 0)
                even[evenIndex++] = number;
            else 
                odd[oddIndex++] = number;
}
            return new int[][]{odd, even};

        }
         


    public boolean isPalindrome(int [] numbers) {

    int left = 0;
    int right = numbers.length - 1;

    while(left < right) {
        if (numbers[left] != numbers[right])
            return false;
                left++;
                right--;

    }
        
        return true;

    }



    public int [] perfectSquares(int [] numbers){
                int size = 0;
                for (int number: numbers){
                    int root = (int)Math.sqrt(number);
                    if(root * root == number)
                        size++;
              }
            int [] result = new int [size]; 
           int index = 0;
             for (int number: numbers){
                int root = (int)Math.sqrt(number);
                    if(root * root == number)
                        result[index++] = number;
        }
            return result;
}

     public int [] replaceNonPerfectSquares(int [] numbers){
        for(int index = 0; index < numbers.length; index++){
             int root = (int)Math.sqrt(numbers[index]);
                    if(root * root != numbers[index]){
                        numbers[index] = -1;

                }
               }

            return numbers;

        }




}
