// simple logic
const depthFirstPrint = (graph, source) => {
  const stack = [source];
  while(stack.length > 0){
    const current = stack.pop();
    console.log(current);

    for(let neighbour of graph[current]){
      stack.push(neighbour);
    }
  }
};

// using recursion
const depthFirstPrint2 = (graph, source) => {
  console.log(source);
  for(let neighbour of graph[source]){
  depthFirstPrint2(graph, neighbour);
}
}

const graph = {
  a :['c', 'b'],
  b:['d'],
  c:['e'],
  d:['f'],
  e:[],
  f:[]
};

depthFirstPrint(graph, 'a');