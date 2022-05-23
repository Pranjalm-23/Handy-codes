//**********************hasNext() function************************
public boolean hasNext()
{
  if (nval == null)
  {
    return false;

  } else
  {
    return false;
  }
}

//**********************next() function************************
public Integer next() {
  Integer fr = nval;
  // moves nval forward, if not possible sets it to null
  nval = null;
  while (st.size() > 0) {
    Pair top = st.peek();
    if (top.state == -1) {
      nval = top.node.data;
      top.state++;
      break;
    }
    else if (top.state >= 0 && top.state < top.node.children.size()) {
      Pair cp = new Pair(top.node.children.get(top.state), -1);
      st.push(cp);
      top.state++;

    }
    else {
      st.pop();
    }
  }
  return fr;
}
}

//**********************CLASS PAIR************************
private static class Pair {
  Node node;
  int state;
  Pair(Node node, int state) {
    this.node = node;
    this.state = state;
  }
}