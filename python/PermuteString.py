def permute_string(string):
  all_perms = []
  if (len(string) == 1):
      return [string]
  idx = 0
  for char in string:
      next_perm = []
      if (idx == len(string) - 1):
          next_perm = permute_string(string[0:idx])
      else:
          next_perm = permute_string(string[0:idx] + string[idx + 1:])
      for perm in next_perm:
          all_perms.append([char] + perm)
      idx += 1
  return all_perms

if __name__ == '__main__':
  string = input('Enter a string:')
  for perm in permute_string([char for char in string]):
    print(''.join(perm))