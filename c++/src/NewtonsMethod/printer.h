# include <iostream>
# include <vector>
# include <string>

# ifndef PRINTER
# define PRINTER

template <class T>
void printVector(const std::vector<T> &in)
{
  for (T element : in) {
    std::cout << std::to_string(element) + " ";
  }
}

# endif