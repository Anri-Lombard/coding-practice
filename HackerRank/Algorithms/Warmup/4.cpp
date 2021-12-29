#include <bits/stdc++.h>

using namespace std;

long aVeryBigSum(vector<long> ar) {
    long bSum = 0;
    for (long elem: ar)
        bSum += elem;
    return bSum;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n;
    cin >> n;
    vector<long> vec(n);
    for (int i=0; i<n; i++)
        cin >> vec[i];

    long bSum = aVeryBigSum(vec);

    cout << bSum << '\n';
}