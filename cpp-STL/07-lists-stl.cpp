#include <iostream>
#include <list>

using namespace std;

int main(){
  // list === doubly LL

  list<int> l;

  // Init
  list<int> l1{1,2,3,4,5,78,10,50};

  list<string> l2{"ram","shyam", "hanuman"};

  l2.push_back("sita"); //add at end
  l2.push_front("Shiv"); //add at first

  l2.sort();

  l2.reverse(); //reversal

  //display
  for(string s:l2){
    cout<<s<<"-->";
  }
  cout<<l1.front();
  l1.pop_front(); //removes first elemnt of list
  cout<<l1.front();

  cout<<l1.back();
  l1.pop_back();  // removes last element of list
  cout<<l1.back();

  //using iterators
  for(auto it = l2.begin(); it != l2.end(); it++){
    cout<< (*it) << "-->";
  }


  string god;
  cin>>god;
  l2.remove(god);  //removes al occurences from the list

  // erase one or more
  auto it = l1.begin();

  it++;it++;

  l1.erase(it);

  // insert at middle

  it = l2.begin();
  it++;

  l2.insert(it,"Krishna");


  return 0;

}