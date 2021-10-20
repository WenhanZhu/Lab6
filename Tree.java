class Tree {
private String treeName;
private String treeType;
private boolean treeFall;
private String leafColor;

Tree(){
  treeName="";
  treeType="";
  treeFall=false;
  leafColor="";
}

Tree(String aTreeName, String aTreeType, boolean aTreeFall, String aLeafColor){
 treeName=aTreeName;
 treeType=aTreeType;
 treeFall=aTreeFall;
 leafColor=aLeafColor;
}

String getTreeName(){
  return treeName;
}

String getTreeType(){
  return treeType;
}

boolean getTreeFall(){
  return treeFall;
}

String getLeafColor(){
  return leafColor;
}

void setTreeName (String TheTreeName){
  treeName=TheTreeName;
}

void setTreeType(String TheTreeType){
  treeType=TheTreeType;
}

void setTreeFall (boolean TheTreeFall){
  treeFall=TheTreeFall;
}

void setLeafColor(String TheLeafColor){
  leafColor=TheLeafColor;
}

void print() {
  String treeFall1;
  if (treeFall=false){

  treeFall1= "does not";}

  else 
   {treeFall1="does";}
  
 System.out.println( "This is a " +  treeName+" tree. It is a " +treeType + " and its leaves are currently " + leafColor + ". It " + treeFall1+ " lose its leaves for the winter.");}
}