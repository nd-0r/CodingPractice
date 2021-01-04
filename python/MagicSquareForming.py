from sympy import Matrix
import math
import os

def formingMagicSquare(s):
  print(s)
  # the minimum cost to return
  min_cost = math.inf
  # the size of the rows/cols of the input matrix
  n = len(s)
  # the maximum sum of any straight of the magic square
  MAX_SUM = 3 * (pow(n, 2))
  # the matrix giving the conditions on a through i
  A = Matrix(7, 9, [1, 1, 1, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 1, 1, 1, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 1, 1, 1,
                    1, 0, 0, 1, 0, 0, 1, 0, 0,
                    0, 1, 0, 0, 1, 0, 0, 1, 0,
                    0, 0, 1, 0, 0, 1, 0, 0, 1,
                    1, 0, 0, 0, 1, 0, 0, 0, 1])
  # the column weights of A
  x = [j[i] for j in s for i in range(n)]
  print(x)
  # the magic number which the weighted rows of a
  # must sum to (we will iterate through these to
  # find the one which produces the least cost from
  # 0 to MAX_SUM)
  for magic_num in range(0, MAX_SUM):
    x_hat = [(x[5] / 2) + (x[7] / 2),
             (x[5] / 2) - (x[7] / 2) + x[8],
             - x[5] - x[8] + magic_num,
             - (x[5] / 2) + (x[7] / 2) + x[8],
             - (x[5] / 2) - (x[7] / 2) - x[8] + magic_num,
             x[5],
             - x[7] - x[8] + magic_num,
             x[7],
             x[8]
    ]
    error = [abs(i - j) for i,j in zip(x, x_hat)]
    cost = sum(error)
    if ((cost < min_cost) and float(cost).is_integer()):
      min_cost = cost
  return min_cost

if __name__ == '__main__':

  # s = []

  # for _ in range(3):
  #   s.append(list(map(int, input().rstrip().split())))

  test0 = [[4, 9, 2], [3, 5, 7], [8, 1, 5]]
  test2 = [[4, 8, 2], [4, 5, 7], [6, 1, 6]]

  print('in: ', test0)
  print('out: ', formingMagicSquare(test0))
  print('in: ', test2)
  print('out: ', formingMagicSquare(test2))
