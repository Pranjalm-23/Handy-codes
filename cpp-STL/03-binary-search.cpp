#include <algorithm>
#include <iostream>

using namespace std;

int main(){
  int arr[] = {10,52,52,52,87,136,245};
  int n = sizeof(arr)/sizeof(int);


// search in sorted array
  int key = 52;
  cin>>key;

bool present = binary_search(arr, arr+n, key);

// lower_bound ---add of first occurance >= key

auto it = lower_bound(arr, arr+n,key);
cout<<(it-arr)<<endl;

// upper_bound ---add of first occurance > key
auto it = upper_bound(arr, arr+n,key);
cout<<(it-arr)<<endl;

// occ freq = ub-lb

  return 0;
}