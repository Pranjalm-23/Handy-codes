#include <ext/pb_ds/assoc_container.hpp> 
#include <ext/pb_ds/tree_policy.hpp>
#include <bits/stdc++.h>

using namespace __gnu_pbds;
using namespace std;

typedef tree<pair<int,int>, null_type, less<pair<int,int>>, rb_tree_tag,
             tree_order_statistics_node_update> PBDS;
 

int main()
{

  //input
  int notopics;

  cin>>notopics;
  int teacher_interest[notopics]; int student_interest[notopics];

  for(int i=0; i<notopics; i++){
    cin>>teacher_interest[i];  //a
  }

  for(int i=0; i<notopics; i++){
    cin>>student_interest[i];   ///b
  }

  // processing
  PBDS s;
  long long int noGoodPairs= 0; 

  // ai+aj>bi+bj ==== ai-bi>bj-aj ==== ci>-cj: ci = ai-bi

  int c[notopics];
  for(int i=0; i<notopics; i++){
    c[i] = teacher_interest[i]-student_interest[i];
  }

  for(int j = 0; j < notopics; j++){
    noGoodPairs += (s.size() - s.order_of_key({-c[j], 10000000}));
    s.insert({c[j],j});
  }

  //output
  cout<<noGoodPairs;
  
    return 0;
}