n_a, n_b = tuple(map(int, input().split()))
A = input().split()
B = input().split()

def cal(len_a, len_b, A, B):
    i = j = 0

    while i < len_a and j < len_b:
        if A[i] == B[j]:
            j += 1
        i += 1

    return j == len_b

    

if cal(n_a, n_b, A, B):
    print("Yes")
else:
    print("No")