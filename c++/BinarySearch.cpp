# include <iostream>
# include <vector>
# include <string>
using namespace std;

bool isPrimeHelper(vector<int> primes, int target, int start, int end)
{
    if (abs(end - start) < 1) {
        return false;
    }
    int i = (start + end) / 2;
    int current = primes[i];
    if (current ==  target) {
        cout << "here\n";
        return true;
    } else if (current < target) {
        cout << "here\n";
        return isPrimeHelper(primes, target, i + 1, end);
    }
    cout << "here\n";
    return isPrimeHelper(primes, target, start, i);
}

string isPrime(vector<int> primes, int target)
{
    if (isPrimeHelper(primes, target, 0, primes.size() - 1)) {
        return "yes\n";
    }
    return "no\n";
}

int main()
{
    vector<int> primes { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };
    int p;
    while (true) {
        do {
            cout << "Enter a number between 2 and 97 inclusive: ";
            cin >> p;
        } while (!(p >= 2 && p <= 97));
        cout << isPrime(primes, p);
    }
    return 0;
}