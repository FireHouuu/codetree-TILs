k, n = map(int, input().split())
ans = []

def print_out():
    for elem in ans:
        print(elem, end = ' ')
    print()

def choose(curr_num):
    if curr_num > n:
        print_out()
        return 
    
    for i in range(1, k+1):
        ans.append(i)
        choose(curr_num+1)
        ans.pop()
    
    return

choose(1)