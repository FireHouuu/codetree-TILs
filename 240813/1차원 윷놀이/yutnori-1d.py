n, m, k = map(int, input().split())
turns = [int(x) for x in input().split()]
plane = []
max_score = 0

def cal_score():
    global n, m, k
    score = 0
    horse = [1 for _ in range(k)]
    for i in range(n):
        horse[plane[i]] += turns[i]
    for i in range(k):
        if horse[i] >= m:
            score += 1
    return score

def move(curr_num):
    global n, k, max_score
    if curr_num == n + 1:
        max_score = max(max_score, cal_score())
        return
    
    for i in range(k):
        plane.append(i)
        move(curr_num + 1)
        plane.pop()

move(1)
print(max_score)