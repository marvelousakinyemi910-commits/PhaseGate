import math
def split_even_odd(numbers):
    odd = []
    even = []
    for number in numbers:
        if number % 2 == 0:
            even.append(number)
        else:
            odd.append(number)
    return[odd, even]

def is_palindrome(numbers):
    left = 0
    right = len(numbers) - 1
    while left < right:
        if numbers[left] != numbers[right]:
            return False
        left += 1
        right -= 1
    return True

def perfect_squares(numbers):
    result = []
    for number in numbers:
        if int(math.sqrt(number))**2 == number:
            result.append(number)
    return result

def replace_non_perfect(numbers):
    for index in range(len(numbers)):
        if int(math.sqrt(numbers[index]))**2 != numbers[index]:
            numbers[index] = -1
    return numbers

        
