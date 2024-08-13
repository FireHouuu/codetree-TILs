k, n = map(int, input().split())
ans = []

def choose(curr_num):
    global k, n
    if curr_num == n + 1:
        for j in range(curr_num - 1):
            print(ans[j], end = ' ')
        print()
        return
    
    for i in range(1, k+1):
        if curr_num == 1 or curr_num == 2 or (ans[-1] != i and ans[-2] != i):
            ans.append(i)
            choose(curr_num + 1)
            ans.pop()

choose(1)