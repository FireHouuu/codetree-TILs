n = int(input())
ans = []
flag = True

def print_list():
    for i in range(n):
        print(ans[i], end = "")
    print()

def check():
    global n
    k = int(n/2)
    for i in range(1, k+1): #길이
        for j in range(n-1): #위치
            if j + i * 2 > n:
                break
            if ans[j:j+i] == ans[j+i:j+i*2]:
                return False
    return True

def find(curr_num):
    global flag
    if curr_num == n + 1:
        if check():
            print_list()
            flag = False
        return
    
    for i in range(4, 7):
        ans.append(i)
        if flag:
            find(curr_num + 1)
        ans.pop()

find(1)