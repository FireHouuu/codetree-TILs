n, t = map(int, input().split())
top = list(map(int, input().split()))
bot = list(map(int, input().split()))

for _ in range(t):
    top_temp = top[n-1]
    bot_temp = bot[0]
    for i in range(n-1):
        top[n-i-1] = top[n-i-2]
        bot[i] = bot[i+1]
    top[0] = bot_temp
    bot[n-1] = top_temp

for i in range(n):
    print(top[i], end=' ')
print()

for i in range(n):
    print(bot[i], end=' ')