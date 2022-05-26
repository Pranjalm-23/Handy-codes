#include <iostream>


using namespace std;

int decimalToBinary(int n){
  int p=1; int ans = 0;

  while(n>0){
    int last_bit = (n&1);
    ans += p*last_bit;
    p = p*10;
    n = n>>1;
    }

return ans;

}

int main(){
// any integer is by default stored in binary format in memory


  int n;
  cin>>n;
  cout<< decimalToBinary(21)<<endl; // 10101
  cout<< decimalToBinary(n)<< endl;  // 101 for n = 5



  return 0;

}