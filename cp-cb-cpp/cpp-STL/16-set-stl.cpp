#include <iostream>
#include <set>


using namespace std;

int main(){
// by default ordered
// unique elements
// most operation logn
//update not allowed

int arr[] = {10,20,3,0,45,8,11,10};

int n = sizeof(arr)/sizeof(int);

set<int> s;

for(int i=0; i<n; i++){
  s.insert(arr[i]);
}

//erase
s.erase(10);
auto it = s.find(11);
s.erase(it);

//print all elements
for(set<int>::iterator it = s.begin(); it != s.end(); it++){
  cout<<(*it)<<",";
}





set<int>s1;
	pair<set<int>::iterator, bool> ret;
	s1.insert(1);
	s1.insert(5);
	s1.insert(10);
	s1.insert(3);
	ret = s1.insert(1);
	cout<<ret.second<<endl;



  return 0;

}

//lowerbound for values not present in set gives iterator to size of set