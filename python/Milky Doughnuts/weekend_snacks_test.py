import weekend_snacks
from unittest import TestCase

class WeekendSnacksTest(TestCase):
    def test_the_number_of_even_numbers(self):
        numbers = [2,5,8,9,10]
        actualResult = weekend_snacks.count_even(numbers)
        expectedResult = 3
        self.assertEqual(actualResult , expectedResult)

    def test_that_the_target_is_in_the_list(self):
        numbers = [2,5,8,9,10]
        target = 2
        actualResult = weekend_snacks.linear_search(numbers, target)
        expectedResult = 0
        self.assertEqual(actualResult , expectedResult)
    
    def test_that_the_target_is_not_in_the_list(self):
        numbers = [2,5,8,9,10]
        target = 1
        actualResult = weekend_snacks.linear_search(numbers, target)
        expectedResult = -1
        self.assertEqual(actualResult , expectedResult)

    def test_squares(self):
        number = 4
        actualResult = weekend_snacks.squares(number)
        expectedResult = [1,4,9,16]

    def test_that_length_of_array_is_not_equal(self):
        first_list = [1,2,3,4]
        second_list = [1,2,3]
        expected = False
        actual = weekend_snacks.array_equal(first_list, second_list)
        self.assertEqual(actual, expected)

    def test_that_length_of_array_is_equal(self):
        first_list = [1,2,3,4]
        second_list = [1,2,3,4]
        expected = True
        actual = weekend_snacks.array_equal(first_list, second_list)
        self.assertEqual(actual, expected)

    def test_that_values_of_the_list_is_equal(self):
        first_list = [1,2,3,4]
        second_list = [1,2,3,4]
        expected = True
        actual = weekend_snacks.array_equal(first_list, second_list)
        self.assertEqual(actual, expected)

    def test_that_duplicate_number_is_removed(self):
        numbers = [1,2,2,4,5,6,6,7,8,8]
        expected = [1,2,4,5,6,7,8]
        actual = weekend_snacks.remove_duplicates(numbers)
        self.assertEqual(actual, expected)

    def test_flatten(self):
        arrays = [
        [1,2,3],
        [4,5,6],
        [7,8,9]
        ]
        expected = [1,2,3,4,5,6,7,8,9]
        actual = weekend_snacks.flatten(arrays)
        self.assertEqual(actual, expected)

    def test_intersect_of_numbers(self):
        first_list = [1,2,3,4,6,7,9]
        second_list = [1,2,3,4]
        expected = [1,2,3,4]
        actual = weekend_snacks.intersect_of(first_list, second_list)
        self.assertEqual(actual, expected)
        
        
