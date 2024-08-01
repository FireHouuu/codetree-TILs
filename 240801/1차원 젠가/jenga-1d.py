n = int(input())

block = []
for _ in range(n):
    block.append(int(input()))

s1, e1 = map(int, input().split())
s2, e2 = map(int, input().split())

def kill(s, e):
    for i in range(s-1, e):
        block[i] = 0
    
    temp = []
    for i in range(n-1, -1, -1):
        if block[i] != 0:
            temp.insert(0, block[i])

    for i in range(len(temp)):
        block[i] = temp[i]

    for i in range(len(temp), n):
        block[i] = 0
    
kill(s1, e1)
kill(s2, e2)

length = n - (e1 - s1 + 1) - (e2 - s2 + 1)

print(length)
for i in range(length):
    print(block[i])