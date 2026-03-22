def count_even(numbers):
    count = 0
    for number in numbers:
        if number % 2 == 0:
            count += 1
    return count


def linear_search(numbers, target):
    for index in  range(len(numbers)):
        if numbers[index] == target:
            return index
    return -1


def squares(number):
    perfect_square = []
    for index in range(1, number+1):
        perfect_square.append(index * index)
    return perfect_square



def array_equal(first_list, second_list):
    if len(first_list) != len(second_list):
        return False
    for index in range(len(first_list)):
        if first_list[index] != second_list[index]:
            return False
    return True

def remove_duplicates(numbers):
    result = []
    for number in numbers:
        if number not in result:
            result.append(number)
    return result

def flatten(arrays):
    result = []
    for row in arrays:
        for number in row:
            result.append(number)
    return result

def intersect_of(first_list, second_list): 
    result = []
    for number in first_list:
        if number in  second_list and number not in result:
            result.append(number)
    return result
