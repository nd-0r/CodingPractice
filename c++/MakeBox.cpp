# include <iostream>
# include <string>
# include <vector>
using namespace std;

vector<string> makeBox(int n)
{
	vector<string> out;
	for (int i = 0; i < n; i++) {
		string row = "";
		for (int j = 0; j < n; j++) {
			if (j == 0 || j == (n - 1) || i == 0 || i == (n - 1)) {
				row = row + "#";
			} else {
				row = row + " ";
			}
		}
		out.push_back(row);
	}
	return out;
}

int main()
{
	int n;
	do {
		cout << "Enter the integer size of a box in characters: ";
		cin >> n;
	} while (!(n > 0));
	vector<string> box = makeBox(n);
	for (string str : box) {
		cout << str << '\n';
	}
	return 0;
}
