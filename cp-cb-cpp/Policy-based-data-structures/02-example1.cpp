#include <ext/pb_ds/assoc_container.hpp> 
#include <ext/pb_ds/tree_policy.hpp>
#include <bits/stdc++.h>

using namespace __gnu_pbds;
using namespace std;

typedef tree<int, null_type, less<int>, rb_tree_tag,
             tree_order_statistics_node_update> PBDS;
 

int main()
{

  PBDS s;
  s.insert(10);
  s.insert(15);
  s.insert(1);
  s.insert(3);
  s.insert(4);
  s.insert(1);
  
  // kth largest element till now (logn)
  for(int i=0; i<s.size(); i++){
    cout<< i << "---"<<(*s.find_by_order(i))<<endl;
  }
   
  cout<< s.order_of_key(5)<<"\n"; // no. of elements smaller than 5
 
    return 0;
}