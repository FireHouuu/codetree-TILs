n = int(input())

def toN(n):
    if n == 0:
        return
    toN(n-1)
    print(n, end=" ")

def fromN(n):
    if n == 0:
        return
    print(n, end=" ")
    fromN(n-1)

toN(n)
print()
fromN(n)