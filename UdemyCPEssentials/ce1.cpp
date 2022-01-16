#include<bits/stdc++.h>
using namespace std;

int firstUniqChar(string s) {
    int freq[26]={0};
    int n=s.size();

    for(int i=0;i<n;i++){
        freq[s[i]-97]++;
    }
    
    for(int i=0;i<n;i++){
        if(freq[s[i]-97]==1){
            return i;
        }
    }
    return -1;
}