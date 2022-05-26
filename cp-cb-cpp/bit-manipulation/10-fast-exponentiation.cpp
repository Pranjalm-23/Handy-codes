#include <iostream>


using namespace std;

int power_optimised(int a, int n){

  // bitwise analysis of power is done
  int ans = 1;
  while(n>0){
    int last_b = (n & 1);
    // based on the bit the multiplication is done as per placevalue
    if(last_b){
      ans = ans * a;
    }
    a = a*a;
    n = n>>1;
  }

  return ans;
}

int main(){
int a, n;

cin >> a >> n;

cout << power_optimised(a, n);






  return 0;

} 