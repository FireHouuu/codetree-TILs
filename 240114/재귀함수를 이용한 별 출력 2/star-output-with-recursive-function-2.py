n = int(input())
def stars(n):
    if n == 0:
        return

    print("* " * n)
    stars(n-1)
    print("* " * n)

stars(n)