import level_6
from unittest import TestCase

class Level6Test(TestCase):
    def test_spilt_even_odd(self):
        numbers = [45,60,10,9,7,8]
        result =  level_6.split_even_odd(numbers)
        self.assertEqual(result,[[45,9,7],[60,10,8]])

    def test_numbers_is_palindrome(self):
        numbers = [1,2,1]
        result =  level_6.is_palindrome(numbers)
        self.assertTrue(result, True) 

    def test_perfect_squares(self):
        numbers = [5,9,16,15,49]
        result =  level_6.perfect_squares(numbers)
        self.assertEqual(result, [9,16,49])

    def test_non_perfect_squares(self):
         numbers = [5,9,16,15,49]
         result =  level_6.replace_non_perfect(numbers)
         self.assertEqual(result, [-1,9,16,-1,49])

