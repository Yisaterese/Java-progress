#numbers = int(input("Enter number: "))
counter = 1
largest = 0

while counter < 3:
	numbers = int(input("Enter number: "))
	if numbers > largest:
		numbers = largest
	elif largest > numbers:
		largest = numbers

	elif numbers < largest:
		break
	counter+=1	
print(f"{largest}")