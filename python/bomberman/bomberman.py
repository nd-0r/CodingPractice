#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the bomberMan function below.

# for this problem, there are really only
# 3 possible states of the grid because
# bomberman plants all the empty spaces
# with bombs 1 second after the initial
# planting and the bombs explode every 
# 3 seconds:
#
# 1) the original layout
#    - at t = 0, 1 + 4k
# 2) the filled layout
#    - at t = 2 + 2K
# 3) the exploded layout
#    - at t = 3 + 4k
#

def bomberMan(n, grid):
  original_grid = grid
  if (max(n - 1, 0) % 4 == 0):
    return original_grid
  filled_grid = getFilledLayout(original_grid)
  exploded_grid = getExplodedLayout(original_grid)
  if ((n - 2) % 2 == 0 and n != 0):
    return filled_grid
  else:
    return exploded_grid

def getFilledLayout(original_grid):
  out = []
  row = '0' * len(original_grid[0])
  for _ in range(len(original_grid)):
    out.append(row)
  return out

def getExplodedLayout(original_grid):
  filled_grid = getFilledLayout(original_grid)
  for i, row in enumerate(original_grid):
    for j, x in enumerate(row):
      if x == '0':
        if i > 0:
          tmp = filled_grid[i - 1]
          filled_grid[i - 1] = tmp[:j] + '.' + tmp[j + 1:]
          print(filled_grid[i - 1])
        if i < len(original_grid) - 1:
          tmp = filled_grid[i + 1]
          filled_grid[i + 1] = tmp[:j] + '.' + tmp[j + 1:]
          print(filled_grid[i + 1])
        tmp = filled_grid[i]
        start = max(0, j - 1)
        end = min(len(tmp), j + 2)
        filled_grid[i] = tmp[:start] + ('.' * (end - start)) + tmp[end:]
        print(filled_grid[i])
  return filled_grid



if __name__ == '__main__':
    rcn = input().split()

    r = int(rcn[0])

    c = int(rcn[1])

    n = int(rcn[2])

    grid = []

    for _ in range(r):
        grid_item = input()
        grid.append(grid_item)

    result = bomberMan(n, grid)
