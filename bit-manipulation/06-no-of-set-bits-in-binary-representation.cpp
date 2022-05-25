#include <iostream>


using namespace std;

// finding the number of set bits in binary reprwsentation

int countBitsM1(int n){ //method-1  O(logn) == logn + 1 bits needed
  int ans = 0;
  while(n > 0){
    ans += (n&1);
    n = n>>1;
  }
  return ans;
}

int countBitsFast(int n){ //method-2  -- removes the set bits from right  O(No of set bits)
  int ans = 0;
  while(n > 0){
    n = n & (n-1);
    ans++;
  }
  return ans;
}

int main(){


cout << countBitsM1(16) << endl;

cout << countBitsFast(21) << endl;

cout << __builtin_popcount(3) << endl; // method-3



  return 0;

}