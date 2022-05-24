#include <iostream>
#include <queue>


using namespace std;

int main(){
  // underline ds:heap
  // based on maxHeap,minHeap
  // inbuilt comparator greater<int>

  priority_queue<int> pq_max;  // max priority queue
  priority_queue<int,vector<int>, greater<int>> pq;   // min priority queue

  int n;
  cin>>n;

  for(int i = 1; i < n; i++){
    int no;
    cin>>no;
    pq.push(no);  //O(logn)
  }


  while(!pq.empty(){
    cout<< pq.top()<<" ";  //O(1)
    pq.pop();  //O(logn)
  })




  return 0;

}