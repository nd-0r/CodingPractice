# include <iostream>
using namespace std;

void printArr(int * arr, const int size)
{
  cout << '{';
  for (int i = 0; i < size - 1; i++) {
    cout << arr[i] << ", ";
  }
  cout << arr[size - 1] << "}\n";
}

int partition(int * arr, const int size)
{
  int partition = arr[0];
  int boundary = 1;
  for (int i = 1; i < size; i++) {
    if (arr[i] < partition) {
      int temp = arr[boundary];
      arr[boundary] = arr[i];
      arr[i] = temp;
      ++boundary;
    }
  }
  arr[0] = arr[boundary - 1];
  arr[boundary - 1] = partition;
  return boundary - 1;
}

void quickSort(int * arr, const int start, const int end)
{
  if (start == end) return;
  int partIndex = partition(arr + start, end - start);
  quickSort(arr, start, start + partIndex);
  quickSort(arr, start + partIndex + 1, end);
}