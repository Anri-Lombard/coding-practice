#include <bits/stdc++.h>

#define Inc(a, b) for (int i=a; i<b; i++)
#define Dec(a, b) for (int i=b-1; i>-1; i--)
#define vi vector<int>
#define vl vector<long>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n;
    cin >> n;

    vector <int> scores(n);

    Inc(0, scores.size()) 
        cin >> scores[i];
    
    int min_count=0, max_count=0, max=scores[0], min=scores[0];

    Inc(0, scores.size()) {
        if (scores[i] < min) {
            min = scores[i];
            min_count += 1;
        } else if (scores[i] > max) {
            max = scores[i];
            max_count += 1;
        }
    }

    cout << max_count << " " << min_count << "\n";
}