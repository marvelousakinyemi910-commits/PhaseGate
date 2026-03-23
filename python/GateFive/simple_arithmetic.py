#//import Random to generate 2 different random numbers (first and second number) 
#// use a while loop to ensure that firstNumber is greater tham secondNumber to avoid negative answer
#// initialise the random numbers 
#//import Scanner to collect input
#// ask user to enter a number up to 10 times using an outer while loop
#// if user is wrong, ask again
#// intialise score outside the loop
#//if number is the same as answer, increment score
#// Display the total of scores 
#



import random


count = 0
score = 0

while count < 10:
    first_number = random.randint(1,31)
    second_number = random.randint(1,31)
   

    number = int(input(f"{first_number} - {second_number} =  "))
    while second_number > first_number:
        second_number = random.randint(1,21)

  
    if (first_number -  second_number ) != number:
        number = int(input(f"{first_number} - {second_number} =  "))
    if (first_number -  second_number ) == number:
        score += 1
        

    count += 1
print(f"You got {score} numbers correctly out of 10 ")
