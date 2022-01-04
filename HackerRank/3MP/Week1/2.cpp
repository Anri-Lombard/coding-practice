#include <bits/stdc++.h>

#define Inc(a, b) for (int i=a; i<b; i++)
#define Dec(a, b) for (int i=b-1; i>-1; i--)
#define vi vector<int>
#define vl vector<long>

using namespace std;

string minMax(vl arr) {
    long arrSum=0;
    long minNr=numeric_limits<int>::max(), maxNr=numeric_limits<int>::min();

    for (long ele: arr) {
        minNr = min(ele, minNr);
        maxNr = max(ele, maxNr);
        arrSum += ele;
    }

    return to_string(arrSum-maxNr) + " " + to_string(arrSum-minNr);
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n=5;

    vl arr(n);

    for (int i =0 ; i<n; i++)
        cin >> arr[i];

    cout << minMax(arr) << '\n';
}