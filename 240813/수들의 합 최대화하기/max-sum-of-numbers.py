n = int(input())
grid = [
    list(map(int, input().split()))
    for _ in range(n)
]
visited_x = [False] * n
visited_y = [False] * n
ans = 0
tmp = 0
 

def paint(curr_num):
    global ans, tmp
    if curr_num == n + 1:
        ans = max(ans, tmp)
        return

    for i in range(n):
        if not visited_x[i]:
            for j in range(n):
                if not visited_y[j]:
                    tmp += grid[i][j]
                    visited_x[i], visited_y[j] = True, True
                    paint(curr_num + 1)
                    tmp -= grid[i][j]
                    visited_x[i], visited_y[j] = False, False

paint(1)
print(ans)