#include <iostream>


using namespace std;

// replace the bits in N by M in between ith to jth bits
// INPUT: N = 10000000000  M= 10101 i =2, j=6
// OUTPUT: N = 10001010100

int clearRangeBits(int n, int i,int j){
  int lmask = (-1<<(j+1));
  
  int rmask = (1<<i) - 1; 


//   1111111111111100000000 Or
//   0000000000000000001111  gives
//   1111111111111100001111 ====mask
    
  int mask = lmask | rmask;

  int ans = n & mask;

  return ans;
}

int replaceBits(int n, int m,int i, int j){
  int n_ = clearRangeBits(n,i,j);
  int ans = n_ | (m<<i);
  return ans;

}

int main(){
int n = 15;
int m = 2;
int i = 1;
int j = 3;

cout<< replaceBits(n,m,i,j )<< endl;
cout<< replaceBits(16, 7,1,3 )<< endl;


  return 0;

}