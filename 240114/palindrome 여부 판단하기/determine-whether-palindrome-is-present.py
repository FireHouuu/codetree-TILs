input_string = input()

def is_palindrome(str_check):
    n = len(str_check)
    for i in range(n//2):
        if str_check[i] != str_check[n - i - 1]:
            return False
    return True

if is_palindrome(input_string):
    print("Yes")
else:
    print("No")