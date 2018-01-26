local treelib = {} -- creation du module

local function createTree()
  local tree = {}
  return tree
end
treelib.createTree = createTree

local function getLeft(tree)
  return tree[0]
end
treelib.getLeft = getLeft

local function getRight(tree)
  return tree[1]
end
treelib.getRight = getRight

local function addLeft(tree)
  local left = {}
  tree[0] = left
  
  return tree
end
treelib.addLeft = addLeft

local function addLeftWithValue(tree,fils)
  tree[0] = fils
  
  return tree
end
treelib.addLeftWithValue = addLeftWithValue

local function addRight(tree)
  local right = {}
  tree[1] = right
    
  return tree
end
treelib.addRight = addRight

local function addRightWithValue(tree,fils)
  tree[1] = fils
  
  return tree
end
treelib.addRightWithValue = addRightWithValue

local function toNumber(tree)
  if (tree == nil) then
    return 0
  else
    return 1 + toNumber(getRight(tree)) 
  end
end
treelib.toNumber = toNumber
 
local function addTwo(tree)
  left, right = {}
  tree[0], tree[1] = left, right
 end
treelib.addTwo = addTwo

return treelib --export
 