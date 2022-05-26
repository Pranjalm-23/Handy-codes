// PBDS - works as a set
// find_by_order(k)==O(logn--returns the iterator to the kth-largest elemnt, start from zero
// order_of_key(k)==O(logn--- returns the number of element in the set which are strictly less than our k

#include <ext/pb_ds/assoc_container.hpp> 
#include <ext/pb_ds/tree_policy.hpp>
// #include <functional> // for less
// #include <iostream>
using namespace __gnu_pbds;
using namespace std;
 
// a new data structure defined. Please refer below
// GNU link : https://goo.gl/WVDL6g
typedef tree<int, null_type, less<int>, rb_tree_tag,
             tree_order_statistics_node_update>
    ordered_set;
 

int main()
{
   
 
    return 0;
}