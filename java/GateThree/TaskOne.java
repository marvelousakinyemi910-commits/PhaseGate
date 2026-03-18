public class TaskOne {

    public int [] reduceLength(int [] numbers, int number){
     if(number < 0){
        throw new IllegalArgumentException("number should be positive");
    }
    if(numbers.length > number){

    }       
    return new int[]{numbers[0],numbers[1]};

    }

     public int [] fillDefault(int [] numbers, int number){
     if(number < 0){
        throw new IllegalArgumentException("number should be positive");
    }

     if(numbers.length < number){
           
        for(int index = 0 ; index < number; index++){
            if( numbers.length == number){
                return numbers;

    }
            else {
                numbers[index] = -1;
        }
       
        }
    
        
    
   }

        return numbers;
}


    public int [] fillEmptyArray(int number){
        if(number < 0){
        throw new IllegalArgumentException("number should be positive");
    }
        
        int [] numbers = new int [number];
        for(int index = 0; index < number; index++){
            numbers[index] = -1;

            }
                return numbers;

        }



    }
