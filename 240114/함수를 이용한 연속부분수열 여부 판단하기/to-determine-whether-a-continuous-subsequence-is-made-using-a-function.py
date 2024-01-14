n_a, n_b = tuple(map(int, input().split()))
A = input().replace(" " , "")
B = input().replace(" " , "")

def cal(n_a, n_b, A, B):
    n = n_a - n_b + 1
    for i in range(n+1):
        if A[i:i + n_b] == B:
            return True
    return False

if cal(n_a, n_b, A, B):
    print("Yes")
else:
    print("No")