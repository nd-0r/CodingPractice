#include <iostream>
#include <vector>

bool is_prime(int n) {
  if (n % 2 == 0) return false;

  for (size_t i = 3; i * i <= n; i += 2) {
    if (n % i == 0) return false;
  }

  return true;
}

int find_prime(int n) {
  size_t num_primes = 0;
  long candidate = 2;
  for (; num_primes < n; ++candidate) {
    if (is_prime(candidate)) {
      std::cout << candidate << '\n';
      ++num_primes;
    }
  }

  std::cout << std::endl;
  return candidate - 1;
}

int main() {
  int prime = find_prime(10001);
  std::cout << prime << std::endl;
  return 0;
}
