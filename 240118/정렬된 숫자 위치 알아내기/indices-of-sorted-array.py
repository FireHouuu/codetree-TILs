class number:
    def __init__(self, value, idx_first=-1, idx_last=-1):
        self.value, self.idx_first, self.idx_last = int(value), int(idx_first), int(idx_last)

n = int(input())
num_list = input().split()
numbers = []
for i in range(n):
    val = num_list[i]
    numbers.append(number(val, i+1))
numbers.sort(key=lambda x: x.value)

for j, num in enumerate(numbers, start=1):
    num.idx_last = j

numbers.sort(key=lambda x: x.idx_first)

for out in numbers:
    print(out.idx_last, end=" ")