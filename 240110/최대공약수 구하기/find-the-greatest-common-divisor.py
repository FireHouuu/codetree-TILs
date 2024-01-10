import math

def gcd_out(n, m):
    print(math.gcd(n, m))

num_1, num_2 = tuple(map(int, input().split()))
gcd_out(num_1, num_2)