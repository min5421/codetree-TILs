a, b, c = map(int, input().split())
total = a + b + c
aver = total // 3
dif = total - aver
print(total, aver, dif, sep='\n')