class Main {
  public static void main(String[] args) {
   Tree tree1= new Tree();
   Tree tree2=new Tree();
   tree2.setTreeName("maple");
   tree2.setTreeType("broadleaf");
   tree2.setTreeFall(true);
   tree2.setLeafColor("Red");

  
  tree1.print();
  tree2.print();

  tree1.setTreeName("spruce");
  tree1.setTreeType("conifer");
  tree1.print();
}
}