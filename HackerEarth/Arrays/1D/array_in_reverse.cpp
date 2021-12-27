#include <iostream>

using namespace std;

int main() {
	int num;
	cin >> num;

    int arr[num];
    for (int idx=0; idx<num; idx++) 
        cin >> arr[idx];
    for (int idx=num-1; idx>=0; idx--)
        cout << arr[idx] << "\n";
}