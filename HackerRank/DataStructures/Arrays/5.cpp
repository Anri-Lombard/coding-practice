#include <bits/stdc++.h>

using namespace std;

vector<int> matchingStrings(vector<string> strings, vector<string> queries) {
    vector<int> matches(queries.size());
    
    for (int i=0; i<queries.size(); i++)
        matches[i] = 0;
    
    // Olog(n^2) horrible
    for (int q=0; q<queries.size(); q++) {
        for (int s=0; s<strings.size(); s++) {
            if (queries[q].find(strings[s]) != string::npos)
                matches[q] += 1;
        }
    }
    return matches;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int s_size;
    cin >> s_size;
    vector<string> strings(s_size);
    for (int i=0; i<s_size; i++)
        cin >> strings[i];

    int q_size;
    cin >> q_size;
    vector<string> queries(q_size);
    for (int i=0; i<q_size; i++)
        cin >> queries[i];

    vector<int> result = matchingStrings(strings, queries);

    for (int i=0; i<result.size(); i++)
        cout << result[i] << '\n';
}