#include "vector"
#include "string"
#include "iostream"
#include "fstream"

using namespace std;

string ltrim(const string &);
string rtrim(const string &);

bool next_permutation(char* str, size_t length) {
  if (length == 0) {
    return false;
  }

  size_t i = length - 1;
  while (i > 0 && str[i - 1] >= str[i]) {
    --i;
  }

  if (i == 0) {
    return false;
  }

  size_t j = length - 1;
  while (str[j] <= str[i - 1]) {
    --j;
  }
  
  swap(str[i - 1], str[j]);

  reverse(&str[i], str + length);

  return true;
}

/*
 * Complete the 'biggerIsGreater' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING w as parameter.
 */

string biggerIsGreater(string w) {
  char str[w.length()];
  strcpy(str, w.c_str());
  if ((next_permutation(str, w.length()))) {
    return string(str);
  }
  return "no answer";
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string T_temp;
    getline(cin, T_temp);

    int T = stoi(ltrim(rtrim(T_temp)));

    for (int T_itr = 0; T_itr < T; T_itr++) {
        string w;
        getline(cin, w);

        string result = biggerIsGreater(w);

        std::cout << result << std::endl;

        fout << result << "\n";
    }

    fout.close();

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