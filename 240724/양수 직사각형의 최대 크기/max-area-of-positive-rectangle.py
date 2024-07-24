n, m = map(int, input().split())

grid = [
    list(map(int, input().split()))
    for _ in range(n)
]

max_size = 0

def check_minus(i, j, k, l):
    for r in range(i, k+1):
        for t in range(j, l+1):
            if grid[r][t] <= 0:
                return False
    return True

for i in range(n):
    for j in range(m):
        for k in range(i, n):
            for l in range(j, m):
                if check_minus(i, j, k, l):
                    size = (k - i + 1) * (l - j + 1)
                    max_size = max(max_size, size)

print(max_size)