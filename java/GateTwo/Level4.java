public class Level4{
    public int addition (int firstNumber, int secondNumber){

    return firstNumber + secondNumber;

}
    public boolean isEven(int number){
    
    if (number % 2 == 0){
        return true;
    }
    else{
        return false;

    }

    }
    public int square(int number){
    int square = number * number;
        return square;


    }

    public double fahrenheit(double number){
      double fahrenheit = number * 9/5 + 32;
        return fahrenheit;

    }

//    public boolean isPrimeNumber(int number){
//        boolean isPrime = true;
//        for(int count = 2; count < number; count++){
//            if(number % count == 0)
//                return false;
//            
//
//       
//        else{
//            
//            return true;
//
//        }
//
//        return isPrime;
//    }
//
//}
//

     public int findLargest(int firstNumber, int secondNumber, int thirdNumber){
        int largest = firstNumber;
        if(secondNumber > largest && secondNumber > thirdNumber){
            largest = secondNumber;
            return largest;
}
        else{
            largest = thirdNumber;
            return largest;
        }
    }

    public double simpleInterest(double principal, double rate, double time){
      double simpleInterest = (principal * rate * time) / 100;
       return simpleInterest;

        }


    public int area(int length, int width){

        int area = length * width;
        return area;


    }


    public String reverse(String number){
    String reverse = ""
    for(int index = number.length -1; index >= 0; index--){
        reverse += number.charAt(index);
        

    }
        return reverse;

    }
}


