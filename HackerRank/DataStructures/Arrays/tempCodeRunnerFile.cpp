#include <bits/stdc++.h>

using namespace std;

int hourglassSum(vector<vector<int>> arr) {
    int max=-100000, sum=-10000;
    for (int i=0; i<=3; i++) {
        for (int j=0; j<=3; j++) {
            sum += arr[i][j] + arr[i][j+1] + arr[i][j+2];
            sum += arr[i+1][j+1];
            sum += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
            
            if (sum > max)
                max = sum;
            sum = 0;
        }
    }
    return max;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    vector<vector<int>> arr(6);

    for (int i=0; i<6; i++){
        arr[i].resize(6);
        for(int j=0; j<6; j++) {
            cin >> arr[i][j];
        }
    }

    int result = hourglassSum(arr);

    cout << result << '\n';
}