#include <bits/stdc++.h>

#define Inc(a, b) for (int i=a; i<b; i++)
#define Dec(a, b) for (int i=b-1; i>-1; i--)
#define vi vector<int>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int a=0, v, n, idx=-1;
    cin >> v >> n;
    vi arr(n);

    Inc(a, n) 
        cin >> arr[i];

    Inc(a, n) {
        idx++;
        if (arr[i] == v) cout << idx << '\n';
    }
}