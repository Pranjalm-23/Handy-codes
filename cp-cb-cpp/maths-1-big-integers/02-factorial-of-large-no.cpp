#include <iostream>

using namespace std;

void multiply(int *a, int &n, int no){
  int carry = 0;
  for (int i = 0; i < n; i++)
  {
    int product = a[i] * no + carry; // no can be read from left in the array
    a[i]  = product % 10;
    carry = product / 10;
  }
  
while(carry){
  a[n] = carry % 10;
  carry = carry/10;
    n++;
}
return;
}

void big_factorial(int number){
  int *a = new int[1000];
  for (int  i = 0; i < 1000; i++)
  {
    a[i] =0;
  }
  a[0] = 1;
  int n = 1;  // no of digits currently in array
  for (int i = 2; i <= number; i++)
  {
    multiply(a,n,i);
  }
  

  //print 
  for (int i = n-1; i >= 0; i--)
  {
    cout<< a[i];
  }
  return;
  

  
}

int main(){

int n;
cin>>n;
big_factorial(n);

  return 0;

}