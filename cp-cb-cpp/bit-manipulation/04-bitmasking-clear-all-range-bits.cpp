#include <iostream>


using namespace std;

int clearLastBits(int n, int i){
  // ~0 = -1
  //start with all ones
  int mask = (-1<<i);
  int ans = n & mask;

  return ans;
}

int clearRangeBits(int n, int i,int j){
  // start with all ones
  int lmask = (-1<<(j+1)); // 1111111111111100000000

  // 0000000000001111 === 2^n - 1
  // so b = 2^i - 1
  // 2^i = 1<<i 
  
  int rmask = (1<<i) - 1; 


//   1111111111111100000000 Or
//   0000000000000000001111  gives
//   1111111111111100001111 ====mask
    
  int mask = lmask | rmask;

  int ans = n & mask;

  return ans;
}

int main(){

int m = 50;

cout << clearLastBits(21, 2)<< endl; // 20

cout << clearRangeBits(m,2,5 )<< endl; // 2



  return 0;

}