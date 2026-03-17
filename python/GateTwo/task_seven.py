count = 0
total = 0
while count < 5:
    number = int(input("Enter a number: "))
    count +=1
    for num in range(1, number+1):
        total += num
   
   
print(total)
