import sys
from collections import deque


# 11724
# sys.setrecursionlimit(10**6)
# n, m = map(int,sys.stdin.readline().split(" "))
# lst =[list(map(int,sys.stdin.readline().split(" "))) for _ in range(m)]
#
# graph = [[] for _ in range(n+1)]
# for x, y in lst:
#     graph[x].append(y)
#     graph[y].append(x)
#
# visited = [False]* (n+1)
# count = 0
# def dfs(x):
#     visited[x] = True
#     for next_node in graph[x]:
#         if not visited[next_node]:
#             dfs(next_node)
#
# for i in range(1,n+1):
#     if not visited[i]:
#         dfs(i)
#         count += 1
# print(count)


# 4963
'''
# move = [(1,0),( -1,0),(0,-1),(0,1),(-1,1),(1,1),(-1,-1),(1,-1)]
# 
def bfs(x, y):
    Q = deque()
    Q.append([x, y])
    graph[x][y] = 0
    while Q:
        a, b = Q.popleft()
        for dx, dy in move:
            nx = dx + a
            ny = dy + b
            if 0 <= nx < h and 0 <= ny < w and graph[nx][ny] == 1:
                graph[nx][ny] = 0
                Q.append([nx,ny])

while True:
    w, h = map(int, input().split())
    if w == 0 and h == 0:
        break
    graph = [list(map(int,input().split())) for _ in range(h)]
    count = 0
    for x in range(len(graph)):
        for y in range(len(graph[0])):
            if graph[x][y] == 1:
                bfs(x, y)
                count += 1
    print(count)
'''

'''
n = int(input())
graph =[[] for _ in range(n+1)]
for _ in range(n-1):
    a, b = map(int,sys.stdin.readline().split(" "))
    graph[a].append(b)
    graph[b].append(a)


question = int(input())
res = []
for _ in range(question):
    t, k = map(int,sys.stdin.readline().split(" "))
    if t == 1:
        pass
    else :
        pass

def connect():
    pass
'''