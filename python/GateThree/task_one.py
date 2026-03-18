def reduce_length(numbers,number): 
    new_numbers = []
   
    if len(numbers) > number:
            new_numbers.append(numbers[0])
            new_numbers.append(numbers[1])
    return new_numbers 
    

def fill_empty_list(number):
    new_numbers = []
   
  
    for index in range(number):
        new_numbers.append(-1)

    return new_numbers

#def add_default_value_to_list(numbers, number):
#
#    new_numbers = []
#    for index in range(number):
#        if len(numbers) < number:
#            new_numbers.append(numbers[index])
#        else:
#            new_numbers.append(-1)
#    return new_numbers
#  
    

def return_letter_and_count(letters):
    count_upper = 0
    count_lower = 0
    letter_count = ""
  # for index in range(len)
    for character in letters:
        if character.lower():
            count_lower += 1
            letter_count = character + str(count_lower)
        else:
            count_upper += 1
            letter_count = character + str(count_upper)
        
        return letter_count
            
         
