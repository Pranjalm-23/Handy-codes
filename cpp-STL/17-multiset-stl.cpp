#include <iostream>
#include <set>

typedef multiset<int>::iterator mit;
using namespace std;

int main(){
// can store multiple same values in set
// stored in specific sort according to internal comparison object
// values cantbe modified
// associative container
// underline is BST

int arr[] = {10,20,30,20,20,10,4,58,65};

int n = sizeof(arr)/sizeof(int);

multiset<int> m(arr,arr+6);

// erase
m.erase(20);

//insert
m.insert(80);

// iterate
for(int x:m){
  cout<<x<<",";
}

// count
cout<< "Count "<<m.count(10);


// find
auto it = m.find(30);
cout<<(*it)<<endl;

// get all e equal to 20
pair<mit,mit> range = m.equal_range(20); // return it-begin to it-end

for(auto it = range.first; it!=range.second; it++){
  cout<<(*it)<<" , "<<endl;
}

// Lower and Upper bound
for(auto it = m.lower_bound(10); it != m.upper_bound(77);it++){
  cout<<(*it)<<" . ";
}







  return 0;

}