def is_prime(number):
    if number <= 1:
        return False
    for divisor in range(2,number):
        if number % divisor == 0:
            return False
    return True

def get_primes(numbers):
    primes = []
    for number in numbers:
        if is_prime(number):
            primes.append(number)
            primes.sort
    return primes

def replace_negatives(numbers):
    for index in range(len(numbers)):
        if numbers[index] < 0:
            numbers[index] = 0
    return numbers

def move_zeros(numbers):
    result = []
    count_zeros = 0
    for number in numbers:
        if number == 0:
            count_zeros += 1
        else:
            result.append(number)
    result.extend([0] *count_zeros)
    return result

    





def find_duplicates(numbers):
    duplicates = []
    for index in range(len(numbers)):
        for checking in range(index + 1, len(numbers)) :
            if numbers[index] == numbers[checking]:
                if numbers[index ] not in duplicates :
                    duplicates.append(numbers[index])
                    break
    return duplicates
    
