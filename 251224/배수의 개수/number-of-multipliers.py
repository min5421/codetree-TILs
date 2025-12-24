cnt3 = 0
cnt5 = 0

for o in range(10):
    i = int(input())
    if i % 3 == 0 :
        cnt3 += 1
    if i % 5 == 0:
        cnt5 += 1

print(cnt3, cnt5)