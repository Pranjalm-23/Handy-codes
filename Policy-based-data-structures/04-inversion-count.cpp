#include <ext/pb_ds/assoc_container.hpp> 
#include <ext/pb_ds/tree_policy.hpp>
#include <bits/stdc++.h>

using namespace __gnu_pbds;
using namespace std;

typedef tree<int, null_type, less<int>, rb_tree_tag,
             tree_order_statistics_node_update> PBDS;
 

int main()
{

  //input
  int n;

  cin>>n;
  int a[n];
  for(int i=0; i<n; i++){
    cin>>a[i];
  }

  PBDS s;

  int inversion_count= 0;
  // note inv count = s.size-order_of_key

  for(int i=0; i<n; i++){
    inversion_count+=(s.size()-s.order_of_key(a[i]));
    s.insert(a[i]);
  }

  cout<<inversion_count;
  
    return 0;
}