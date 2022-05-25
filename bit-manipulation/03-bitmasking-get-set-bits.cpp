#include <iostream>


using namespace std;

bool isOdd(int n){
  // to check odd or even : do and with 1

  return n&1;
}

int getBit(int n, int i){
// find ith bit from right--xor with 1 at ith position
  int mask = (1<<i);
  int bit = (n&mask) > 0 ? 1 : 0;


  return bit;
}

int setBit(int &n, int i){
  // or with the mask will result in the value
  int mask = (1<<i);
  int ans = n| mask;

  return ans;
}

int clearBit(int &n, int i){
  int mask = ~(1<<i);
  int ans = n& mask;

  return ans;
}

int updateBit(int &n, int i, int v){
  // clearbit
  int mask = ~(1<<i);
  int ans = n& mask;

  // setbit
  mask = (v<<i);
  ans = ans| mask;

  return ans;
}

int main(){

int m = 5;
int n = 10;
int o = 14;

cout << isOdd(m)<< endl;   //1

cout << getBit(5, 2)<< endl;  // 1

cout << setBit(n, 2)<< endl;  //14

cout << clearBit(o, 2)<< endl;  //10

cout << updateBit(m, 4,1)<< endl;  //21




  return 0;

}