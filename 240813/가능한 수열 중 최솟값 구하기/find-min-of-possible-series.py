import sys

n = int(input())
ans = []

def print_list():
    print("".join(map(str, ans)))

def check():
    global n
    k = int(len(ans) / 2)
    for i in range(1, k + 1):  # 길이
        if ans[-i:] == ans[-2 * i:-i]:  # 패턴 비교 (최신 부분만 확인)
            return False
    return True

def find(curr_num):
    if curr_num == n + 1:
        print_list()
        sys.exit(0)  # 첫 번째 유효한 수열을 찾으면 프로그램 종료
        return
    
    for i in range(4, 7):
        ans.append(i)
        if check():  # 패턴이 유효한지 미리 확인
            find(curr_num + 1)
        ans.pop()

find(1)