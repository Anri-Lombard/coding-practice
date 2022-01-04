#include <bits/stdc++.h>

#define Inc(a, b) for (int i=a; i<b; i++)
#define Dec(a, b) for (int i=b-1; i>-1; i--)
#define vi vector<int>
#define vl vector<long>

using namespace std;

int iscapital(char x)
{
       if (x >='A' && x <= 'Z')    return 1;
       else  return 0;
}

// TODO: finish
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    string input, output;

    getline(cin, input);

    input.erase(remove(input.begin(), input.end(), '\r'), input.end() );
    input.erase(remove(input.begin(), input.end(), '\t'), input.end() );
    input.erase(remove(input.begin(), input.end(), '\n'), input.end() );

    string method = "M", variable = "V", clas = "C";

    // Split = undercase words
    // Combine = camel case string

    string operation = input.substr(0, 1);
    string type = input.substr(input.find(operation)+2, 1);
    string toChange = input.substr(input.find(type) + 2, input.length());

    if (operation == "S") {
        if (type == "M") {
            output = tolower(input.substr(0, input.find(iscapital(a))))
        }
    }


    output = "The Result";
    output.erase(remove(output.begin(), output.end(), '\r'), output.end() ); 
    output.erase(remove(output.begin(), output.end(), '\t'), output.end() ); 
    output.erase(remove(output.begin(), output.end(), '\n'), output.end() );

    cout << operation << "\n";
    cout << type << "\n";
    cout << toChange << "\n";
}