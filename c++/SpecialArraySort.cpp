# include <iostream>
# include <vector>
# include "./QuickSort.cpp"
using namespace std;

void printVector(vector<int> arr)
{
  cout << '{';
  for (int i : arr) {
    cout << i << ", ";
  }
  cout << arr[arr.size() - 1] << "}\n";
}

vector<vector<int>> advancedSort(vector<int> arr)
{
	int toSort[arr.size()];
  int count = 0;
  for (int i : arr) {
    toSort[count] = i;
    ++count;
  }
  quickSort(toSort, 0, arr.size());
  vector<vector<int>> out;
  int last = toSort[0];
  for (int i = 0; i < arr.size(); i++) {
    int count = 0;
    vector<int> temp;
    while (i < arr.size() && last == toSort[i]) {
      temp.push_back(toSort[i]);
      last = toSort[i];
      i++;
    }
    out.push_back(temp);
  }
  return out;
}

int main()
{
  vector<int> test1 {2, 1, 2, 1};
  vector<int> test2 {5, 4, 5, 5, 4, 3};
  vector<int> test3 {3, 2, 1, 3, 2, 1};

  vector<vector<int>> outs[] = {advancedSort(test1), advancedSort(test2), advancedSort(test3)};

  for (vector<vector<int>> out : outs) {
    for (vector<int> v : out) {
      printVector(v);
    }
  }
  return 0;
}