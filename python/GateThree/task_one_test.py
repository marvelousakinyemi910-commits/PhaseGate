import task_one
from unittest import TestCase

class TaskOneTest(TestCase):
    def test_that_length_is_reduced(self):
        numbers = [10,11,12,13,14]
        number = 2
        result = task_one.reduce_length(numbers,number)
        self.assertEqual(result,[10,11])

    def test_that_empty_list_is_filled(self):
        number = 4
        result = task_one.fill_empty_list(number)
        self.assertEqual(result,[-1,-1,-1,-1])

    def test_that_short_list_is_filled_up_with_default_value(self):
        numbers = [10,11,12]
        number = 5
        result = task_one.add_default_value_to_list(numbers,number)
        self.assertEqual(result,[10,11,12,-1,-1])
