#include <iostream>
#include <cstring>
#include <unordered_map>

using namespace std;

class Student{
  public:
  string firstname;
  string lastname;
  string rollno;

  Student(string f, string l, string no){
    firstname = f;
    lastname = l;
    rollno = no;
  }

  //operator definition: how two students are equal
  bool operator==(const Student &s) const{
    return rollno == s.rollno;
  }
};

class HashFn{
  public:
  size_t operator()(const Student &s) const{
    return s.firstname.length() + s.lastname.length(); 
  }
}

int main(){

unordered_map<Student,int,HashFn> student_map;

Student("Pranjal","Mishra",21);
Student("Prasoon","Mishra",17);
Student("Palak","Mishra",21);
Student("Pranjal","Mishra",40);

cout<<student_map[s3]<<endl;

// add student
student_map[s1] = 100;
student_map[s2] = 120;
student_map[s3] = 11;
student_map[s4] = 45;

// iterate over all
for(auto s:student_map){
  cout<<s.first.firstname<< " "<<s.first.rollno<< "Marks"<<s.second<<endl;
}




  return 0;

}