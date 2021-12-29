#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n, grade;
    cin >> n;

    for (int i=0; i<n; i++){
        cin >> grade;
        cout << (grade < 38 || grade % 5 < 3 ? grade : grade + (5 - (grade % 5))) << "\n";
    }
}