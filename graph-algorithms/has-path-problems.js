// df
const hasPath = (graph, src, dst) => {
  if(src === dst) return true;

  for(let neighbour of graph[src]){
    if(hasPath(graph, neighbour, dst) === true){
      return true;
    }
  }
  return false;
};

// bf
const hasPath2 = (graph, src, dst) => {
  const queue = [src];

  while(queue.length > 0) {
    const current = queue.shift();

    if(current == dst) return true;

    for(let neighbor of graph[current]){
      queue.push(neighbor);
    }

  }
  return false;
}