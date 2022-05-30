#include <iostream>


using namespace std;

int main(){
  float x =1.0;
  // x == prob of 2 people have same birthday

  int people =0 ;
  float num = 365;
  float denom = 365;
  float p;
  cin >> p;  // req prob

  if(p==1){
    cout << 366 <<endl;
  }

  while(x > (1-p)){
    // x is less than threshold
    x = x* (num)/denom;
    num--;
    people++;

    cout << "People " << people << " and x "<< x << endl;
  }






  return 0;

}