#include <iostream>
#include <cstring>

// finding subsequences/ subsets of given string
// input: abc  
// output: " ", a,b,c,ab,bc,ac,abc

using namespace std;

void filterChars(int n, char a[]){
  int j=0;
  while(n>0){
    int last_b = (n&1);
    if(last_b==1){
      cout<<a[j];
    }
    j++;
    n = n>>1;
  }
  cout<<endl;
}

void printSubsets(char a[]){
  int n = strlen(a);

  for (int i = 0; i < (1<<n); i++) // 1<<n = 2^n
  {
    filterChars(i,a);
  }
  return;

}

int main(){

char a[100];
cin>>a;

printSubsets(a);






  return 0;

}