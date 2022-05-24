#include <iostream>
#include <vector>

using namespace std;

int main(){
 // vector : dynamic array-grow and shrink in size

 vector<int> a;
 vector<int> b(5,10); // 5 int with value 10
 vector<int> c(b.begin(),b.end());
 vector<int> d{1,2,3,4,5};

// iterate over a vector
  for(int i = 0; i < c.size(); i++){
    cout << c[i] << ",";
  }

  cout <<endl;

// vector<int>::iterator
  for(auto it = b.begin(); it != b.end();it++){
    cout << (*it) << endl;
  }

  for(int x:d){
    cout<<x<<",";
  }

  vector<int> v;
  int n;
  cin >> n;
  for(int i = 0; i < n; i++){
    int no;
    cin >> no;
    v.push_back(no);  //add at end of vector mostly O(1)
  }

  cout<< v.size()<<endl;
  cout<< v.capacity()<<endl; //size of underlying array
  cout<< v.max_size()<<endl; //max no of elements a vector can have

  d.pop_back(); //removes last eement O(1)

  d.insert(d.begin() + 3,100); // insert in the middle--here at idx 3

  d.insert(d.begin() + 3,4,100); // 4occurances of 100s

  d.erase(d.begin()+2); //erase at index 2
  d.erase(d.begin()+2, d.begin()+5);//erase 3 indices from 2

  // we avoid shrink
  d.resize(18);  // if the size is increasing then more memory will be allocated
  // size changes but capacity remains the same

  d.clear();   //removes all elements from vec,but not the memory occupied by aray


  if(d.empty()){} //returns boolean

  cout<<d.front()<<endl; //first element
  cout<<d.back()<<endl; //last element

  //reserve: for making capacity same efficient

  vector<int> arr;
  arr.reserve(1000);


  return 0;

}