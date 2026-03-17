from unittest import TestCase
import level4


class TestLevelFour(TestCase):
    def test_addition(self):
        result = level4.addition(4,5)
        self.assertEqual(result,9 )
        
    def test_addition2(self):
        result = level4.addition(6,5)
        self.assertEqual(result,11 )
        
    def test_if_a_number_is_even(self):
        check = level4.check_even(4)
        self.assertTrue(check,True)
    def test_if_a_number_is_odd(self):
        check = level4.check_even(5)
        self.assertFalse(check,False)

    def test_square(self):
        square = level4.square_of_number(5)
        self.assertEqual(square,25 )
    def test_square2(self):
        square = level4.square_of_number(6)
        self.assertEqual(square,36 )

    def test_conversion_to_fahrenit(self):
        result = level4.convert_to_fahrenit(0)
        self.assertEqual(result, 32)
    def test_conversion_to_fahrenit2(self):
        result = level4.convert_to_fahrenit(1)
        self.assertEqual(result, 33.8)

    def test_prime(self):
        result = level4.check_prime_number(7)
        self.assertTrue(result, True)
    def test_prime2(self):
        result = level4.check_prime_number(6)
        self.assertFalse(result, False)
    def test_largest_number(self):
        largest = 1
        largest = level4.find_largest(1,2,3)
        self.assertEqual(largest, 3)
        
    def test_largest_number2(self):
        largest = 4
        largest = level4.find_largest(4,5,8)
        self.assertEqual(largest, 8)

    def test_simple_interest(self):
        simple_interest = level4.simple_interest(2,3,4)
        self.assertEqual(simple_interest, 0.24)
    def test_simple_interest2(self):
        simple_interest = level4.simple_interest(6,6,5)
        self.assertEqual(simple_interest, 1.8)
    def test_area_of_rectangle(self):
        result = level4.area_of_rectangle(8,10)
        self.assertEqual(result, 80)
    def test_area_of_rectangle2(self):
        result = level4.area_of_rectangle(6,10)
        self.assertEqual(result, 60)

        
