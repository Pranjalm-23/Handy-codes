#include <iostream>
#include <map>
#include <string>


using namespace std;

int main(){
  // map maintains self balancing BST, 
  // ordered map: keys are ordered // insert,find,erase: logn complexity

  map<string,int> m;

  // insertion
  m.insert(make_pair("Mango", 100));

  pair<string, int> p;
  p.first = "Apple";
  p.second = 120;

  m.insert(p);

  m["banana"] = 20;

  // search
  string fruit;
  cin>> fruit;

  auto it = m.find(fruit);  //returns iterator map<string,int>::iterator
  if(it != m.end()){
    cout<<"price of "<<fruit<<" is"<<m["fruit"]<<endl;
  }else{
    cout<<"not present"<<endl;
  }

  //keys are unique
  // insert,find,erase: logn complexity

  if(m.count(fruit)){   // returns integer
    cout<<"Price is "<< m[fruit] << endl;
  }


  // erase
  m.erase(fruit);

  // update

  m["fruit"] = 10000; //new value

  // iterate over all pairs
  for(auto it = m.begin(); it != m.end(); it++){
    cout<< it->first <<" and " << it->second<<endl;
  }

  for(auto p: m){
    cout<< p.first <<" and " << p.second<<endl;
  }

  return 0;

}