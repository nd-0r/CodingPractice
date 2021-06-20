#include "vector"
#include "string"
#include "iostream"
#include "fstream"

using namespace std;

string ltrim(const string &);
string rtrim(const string &);
vector<string> split(const string &);

bool next_permutation(int* arr, size_t length) {
  if (length == 0) {
    return false;
  }

  size_t i = length - 1;
  while (i > 0 && arr[i - 1] >= arr[i]) {
    --i;
  }

  if (i == 0) {
    return false;
  }

  size_t j = length - 1;
  while (arr[j] <= arr[i - 1]) {
    --j;
  }
  
  swap(arr[i - 1], arr[j]);

  reverse(&arr[i], arr + length);

  return true;
}

bool is_absolute(int* arr, size_t length, size_t k) {
  for (size_t arr_idx = 0; arr_idx < length; ++arr_idx) {
    if (abs(static_cast<int>(arr[arr_idx] - (arr_idx + 1))) != k) {
      return false;
    }
  }

  return true;
}

int* create_arr(size_t n) {
  int* arr = new int[n];

  for (size_t current_num = 1; current_num <= n; ++current_num) {
    arr[current_num - 1] = current_num;
  }
  
  return arr;
}

int* find_absolute_permutation(int* arr, size_t length, size_t k) {
  while (true) {
    if (is_absolute(arr, length, k)) {
      return arr;
    }

    next_permutation(arr, length);
  }

  return nullptr;
}

/*
 * Complete the 'absolutePermutation' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER k
 */

vector<int> absolutePermutation(int n, int k) {
  int* arr = create_arr(n);

  int* permutated_arr = find_absolute_permutation(arr, n, k);

  if (permutated_arr == nullptr) {
    delete[] arr;
    return vector<int>({-1});
  }

  vector<int> arr_vec = vector<int>(permutated_arr, permutated_arr + n);
  delete[] arr;
  return arr_vec;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string t_temp;
    getline(cin, t_temp);

    int t = stoi(ltrim(rtrim(t_temp)));

    for (int t_itr = 0; t_itr < t; t_itr++) {
        string first_multiple_input_temp;
        getline(cin, first_multiple_input_temp);

        vector<string> first_multiple_input = split(rtrim(first_multiple_input_temp));

        int n = stoi(first_multiple_input[0]);

        int k = stoi(first_multiple_input[1]);

        vector<int> result = absolutePermutation(n, k);

        for (size_t i = 0; i < result.size(); i++) {
            fout << result[i];
            cout << result[i];

            if (i != result.size() - 1) {
                fout << " ";
                cout << " ";
            }
        }

        fout << "\n";
        cout << "\n";
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

vector<string> split(const string &str) {
    vector<string> tokens;

    string::size_type start = 0;
    string::size_type end = 0;

    while ((end = str.find(" ", start)) != string::npos) {
        tokens.push_back(str.substr(start, end - start));

        start = end + 1;
    }

    tokens.push_back(str.substr(start));

    return tokens;
}
