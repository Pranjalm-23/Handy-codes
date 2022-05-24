#include <iostream>
#include <string>

using namespace std;

int main(){
  sting s0;
  string s1("Hello");

  string s2 = "Hello world";
  string s3(s2);

  string s4 = s3;

  char a[] = {'a''b','c','d'};

  cout<< s0.empty<<endl; // returns boolean

  s0.append("I love you");
  s0 += "PK";

 
  cout<< s0.length()<< endl;
  s0.clear();
  cout<< s0.length()<< endl;

  s0 = "Apple";
  cout<< s0.compare(s1); // lexiographic comparison, 0, >0,<0,equal, --based on dictionary (lexi)

  // overloaded operator--based on dictionary (lexi)

  if(s1 > s0){}

  cout << s0[0];

  // find substring
  string s = "I want to have tea or coffee.";
  int idx = s.find("tea");


  // remove a word
  string word = "tea"
  int len = word.length();

  cout<<s<<endl;

  s.erase(idx, len+1);
  cout<<s<<endl;

  // iterate over all characters

  for (int i = 0; i< s1.length();i++){
    cout<<s1[i]<<":";
  }

  //Iterators--pointers [string:: iterator == auto ]
  for(auto it = s1.begin(); it = s1.end(); it++){
    cout<< (*it) << ",";
  }

  for(auto c:s1){
    cout<< c<< ",";
  }


  return 0;

}

// refer cplusplus.com