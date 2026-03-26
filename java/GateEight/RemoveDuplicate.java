public class RemoveDuplicate{

    public [] removeDuplicates (int [] numbers){
            int count = 0;
           
        for(int rowIndex = 0; rowIndex < numbers.length; rowIndex++){
                int smallest = numbers[rowIndex];
                for (int columnIndex = rowIndex +1; columnIndex < numbers.length; columnIndex){
                        
                        if(numbers[columnIndex] < smallest){
                            smallest = numbers[columnIndex];
                            numbers[columnIndex] = numbers[rowIndex];
                            numbers[rowIndex] = smallest;
                        }

                    }


        }
                int counter = 1;
                for(int index = 1; index < numbers.length; index++){
                    if(numbers[index] != numbers[index -1]){
                    counter++;
                    }


            }
            
            int [] newNumber = new int [counter];
            int count = 0;
            newNumber[0] = numbers[index];
             for(int index = 0; index < numbers.length; index++){


            }
              
                
            
    }

}
