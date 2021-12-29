#include <bits/stdc++.h>

using namespace std;

vector<int> compareTriplets(vector<int> a, vector<int> b) {
    vector<int> comp(2);
    comp[0] = comp[1] = 0;
    for (int i=0; i<3; i++)
        if (a[i] != b[i])
            comp[a[i] < b[i] ? 1 : 0] += 1;

    return comp;
}

// O(1) good
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    vector<int> alice(3), bob(3);
    for (int i=0; i<3; i++) 
        cin >> alice[i];
    for (int i=0; i<3; i++)
        cin >> bob[i];

    vector<int> comp = compareTriplets(alice, bob);

    for (int i=0; i<2; i++)
        cout << comp[i] << " ";
}