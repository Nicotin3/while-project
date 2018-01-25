function test(X,Y)
  local W, G; --optionnel
  W, G = X, Y;
  X = nil;
  if X == Y then Z = X
  else
    X = Z
  end
  
  return X, Y, W
end

print(test(10,10))