#include <bits/stdc++.h>

#define Inc(a, b) for (int i=a; i<b; i++)
#define Dec(a, b) for (int i=b-1; i>-1; i--)
#define vi vector<int>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n;
    cin >> n;

    // O(n)
    int neg=0, neu=0, pos=0;
    vector<int> arr(n);

    for (int i=0; i<n; i++)
        cin >> arr[i];
    
    for (int i=0; i<n; i++) {
        if (arr[i] < 0)
            neg += 1;
        else if (arr[i] > 0)
            pos += 1;
        else
            neu += 1
    }

    cout << setprecision(6) << "\n";
    cout << pos

}