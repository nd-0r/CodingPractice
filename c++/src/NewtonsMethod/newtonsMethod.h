# include <vector>
# include <math.h>

# ifndef NEWTONSMETHOD
# define NEWTONSMETHOD

long double approximateRoot(const std::vector<long double> &poly, const std::vector<long double> &deriv, int, long double, long double);

# endif