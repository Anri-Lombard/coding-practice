#include <bits/stdc++.h>

#define Inc(a, b) for (int i=a; i<b; i++)
#define Dec(a, b) for (int i=b-1; i>-1; i--)
#define vi vector<int>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    string prevFormat, newFormat;

    cin >> prevFormat;

    string hour = prevFormat.substr(0, prevFormat.find(":"));
    string min = prevFormat.substr(prevFormat.find(":")+1, prevFormat.find(":"));
    string sec = prevFormat.substr(prevFormat.find(min)+3, 2);
    string TIME = prevFormat.substr(prevFormat.length()-2, prevFormat.length());

    if (TIME == "PM")
        hour = (stol(hour) + 12) < 24 ? to_string(stol(hour)+12) : "12";
    else
        hour = hour == "12" ? "00" : hour;
    
    newFormat = hour + ":" + min + ":" + sec;

    // cout << hour << " " << min << " " << sec << " " << TIME << "\n";
    
    cout << newFormat << "\n";
}