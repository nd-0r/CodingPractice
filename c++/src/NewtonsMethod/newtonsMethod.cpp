# include "newtonsMethod.h"

long double evalPoly(const std::vector<long double> &poly, int power, long double val)
{
  long double out = 0;
  for (long double coeff : poly) {
    out += (coeff * pow(val, (long double) power));
    power -= 1;
  }
  return out;
}

long double approximateRoot(const std::vector<long double> &poly, const std::vector<long double> &deriv, int polyPower, long double guess, long double error)
{
  long double top = evalPoly(poly, polyPower, guess);
  long double bottom = evalPoly(deriv, polyPower - 1, guess);
  long double soln = guess - (top / bottom);
  if (abs(soln - guess) <= error) {
    return soln;
  }
  return approximateRoot(poly, deriv, polyPower, soln, error);
}