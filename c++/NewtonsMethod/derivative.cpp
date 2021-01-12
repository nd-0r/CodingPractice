# include "derivative.h"

std::vector<long double> calcDerivative(const std::vector<long double> &in, int size)
{
  std::vector<long double> out (size - 1);
  int power = size - 1;
  for (int i = 0; i < size - 1; ++i) {
    out[i] = power * in[i];
  }
  return out;
}