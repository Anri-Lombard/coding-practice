#include <bits/stdc++.h>

using namespace std;

int simpleArraySum(vector<int> ar) {
    int arrSum = 0;

    for (int a: ar)
        arrSum += a;
    
    return arrSum;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n;
    cin >> n;

    vector<int> vec(n);
    for (int i=0; i<n; i++)
        cin >> vec[i];

    cout << simpleArraySum(vec) << '\n';
    return 0;
}