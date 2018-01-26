local treelib = require 'tree' -- import du module

function test(X,Y)
  local W, G --optionnel
  W, G = X, Y
  X = nil
  if X == Y then Z = X
  else
    X = Z
  end
  
  return X, Y, W
end

local tree = treelib.createTree()
treelib.addRight(tree)
print(treelib.toNumber(tree))