#include <iostream>
using namespace std;

int main() {
  int t; // no. of testcases
  cin>>t;

  while(t--){
    string s;
    cin>>s;

    int n = s.length();
    int left = 0, right = n-1; // indices of array-starting from the ends`

    while(left < right){
      swap(s[left], s[right]);
      left++;
      right--;
    }
    cout<<s<<"\n";
  }

  return 0;
}