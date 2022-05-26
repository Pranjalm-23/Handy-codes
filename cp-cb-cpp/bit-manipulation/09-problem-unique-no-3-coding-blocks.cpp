#include <iostream>

// find the unique no. which occurs 
// only once and all others occurs thrice
using namespace std;

int main(){

int n;
cin>>n;

// adding all the bits bit by bit and take mod by 3
// will cancel the contribution which comes three times

int count_bbb[64]={0};
int no;

for (int i = 0; i < n; i++)
{

  cin>>no;
  //update the counts by extracting bits
  int j = 0;
  while(no > 0){
    int last_b = (no & 1);
    count_bbb[j] += last_b;
    j++;
    no = no>>1;
  }
}

  // iterate over the array 
  // mod by 3
  // then get place value to get the whole no.
  int p=1;
  int ans=0;
  for (int i = 0; i<64; i++)
  {
    count_bbb[i] %= 3;
    ans += (count_bbb[i]*p);
    p = p<<1;

  }

  cout << ans<<endl;
  










  return 0;
}