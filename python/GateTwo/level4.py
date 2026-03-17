def addition(first_number, second_number):
    total = first_number + second_number
    return total


def check_even(number):
    if number % 2 == 0:
        return True
    else:
         return False


def square_of_number(number):
   square = number * number
   return square

def convert_to_fahrenit(number):
    fahrenit = number * 9/5 + 32
    return fahrenit 

def check_prime_number(number):
    for count in range (2, number):
        if(number % count == 0):
            return False
        else:
            return True
def find_largest(first_number, second_number, third_number):
    largest =first_number 
    if second_number > largest and second_number > third_number:
       largest =   second_number 
       return largest
    else:
         largest = third_number 
         return  largest
    
def simple_interest(principal,rate,time):
    simple_interest = (principal * rate * time) / 100
    return simple_interest

def multiplication_table(number):
    for count in range(1,13):
        return f"{number} x {count} = {number * count}"

def area_of_rectangle(length, width):
    area = length * width
    return area

def reverse_
