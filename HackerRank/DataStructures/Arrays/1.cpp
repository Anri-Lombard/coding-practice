#include <bits/stdc++.h>

using namespace std;

vector<int> reverseArray(vector<int> a) {
    vector<int> a_rev;
    for (int i=a.size()-1;i>=0;i--)
        a_rev.push_back(a[i]);
    return a_rev;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int arr_count;
    cin >> arr_count;
    vector<int> arr(arr_count), rev;
    for (int i=0;i<arr_count;i++)
        cin >> arr[i];

    rev = reverseArray(arr);

    for (int i=0;i<arr.size();i++)
        cout << rev[i] << " ";
}