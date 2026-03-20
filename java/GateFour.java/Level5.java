public class Level5{
    public boolean isPrime(int number) {
        if(number < 2)
            return false;
        for(int divisor = 2; divisor < number; divisor++){
            if (number % divisor == 0){
                return false;
            }
            }

            return true;

    }
    public int [] getPrimeNumber(int [] numbers){
        int size = 0;
            for(int number : numbers){
                if(isPrime(number)) 
                    size++;

        }
          int [] result = new int [size];

            int index = 0;
        for(int number : numbers){
            if(isPrime(number)) 
            result[index++] = number;
            

        }

    

        for (int count = 0; count < result.length; count++){

        for(int checking = count+1; checking < result.length; checking++){
            if (result[count] > result[checking]){
                int temp = result[count];
                result[count] = result[checking];
                result[checking] = temp;

                        }
            }
                
        }
        
        return result;  
        }




        public int [] replacingNegatives(int [] numbers){
            for (int index = 0; index < numbers.length; index++){
                if (numbers[index] < 0)
                    numbers[index] = 0;
         }

            return numbers;

    
        }
          
          public int[] moveZeros (int [] numbers) {
            int [] result = new int [numbers.length];
            int index = 0;
            for(int number: numbers){
                if(number != 0){
                    result[index++] = number;
                }
        }
            return result;
               
                }


        

        }






    
