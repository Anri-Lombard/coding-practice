#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n, sc=1;
    cin >> n;

    for (int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            cout << (j>=n-sc ? "#" : " ");
        }
        sc++;
        cout << "\n";
    }
}