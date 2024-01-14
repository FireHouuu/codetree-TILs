a, b = tuple(map(int, input().split()))

def f(a, b):
    if a > b:
        return a*2, b+10
    else:
        return a+10, b*2

print('{} {}'.format(*f(a, b)))