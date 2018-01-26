
function f6(var0, var1)
  local var2 = treelib.createTree()
  var2 = var0
  for i = 0, treelib.toNumber(var1) do
    local var3 = f4(var2)
    local var2 = treelib.createTree()
    local var3 = treelib.createTree()
    var2 = var3
  end
  return var2
end

function f3(var0)
  local var2 = treelib.createTree()
  local var3 = treelib.createTree()
  local var4 = treelib.createTree()
  treelib.addLeftWithValue(var4, var2)
  treelib.addRightWithValue(var4, var3)
  var1 = var0==var4
  if var1  then
    local var6 = treelib.createTree()
    local var7 = treelib.createTree()
    local var8 = treelib.createTree()
    treelib.addLeftWithValue(var8, var6)
    treelib.addRightWithValue(var8, var7)
    local var5 = treelib.createTree()
    local var8 = treelib.createTree()
    var5 = var8
  else
    local var9 = treelib.createTree()
    local var5 = treelib.createTree()
    var5 = var9
  end
  return var5
end

function f9(var0, var1)
  local var3 = treelib.createTree()
  local var2 = treelib.createTree()
  var2 = var3
  for i = 0, treelib.toNumber(var1) do
    local var4 = f6(var0, var2)
    local var2 = treelib.createTree()
    local var4 = treelib.createTree()
    var2 = var4
  end
  return var2
end

function f13(var0)
  local var2 = treelib.createTree()
  local var3 = treelib.createTree()
  local var4 = treelib.createTree()
  treelib.addLeftWithValue(var4, var2)
  treelib.addRightWithValue(var4, var3)
  local var1 = treelib.createTree()
  local var4 = treelib.createTree()
  var1 = var4
  local var5 = f2(var0)
  while var5  do
    local var6 = f5(var0)
    local var7 = treelib.createTree()
    local var6 = treelib.createTree()
    var7 = var6
    local var8 = f9(var1, var0)
    local var9 = treelib.createTree()
    local var8 = treelib.createTree()
    var9 = var8
    local var0 = treelib.createTree()
    var0 = var7
    local var1 = treelib.createTree()
    var1 = var9
  end
  return var1
end

function f2(var0)
  if var0  then
    local var2 = treelib.createTree()
    local var1 = treelib.createTree()
    var1 = var2
  else
    local var3 = treelib.createTree()
    local var4 = treelib.createTree()
    local var5 = treelib.createTree()
    treelib.addLeftWithValue(var5, var3)
    treelib.addRightWithValue(var5, var4)
    local var1 = treelib.createTree()
    local var5 = treelib.createTree()
    var1 = var5
  end
  return var1
end

function f4(var0)
  local var1 = treelib.createTree()
  local var2 = treelib.createTree()
  treelib.addLeftWithValue(var2, var1)
  treelib.addRightWithValue(var2, var0)
  local var2 = treelib.createTree()
  var0 = var2
  return var0
end

function f8(var0, var1)
  local var2 = treelib.createTree()
  var2 = var0
  for i = 0, treelib.toNumber(var1) do
    local var3 = f5(var2)
    local var2 = treelib.createTree()
    local var3 = treelib.createTree()
    var2 = var3
  end
  return var2
end

function f12(var0, var1)
  local var4 = f11(var0, var1)
  local var2 = treelib.createTree()
  local var4 = treelib.createTree()
  var2 = var4
  local var5 = f2(var3)
  if var5  then
    local var7 = f12(var1, var3)
    local var6 = treelib.createTree()
    local var7 = treelib.createTree()
    var6 = var7
  else
    local var6 = treelib.createTree()
    local var1 = treelib.createTree()
    var6 = var1
  end
  return var6
end

function f11(var0, var1)
  local var4 = treelib.createTree()
  local var5 = treelib.createTree()
  var5 = var4
  local var6 = treelib.createTree()
  var6 = var0
  local var2 = treelib.createTree()
  var2 = var5
  local var3 = treelib.createTree()
  var3 = var6
  local var8 = f8(var3, var1)
  local var7 = treelib.createTree()
  local var8 = treelib.createTree()
  var7 = var8
  local var9 = f2(var7)
  while var9  do
    local var10 = f4(var2)
    local var11 = treelib.createTree()
    local var10 = treelib.createTree()
    var11 = var10
    local var12 = treelib.createTree()
    local var7 = treelib.createTree()
    var12 = var7
    local var2 = treelib.createTree()
    var2 = var11
    local var3 = treelib.createTree()
    var3 = var12
  end
  return var2, var3
end

function f1(var0)
  if var0  then
    local var2 = treelib.createTree()
    local var3 = treelib.createTree()
    local var4 = treelib.createTree()
    treelib.addLeftWithValue(var4, var2)
    treelib.addRightWithValue(var4, var3)
    local var1 = treelib.createTree()
    local var4 = treelib.createTree()
    var1 = var4
  else
    local var5 = treelib.createTree()
    local var1 = treelib.createTree()
    var1 = var5
  end
  return var1
end

function f10(var0, var1)
  local var3 = treelib.createTree()
  local var4 = treelib.createTree()
  local var5 = treelib.createTree()
  treelib.addLeftWithValue(var5, var3)
  treelib.addRightWithValue(var5, var4)
  local var2 = treelib.createTree()
  local var5 = treelib.createTree()
  var2 = var5
  for i = 0, treelib.toNumber(var1) do
    local var6 = f9(var0, var2)
    local var2 = treelib.createTree()
    local var6 = treelib.createTree()
    var2 = var6
  end
  return var2
end

function f7(var0, var1)
  local var2 = f1(var1)
  if var2  then
    local var3 = treelib.createTree()
    local var0 = treelib.createTree()
    var3 = var0
  else
    local var6 = f5(var1)
    local var5 = f7(var0, var6)
    local var4 = f4(var5)
    local var3 = treelib.createTree()
    local var4 = treelib.createTree()
    var3 = var4
  end
  return var3
end

function f5(var0)
  local var1 = treelib.createTree()
  bouchon, op non implementé :TL
  var0 = var1
  return var0
end

function f14(var0)
  local var2 = f1(var0)
  local var3 = f3(var0)
  local var1 = treelib.createTree()
  var1 = var2 or var3
  if var1  then
    local var5 = treelib.createTree()
    local var6 = treelib.createTree()
    local var7 = treelib.createTree()
    treelib.addLeftWithValue(var7, var5)
    treelib.addRightWithValue(var7, var6)
    local var4 = treelib.createTree()
    local var7 = treelib.createTree()
    var4 = var7
  else
    local var10 = f5(var0)
    local var9 = f14(var10)
    local var13 = f5(var0)
    local var12 = f5(var13)
    local var11 = f14(var12)
    local var8 = f6(var9, var11)
    local var4 = treelib.createTree()
    local var8 = treelib.createTree()
    var4 = var8
  end
  return var4
end
