
import sys
from collections import deque

n = int(input())
m, n, k = map(int,sys.stdin.readline().split())

graph = [[0]*n for _ in range(m)]

for _ in range(k):
    x, y = map(int, input().split(" "))
    graph[x][y] = 1
print(graph)
move = [(0,1),(0,-1),(1,0),(-1,0)]
count = 0
def bfs(x,y):
    Q = deque()
    Q.append([x,y])

    while Q:
        a, b = Q.popleft()
        for dx, dy in move:
            nx = a + dx
            ny = b + dy
            if 0 <= nx < n and 0 <= ny < m and graph[nx][ny] == 1:
                Q.append([nx,ny])

for x in range(m):
    for y in range(n):
        if graph[x][y] == 1:
            bfs(x,y)
            count += 1
print(count)