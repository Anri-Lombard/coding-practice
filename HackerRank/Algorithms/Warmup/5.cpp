#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n;
    cin >> n;
    int mat[n][n];

    for (int i=0; i<n; i++) 
        for (int j=0; j<n; j++)
            cin >> mat[i][j];

    int sum1=0, sum2=0;

    for (int i=0; i<n; i++)
        sum1 += mat[i][i];
    for (int i=n-1; i>-1; i--)
        sum2 += mat[n-i-1][i];

    cout << abs(sum1 - sum2)<< "\n";

}