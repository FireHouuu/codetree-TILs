class spy:
    def __init__(self, name, score):
        self.name = name
        self.score = int(score)

board = [spy(*input().split()) for _ in range(5)]
out = board[0].score
idx = 0

for i in range(1, 5):
    if out > board[i].score:
        out = board[i].score
        idx = i

print(board[idx].name, board[idx].score)