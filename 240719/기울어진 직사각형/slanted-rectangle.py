n = int(input())
grid = [
    list(map(int, input().split()))
    for _ in range(n)
]

x = [-1, -1, 1, 1]
y = [1, -1, -1, 1]

def search(p, q):
    sum = grid[p][q]
    pri = False
    if p == 4 and q == 1: pri = True
    i = p
    j = q
    for k in range(4):
        
        while True:
            xch = i + x[k]
            ych = j + y[k]
            if xch >= n or xch < 0 or ych >= n or ych < 0:
                break
            else:
                i = xch
                j = ych
            if i == p and j == q:
                break
            sum += grid[i][j]
            #if pri:
                #print(i, j)
    return sum

ans = 0
for i in range(2, n):
    for j in range(1, n-1):
        ans = max(ans, search(i, j))

print (ans)