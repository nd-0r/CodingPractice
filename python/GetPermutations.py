import unittest


def get_permutations(string):
    
    if len(string) == 0:
        return set([""])

    if len(string) == 1:
        return set(string)
    
    perms = set()
    
    for char_idx in range(len(string)):
        for perm in get_permutations("".join([c for i,c in enumerate(string) if i != char_idx])):
            perms.add(string[char_idx] + perm)

    return perms




  # Tests

class Test(unittest.TestCase):

    def test_empty_string(self):
        actual = get_permutations('')
        expected = set([''])
        self.assertEqual(actual, expected)

    def test_one_character_string(self):
        actual = get_permutations('a')
        expected = set(['a'])
        self.assertEqual(actual, expected)

    def test_two_character_string(self):
        actual = get_permutations('ab')
        expected = set(['ab', 'ba'])
        self.assertEqual(actual, expected)

    def test_three_character_string(self):
        actual = get_permutations('abc')
        expected = set(['abc', 'acb', 'bac', 'bca', 'cab', 'cba'])
        self.assertEqual(actual, expected)


unittest.main(verbosity=2)