#include <iostream>
#include <cstring>

using namespace std;

int main(){
  // delimitors
  //strtok(char *s, char *delimitor)

  char s[100] = "Today is a rainy day.";
  char *ptr = strtok(s," ");
  cout<<ptr<<endl;//Today

  char *ptr = strtok(NULL," ");
  cout<<ptr<<endl;//is

// how it works in subsequent call with null string 


  return 0;
}