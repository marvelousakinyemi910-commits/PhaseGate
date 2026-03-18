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

def add_default_value_to_list(numbers, number):

    new_numbers = []
    for index in range(number):
        if len(numbers) < number:
            new_numbers += numbers[index]
        else:
             new_numbers.append(-1)
    return new_numbers
  
    
    
