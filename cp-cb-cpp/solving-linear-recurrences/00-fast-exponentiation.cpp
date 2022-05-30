#include <iostream>

// faster way to compute a^n
using namespace std;

int pow(int a,int n){
  if(n==0){
    return 1;
  }
  //checkif n is odd
  int subProb = pow(a,n/2);
  
  if(n & 1){
    return a * subProb *subProb;
  }
  return subProb* subProb;
}

int main(){

int a, n;
cin>>a>>n;
cout<< pow(a,n);


  return 0;

}