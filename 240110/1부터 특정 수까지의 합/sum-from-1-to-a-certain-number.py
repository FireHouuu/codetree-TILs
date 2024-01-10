i = int(input())

def f(n):
    result = 0
    for i in range(1, n+1):
        result += i
    return result


print(f(i)//10)