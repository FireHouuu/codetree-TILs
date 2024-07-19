n, m = map(int, input().split())

grid = [
    list(map(int, input().split()))
    for _ in range(n)
]

output = 0

for i in range(n):
    x_count = 1
    y_count = 1
    for j in range(n-1):
        # 가로 방향 검사
        if grid[i][j] == grid[i][j+1]:
            x_count += 1
        else:
            x_count = 1
        if x_count == m:
            output += 1
            x_count = 0  # 중복 카운트를 막기 위해 0으로 설정
        
        # 세로 방향 검사
        if grid[j][i] == grid[j+1][i]:
            y_count += 1
        else:
            y_count = 1
        if y_count == m:
            output += 1
            y_count = 0  # 중복 카운트를 막기 위해 0으로 설정

# 특수 경우: n이 1일 때, 모든 값이 같은 것으로 처리
if n == 1:
    output = 2 if grid[0][0] == m else 0

print(output)