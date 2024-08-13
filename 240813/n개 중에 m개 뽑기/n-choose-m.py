n, m = map(int, input().split())
ans = []

def print_ans():
    for i in range(len(ans)):
        print(ans[i], end = ' ')
    print()

def comb(curr_len, curr_num):
    global n, m
    if curr_len == m + 1:
        print_ans()
        return
    
    for i in range(1, n + 1):
        if i > curr_num:
            ans.append(i)
            comb(curr_len + 1, i)
            ans.pop()

comb(1, 0)