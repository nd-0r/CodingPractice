import unittest

# def change_possibilities(amount, denominations):
#   if amount == 0:
#     return 1
#   num_ways = 0
#   i = len(denominations) - 1
#   while (i >= 0):
#     num_denoms = 1
#     while (num_denoms <= amount / denominations[i]):
#       balance = amount
#       balance -= (denominations[i] * num_denoms)
#       j = i - 1
#       while (j >= 0):
#         if (balance % denominations[j] == 0):
#           balance -= (denominations[j] * (balance / denominations[j]))
#         j -= 1
#       if (balance == 0):
#         num_ways += 1
#       num_denoms += 1
#     i -= 1
#   return num_ways

def change_possibilities(amount, denominations):
  return get_possibilities(amount, denominations, len(denominations) - 1, 0)

def get_possibilities(amount, denominations, i, num_denoms):
  if amount == 0:
    return 1
  if i < 0:
    return 0

  possibilities = 0

  if num_denoms == 0:
    while num_denoms < amount / denominations[i]:
      num_denoms += 1
      possibilities += get_possibilities(amount, denominations, i, num_denoms)

  amount -= (denominations[i] * num_denoms)

  possibilities += get_possibilities(amount, denominations, i - 1, 0)

  return possibilities

class Test(unittest.TestCase):

  def test_sample_input(self):
      actual = change_possibilities(4, (1, 2, 3))
      expected = 4
      self.assertEqual(actual, expected)

  def test_one_way_to_make_zero_cents(self):
      actual = change_possibilities(0, (1, 2))
      expected = 1
      self.assertEqual(actual, expected)

  def test_no_ways_if_no_coins(self):
      actual = change_possibilities(1, ())
      expected = 0
      self.assertEqual(actual, expected)

  def test_big_coin_value(self):
      actual = change_possibilities(5, (25, 50))
      expected = 0
      self.assertEqual(actual, expected)

  def test_big_target_amount(self):
      actual = change_possibilities(50, (5, 10))
      expected = 6
      self.assertEqual(actual, expected)

  def test_change_for_one_dollar(self):
      actual = change_possibilities(100, (1, 5, 10, 25, 50))
      expected = 292
      self.assertEqual(actual, expected)


unittest.main(verbosity=2)