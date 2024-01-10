n, m = tuple(map(int, input().split()))

def gcx(n,m):
    gcx = 0
    for i in range(max(n,m), n*m+1):
        if i%n==0 and i%m==0:
            gcx = i
            break
    print(gcx)

gcx(n,m)