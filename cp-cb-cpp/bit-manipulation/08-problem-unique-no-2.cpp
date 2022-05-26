#include <iostream>

// find the two unique no.s which are not repeated
using namespace std;

int main(){
int n;
int a[100005];
cin>>n;

int no;
int xr = 0;

for (int i = 0; i < n; i++)
{
  cin>>no;
  a[i] = no;
  xr = xr^no;
}
// xr = a^b

int temp = xr;
// find position of first set bit in xr
int pos = 0;

while((temp&1)!=1){
  pos++;
  temp = temp>>1;
}

// first set bit is at pos
int mask = (1<<pos);

// find no.s containing set bit at pos
int x = 0;
int y = 0;

for (int i = 0; i < n; i++)
{
  if((a[i]&mask) > 0){
    x = x^a[i];
  }
}

y = xr^x;

cout<< min(x,y) <<" "<< max(x,y) <<endl;






  return 0;

}