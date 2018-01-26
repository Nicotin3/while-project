local treelib = {}

function treelib.createTree()
  local tree = {}
  return tree
end

function treelib.getLeft(tree)
  return tree[0]
end

function treelib.getRight(tree)
  return tree[1]
end

function treelib.addLeft(tree)
  local left = {}
  tree[0] = left
  
  return tree
end

function treelib.addLeftWithValue(tree,fils)
  tree[0] = fils
  
  return tree
end

function treelib.addRight(tree)
  local right = {}
  tree[1] = right
    
  return tree
end

function treelib.addRightWithValue(tree,fils)
  tree[1] = fils
  
  return tree
end

function treelib.toNumber(tree)
  if (tree == nil) then
    return 0
  else
    return 1 + toNumber(getRight(tree)) 
  end
end
 
function treelib.addTwo(tree)
  left, right = {}
  tree[0], tree[1] = left, right
 end
 
 