import java.util.Random;
public class NumberGuessingApp{
    static Random random = new Random();

    public int generateRandomNumber(){
    int number = random.nextInt(100) + 1;
        return number;
    }
    
    public String guessNumber(int number, int guess){
        for (int count = 0; count < 5; count++) {
    
            if(number < guess)
       
                return "Too low";
    

            else if (number > guess){
      
             return "Too high";
           }
    
         }
    return "correct";
    }
    
   public String validateUserInput(int guess){
  
            if(guess < 1 || guess > 100) {
                return "Number should be between 1 and 100";
            }

                return null;     
      }          
         
             
    
    public String rating(int numberOfGuesses){
            if(numberOfGuesses == 1){
                return "Legendary";
            }
            else if (numberOfGuesses == 2){
                 return "Excellent";
                }

            else if ( numberOfGuesses == 3 ||  numberOfGuesses == 4){
                return "Good";
                    }
          

      return "No win = Better luck";

        }
            
        }



        



    
