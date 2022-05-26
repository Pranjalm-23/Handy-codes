#  note python doesn't require special attention for big integers

#  automatically handles big ints

n = int(input())

ans = 1
for i in range(1, n+1):
  ans = ans*i

print(ans)