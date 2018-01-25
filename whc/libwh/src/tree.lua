function createTree()
  local tree = {}
  return tree
end

function getLeft(tree)
  return tree[0]
end

function getRight(tree)
  return tree[1]
end

function addLeft(tree)
  local left = {}
  tree[0] = left
  
  return tree
end

function addLeftWithValue(tree,fils)
  tree[0] = fils
  
  return tree
end

function addRight(tree)
  local right = {}
  tree[1] = right
    
  return tree
end

function addRightWithValue(tree,fils)
  tree[1] = fils
  
  return tree
end

function toNumber(tree)
  if (tree == nil) then
    return 0
  else
    return 1 + toNumber(getRight(tree)) 
  end
end
 
function addTwo(tree)
  left, right = {}
  tree[0], tree[1] = left, right
 end
 
local tree = createTree()
addRight(tree)
print(toNumber(tree))
print(getLeft(tree))
 
 