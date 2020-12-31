# include <iostream>
# include <string>
using namespace std;

// pass a pointer to a constant integer
// because the integer does not need to
// be modified
bool isPrime(const long int * toCheck)
{
	// 1 and 0 are non-prime
	if (*toCheck < 2) return false;

	// since a number divisible by 2 must also
	// be divisible by (n / 2), then we only have
	// to check 2 first
	if (*toCheck % 2 == 0) return false;

	// just check the odds up to the square root
	// of toCheck
	for (int i = 3; i * i < *toCheck; i += 2) {
		if (*toCheck % i == 0) return false;
	}

	return true;
}

// copy the value into the function because we 
// need to modify the variable to determine
// the number of base 10 digits
bool checkZeros(long int toCheck)
{
	while (toCheck != 0) {
		if (toCheck % 10 == 0) return false;
		toCheck /= 10;
	}
	return true;
}

bool checkLeftPrimes(long int toCheck)
{
	long int mod = 1000000;
	while (toCheck != 0) {
		if (!(isPrime(&toCheck))) return false;
		toCheck %= mod;
		mod /= 10;
	}
	return true;
}

bool checkRightPrimes(long int toCheck)
{
	while (toCheck != 0) {
		if (!(isPrime(&toCheck))) return false;
		toCheck /= 10;
	}
	return true;
}

string truncatable(const long int * num)
{
	bool left = checkZeros(*num) && checkLeftPrimes(*num);
	bool right = checkZeros(*num) && checkRightPrimes(*num);

	if (left && right) {
		return "both";
	} else if (left) {
		return "left";
	} else if (right) {
		return "right";
	}
	return "none";
}

int main()
{
	const long int MAX_VALUE = 1000000;
	long long int temp;
	do {
		cout << "Enter an integer between 0 and 10^6: ";
		cin >> temp;
	} while (!(temp < MAX_VALUE));
	long int n = (long) temp;
	cout << '\n' << n << " is a " << truncatable(&n) << "-truncatable prime" << endl;
        return 0;
}
