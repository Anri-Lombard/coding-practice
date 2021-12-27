#include <bits/stdc++.h>

using namespace std;

vector<int> rotateLeft(int d, vector<int> arr) {
    vector<int> arr_left;
        
    for (int i=d;i<arr.size(); i++)
        arr_left.push_back(arr[i]);
    
    for (int i=0;i<d;i++)
        arr_left.push_back(arr[i]);
        
    return arr_left;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n, d;
    cin >> n >> d;

    vector<int> arr(n), left;

    for (int i=0; i<n; i++)
        cin >> arr[i];
    
    left = rotateLeft(d, arr);

    for (int i=0; i<n; i++)
        cout << left[i] << " ";
}