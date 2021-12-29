#include <bits/stdc++.h>

using namespace std;

void plusMinus(vector<int> arr) {
    float zero=0, pos=0, neg=0;

    for (int i=0; i<arr.size(); i++){
        if (arr[i] >0) pos++;
        else if (arr[i] < 0) neg++;
        else zero++;
    }

    int den = arr.size();
    cout << setprecision(6) << fixed;
    cout << pos/den << "\n" << neg/den << "\n" << zero/den;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n;
    cin >> n;
    vector <int> arr(n);
    for (int i=0; i<n; i++)
        cin >> arr[i];

    plusMinus(arr);

}