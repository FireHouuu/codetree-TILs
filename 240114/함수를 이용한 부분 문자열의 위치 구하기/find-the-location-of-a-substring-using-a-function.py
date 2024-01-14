input_str = input()
target_str = input()
input_length = len(input_str)
target_length = len(target_str)


def idx_check():
    for i in range(input_length):
        if input_str[i:i+target_length] == target_str:
            return i
    return -1

print(idx_check())