#include <iostream>
#include <vector>
#include <algorithm>

unsigned long int check_prime(unsigned long int n) {
  if (n % 2 == 0) {
    return 2;
  }
  for (size_t i = 3; i*i <= n; i += 2) {
    if (n % i == 0) {
      return i;
    }
  }
  return 1;
}

unsigned long int find_largest_prime_factor_new(unsigned long int n) {
  unsigned long int divisor = check_prime(n);

  if (divisor == 1) {
    return n;
  }

  return find_largest_prime_factor_new(n / divisor);
}

int main() {
  unsigned long int to_check;
  std::cin >> to_check;
  unsigned long int largest_prime_factor = find_largest_prime_factor_new(to_check);
  std::cout << largest_prime_factor << std::endl;
  return 0;
}
