#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the queensAttack function below.
def queensAttack(n, k, r_q, c_q, obstacles):
  l = c_q - 1
  u = n - r_q
  r = n - c_q
  d = r_q - 1
  ul = min(l, u)
  ur = min(r, u)
  dr = min(r, d)
  dl = min(l, d)
  distances = {'l':l, 'u':u, 'r':r, 'd':d, 'ul':ul, 'ur':ur, 'dr':dr, 'dl':dl}
  print(distances)
  for obstacle in obstacles:
    relative_loc = [r_q - obstacle[0], c_q - obstacle[1]]
    s = slope(relative_loc)
    if (s in [0, 1, 'undefined']):
      if (get_quad(relative_loc) == 'ur'):
        if (s == 1):
          distances['ur'] = ur - min(abs(relative_loc[0]), abs(relative_loc[1]))
          print(distances)
        else:
          distances['r'] = r - abs(relative_loc[0])
          print(distances)
      elif (get_quad(relative_loc) == 'ul'):
        if (s == 1):
          distances['ul'] = ul - min(abs(relative_loc[0]), abs(relative_loc[1]))
          print(distances)
        else:
          distances['u'] = u - abs(relative_loc[1])
          print(distances)
      elif (get_quad(relative_loc) == 'dl'):
        if (s == 1):
          distances['dl'] = dl - min(abs(relative_loc[0]), abs(relative_loc[1]))
          print(distances)
        else:
          distances['l'] = l - abs(relative_loc[0])
          print(distances)
      else:
        if (s == 1):
          distances['dr'] = dr - min(abs(relative_loc[0]), abs(relative_loc[1]))
          print(distances)
        else:
          distances['d'] = d - abs(relative_loc[1])
          print(distances)
  max_squares = sum(distances.values())
  return max_squares
      

def slope(coord):
  try:
    return coord[0] // coord[1]
  except ZeroDivisionError:
    return 'undefined'

def get_quad(coord):
  if (coord[1] > 0 and coord[0] >= 0):
    return 'ur'
  elif (coord[1] < 0 and coord[0] <= 0):
    return 'dl'
  elif (coord[1] <= 0 and coord[0] > 0):
    return 'ul'
  elif (coord[1] > 0 and coord[0] <= 0):
    return 'dr'
  assert False

if __name__ == '__main__':

  nk = input().split()

  n = int(nk[0])

  k = int(nk[1])

  r_qC_q = input().split()

  r_q = int(r_qC_q[0])

  c_q = int(r_qC_q[1])

  obstacles = []

  for _ in range(k):
    obstacles.append(list(map(int, input().rstrip().split())))

  result = queensAttack(n, k, r_q, c_q, obstacles)

  print(result)