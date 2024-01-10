n = int(input())

def is_magic_number(n):
    num_1 = n//10 + n%10
    num_2 = n%2
    if num_1%5==0 and num_2==0:
        return 1
    else:
        return 0

if is_magic_number(n):
    print("Yes")
else:
    print("No")