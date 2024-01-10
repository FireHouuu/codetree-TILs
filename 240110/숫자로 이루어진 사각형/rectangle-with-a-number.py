def square(n):
    i = 1;
    for _ in range(n):
        for _ in range(n):
            print(i%10, end=" ")
            i = i + 1
            if (i%10 == 0):
                i = i + 1
        print()

num = int(input())
square(num)