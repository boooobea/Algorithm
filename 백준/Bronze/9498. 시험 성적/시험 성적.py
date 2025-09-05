score = int(input())

# if 90 <= score <= 100 : print("A")
# elif 80 <= score < 90 : print("B")
# elif 70 <= score < 80 : print("C")
# elif 60 <= score < 70 : print("D")
# else : print("F")

result = "A" if 90<=score<=100 else "B" if 80<=score<90 else "C" if 70<=score<80 else "D" if 60<=score<70 else "F"
print(result)