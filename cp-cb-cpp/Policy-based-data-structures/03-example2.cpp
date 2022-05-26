#include <ext/pb_ds/assoc_container.hpp> 
#include <ext/pb_ds/tree_policy.hpp>
#include <bits/stdc++.h>

using namespace __gnu_pbds;
using namespace std;

typedef tree<pair<int,int>, null_type, less<pair<int,int>>, rb_tree_tag,
             tree_order_statistics_node_update> PBDS;
 

int main()
{

  PBDS s;
  // (value, index)
  s.insert({15,0});
  s.insert({3,1});
  s.insert({10,2});
  s.insert({4,3});
  s.insert({1,4});
  s.insert({1,5});
  s.insert({4,3});
  
  // kth largest element till now (logn)
  for(int i=0; i<s.size(); i++){
    cout<< i << "---"<<s.find_by_order(i)->first<<" "<<s.find_by_order(i)->second<<endl;
  }
   
  cout<< s.order_of_key({4,3})<<"\n"; // no. of elements smaller than 5
 
    return 0;
}