# include "derivative.h"
# include "printer.h"
# include "newtonsMethod.h"
# include <iostream>
# include <vector>
# include <string>

int main()
{
  int power;
  std::cout << "Enter the greatest power of the polynomial: ";
  std::cin >> power;
  while (!(power >= 0)) {
    std::cout << "Power must be greater than or equal to 0. Try again: ";
    std::cin >> power;
  }
  std::vector<long double> polynomial (power + 1);
  std::cout << "Enter each of the coefficients of the polynomial followed by a newline: \n";
  std::string in;
  std::string::size_type sz;
  for (int i = 0; i < power + 1; ++i) {
    std::cin >> in;
    polynomial[i] = std::stod(in, &sz);
  }
  std::vector<long double> derivative;
  derivative = calcDerivative(polynomial, power + 1);
  std::cout << "\nPolynomial:\n";
  printVector<long double>(polynomial);
  std::cout << "\nDerivative:\n";
  printVector<long double>(derivative);

  std::cout << "\n\nEnter a guess for the root of the polynomial: ";
  const long double ERROR = 0.0001;
  long double guess;
  long double soln;
  std::cin >> guess;
  soln = approximateRoot(polynomial, derivative, power, guess, ERROR);
  std::cout << "\nApproximate root: " + std::to_string(soln) + "\n";
}