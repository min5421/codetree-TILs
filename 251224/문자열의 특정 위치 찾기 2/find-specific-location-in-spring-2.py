a = ["apple", "banana", "grape", "blueberry", "orange"]
b = input()

cnt = 0
for i in a:
    if i[3] == b or i[2] == b:
        print(i)
        cnt += 1

print(cnt)