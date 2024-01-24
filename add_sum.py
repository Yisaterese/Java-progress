sum = 0
while True:
	number1 = int(input("Enter number\n"))
	number2 = int(input())
	sum = number1 + number2
	print(f"the sum is:  {sum}"  .format(sum))

	response = str(input("Do you wish to perform another operation\n"))
	if not response .lower() == "yes":
		break
