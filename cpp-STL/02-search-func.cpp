#include <algorithm>
#include <iostream>

using namespace std;

int main(){
  int arr[] = {10,52,87,36,45};
  int n = sizeof(arr)/sizeof(int);


// search ----find()
  int key = 52;
  cin>>key;

  auto it  = find(arr, arr+n, key);
  int index = it - arr;
  cout<<index<<endl;


  return 0;

}