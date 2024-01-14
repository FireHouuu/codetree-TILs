n = int(input())

def recur(n):
    if n == 1:
        return 1
    return recur(n-1)+n


print(recur(n))