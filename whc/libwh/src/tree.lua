function createTree()
  tree = {}
  return tree
end

function getLeft(tree)
  return tree[0]
end

function getRight(tree)
  return tree[1]
end

function addLeft(tree)
  left = {}
  tree[0] = left
  
  return tree
end

function addLeft(tree,fils)
  tree[0] = fils
  
  return tree
end

function addRight(tree)
  right = {}
  tree[1] = right
  
  return tree
end

function addRight(tree,fils)
  tree[1] = fils
  
  return tree
end

function toNumber(tree)
  if (tree == nil) then
    return 0
  else
    return 1+toNumber(getLeft())
  end
end
 
function addTwo(tree)
  left, right = {}
  tree[0], tree[1] = left, right
 end
 
 tree = createTree()
 addLeft(tree)
 print(getLeft(tree))
 
 tree2 = createTree()
 addLeft(tree)
 print(getLeft(tree))