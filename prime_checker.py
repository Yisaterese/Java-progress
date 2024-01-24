number = int(input("Enter number: \n"))
if number < 2 or number % 2 == 0:
	print("not a prime number")
elif number % 3 == 0:
	print("not a prime number")

for index in range(1,number,-1):
	if number % 3:
		#continue 
	print(index,end =" ");
	