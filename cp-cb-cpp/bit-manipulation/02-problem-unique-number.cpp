#include <iostream>


using namespace std;


// total 2n + 1 numbers
// except one number all others occur twice 
// find the unique no.

int main(){
// fact xor of same no.s is 0

int n;
cin>>n;

int no;
int ans = 0;

for(int i =0 ; i<n; i++){
  cin >> no;
  ans = ans ^ no;
}

// no extra storage needed

cout<< ans;






  return 0;

}