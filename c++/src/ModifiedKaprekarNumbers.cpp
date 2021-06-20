#include "vector"
#include "string"
#include "iostream"
#include "fstream"
#include "cmath"

using namespace std;

string ltrim(const string &);
string rtrim(const string &);

bool isKaprekarNumber(int x) {
  // long long square = x * x;
  // size_t num_digits = to_string(square).length();

  // long right = square % long(pow(10, num_digits - num_digits / 2));
  // long left = square / long(pow(10, num_digits - num_digits / 2));

  string square = to_string(long(pow(x, 2)));
  size_t num_digits = square.length();

  string left = square.substr(0, num_digits / 2);
  string right = square.substr(num_digits / 2);

  if (left.empty()) left = "0";

  return stoi(right) + stoi(left) == x;
}

/*
 * Complete the 'kaprekarNumbers' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER p
 *  2. INTEGER q
 */

void kaprekarNumbers(int p, int q) {
  size_t count = 0;

  for (size_t candidate = p; candidate <= q; ++candidate) {
    if (isKaprekarNumber(candidate)) {
      cout << candidate << " ";
      ++count;
    }
  }

  if (count == 0) {
    cout << "INVALID RANGE" << endl;
  } else {
    cout << endl;
  }
}

int main()
{
    string p_temp;
    getline(cin, p_temp);

    int p = stoi(ltrim(rtrim(p_temp)));

    string q_temp;
    getline(cin, q_temp);

    int q = stoi(ltrim(rtrim(q_temp)));

    kaprekarNumbers(p, q);

    return 0;
}

string ltrim(const string &str) {
    string s(str);

    s.erase(
        s.begin(),
        find_if(s.begin(), s.end(), not1(ptr_fun<int, int>(isspace)))
    );

    return s;
}

string rtrim(const string &str) {
    string s(str);

    s.erase(
        find_if(s.rbegin(), s.rend(), not1(ptr_fun<int, int>(isspace))).base(),
        s.end()
    );

    return s;
}
