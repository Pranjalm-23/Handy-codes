#include <iostream>
using namespace std;

enum shape
{
  circle,
  rectangle,
  triangle
};

int main()
{
  cout << "Enter shape code:";
  int code;
  cin >> code;
  while(code >= circle && code <= triangle)
  {
    switch(code)
    {
      case circle:
      cout << "Circle";
      break;
      case rectangle:
      cout << "Rectangle";
      break;
      case triangle:
      cout << "Triangle";
      break;
    }
    cout << "Enter shape code:";
    cin >> code;
  }
  cout << "BYE \n";
  return 0;
}