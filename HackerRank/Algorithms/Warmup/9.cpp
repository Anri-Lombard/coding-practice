#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n;
    long long maxNr=numeric_limits<long long>::min(), nrMax=0;
    cin >> n;
    vector<long long> candles(n);

    for (int i=0; i<n; i++) {
        cin >> candles[i];
        maxNr = max(candles[i], maxNr);
    }
    for (int i=0; i<n; i++) {
        if (candles[i] == maxNr) nrMax++;
    }

    cout << nrMax << "\n";
}