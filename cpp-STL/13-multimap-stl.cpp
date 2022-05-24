#include <iostream>
#include <map>

using namespace std;

int main(){
  // possible duplication of same key
  multimap<char,string> m;
  int n;
  cin>>n;

  for(int i=0;i<n,i++){
    char c;
    string s;
    cin>>c>>s;
    m.insert(make_pair(ch,s));
  }

  auto it = m.begin();

  m.erase(it);

  auto it2 = m.lower_bound("b"); //>=b
  auto it3 = m.upper_bound("d"); //>d

  for(auto it4=it2;it4!=it3;it4++){
    cout<<it4->first<<" -> "<<it4->second<<endl;
  }

  //search

  auto f = m.find("c");
  if(f->second=="cat"){
    m.erase(f);
  }

  //printing the map
  for(auto p:m){
    cout<<p.first<<" -> "<<p.second<<endl;
  }



  // insert,find,erase: logn complexity

  return 0;

}