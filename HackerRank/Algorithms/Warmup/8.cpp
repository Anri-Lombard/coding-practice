#include <bits/stdc++.h>

using namespace std;

// O(1) good
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    vector<int> arr(5);
    for (int i=0; i<5; i++) cin >> arr[i];

    long long maxNum=numeric_limits<long long>::min(), minNum=numeric_limits<long long>::max(), allNum=0;
    for (long long elem: arr) allNum += elem;

    for (int i=0; i<5; i++){
        long long current = allNum - arr[i];
        maxNum = max(current, maxNum);
        minNum = min(current, minNum);
    }

    cout << minNum << " " << maxNum << "\n";
}