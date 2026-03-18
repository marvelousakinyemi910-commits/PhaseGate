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
     int [] newArray = new int [number];
     if(number < 0){
        throw new IllegalArgumentException("number should be positive");
    }
        for (int index = 0; index < number; index++){
            if(newArray[index] < number){
            newArray[index] = numbers[index];

            }
     
        else{
            newArray[index] = -1;
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




//    public int [][] findLargest(double [][] numbers){
//    // 
//      double [][] largest = numbers[0][0];
//        
//    for(int row = 0; row < numbers.length; row++){
//        for(int column = 0; column < numbers[row].length; column++){
//            if(numbers[row][column] > largest){
//                largest = numbers[row][column];
//               
//
//
//    }
//            return largest;
//}
//
//    }


    public String countLetters(String word){
        int  countLowerCase = 0;
        int  countUpperCase = 0;
        String lettersCount = ""
    for (int index= 0; index < word.length(); index++){
            for( char letter = 'A'; letter <= 'Z'; letter++){

          if (word.charAt(index) == letter){
                countUpperCase++;
             
 
        }
            else{
                countLowerCase++;   
    }   
        }
            


        }

}


    }
