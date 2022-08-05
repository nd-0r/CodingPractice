#!/usr/local/bin/python3

import unittest
import random
import argparse
import sys

from insertionsort import insertion_sort
from mergesort import merge_sort

sorts = [insertion_sort, merge_sort]

class SortTest(unittest.TestCase):
    def __init__(self, sorter):
        super().__init__()
        self.sorter = sorter

    def test_empty(self):
        assert self.sorter
        test = []
        expected = []
        out = self.sorter(test)
        self.assertEqual(out, expected)

    def test_singleton(self):
        assert self.sorter
        test = [1]
        expected = [1]
        out = self.sorter(test)
        self.assertEqual(out, expected)

    def test_random(self):
        assert self.sorter
        test = [71, 6, 63, -13, 61, 89, 33, -1, 97, 65] 
        expected = [i for i in sorted(test)]
        out = self.sorter(test)
        self.assertEqual(out, expected)

    def test_random_large(self):
        assert self.sorter
        test = [random.randint(-100, 100) for _ in range(1000)]
        expected = [i for i in sorted(test)]
        out = self.sorter(test)
        self.assertEqual(out, expected)
        

if __name__ == "__main__":
    sorts = {s.__name__.replace("_sort", ""): s for s in sorts}
    parser = argparse.ArgumentParser(description='Sorting algorithms')
    parser.add_argument('algorithms', metavar='<algorithm>', type=str, nargs='*', help='the algorithm to run')
    parsed_args = parser.parse_args()
    sys.argv = sys.argv[:1]

    suite = unittest.TestSuite()
    tests = unittest.TestLoader()
    algos = parsed_args.algorithms if parsed_args.algorithms else sorts.keys()
    for algorithm in algos:
        try:
            suite.addTest(tests.loadTestsFromTestCase(SortTest(sorts[algorithm])))
        except KeyError:
            print(f'Unknown algorithm: {algorithm}')

    runner = unittest.TextTestRunner()
    runner.run(suite)

