public static void traversals(Node node) {

  //Euler's Left/ Node Pre/ Into the recursion
  System.out.println("Node Pre " + node.data);


  for (Node child : node.children)
  {
    //Edge Pre
    System.out.println("Edge Pre " + node.data + "--" + child.data);
    traversals(child);
    System.out.println("Edge Post " + node.data + "--" + child.data);
    //Edge Post
  }
  System.out.println("Node Post " + node.data);
  //Euler's right/Node Post/on the way out of recursion


}