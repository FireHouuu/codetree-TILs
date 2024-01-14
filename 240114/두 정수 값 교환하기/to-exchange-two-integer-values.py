a, b = tuple(map(int, input().split()))

def swap(a, b):
    a, b = b, a
    print(a, b)

swap(a, b)