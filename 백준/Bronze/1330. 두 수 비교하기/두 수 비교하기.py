a, b = map(int, input().split(" "))

result = ">" if a > b else "<" if a < b else "=="
print(result)