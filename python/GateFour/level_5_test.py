import level_5
from unittest import TestCase

class Level5Test(TestCase):
    def test_primes_in_a_list(self):
        numbers = [1,2,3,4,6,8,9]
        result = level_5.get_primes(numbers)
        self.assertEqual(result,[2,3])

    def test_that_negatives_are_replaced(self):
        numbers = [18, -1, 4, -8, 5]
        result = level_5.replace_negatives(numbers)
        self.assertEqual(result,[18,0,4,0,5])

    def test_that_zeros_are_moved(self):
        numbers = [6,0,8,0,9]
        result = level_5.move_zeros(numbers)
        self.assertEqual(result,[6,8,9,0,0])
    
    def test_find_duplicates(self):
        numbers = [23,2,45,2,23,5]
        result = level_5.find_duplicates(numbers)
        self.assertEqual(result, [23,2])
    
