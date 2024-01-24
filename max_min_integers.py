


user_input  = int(input("Enter number for app to run: "))

maximum = 0
minimum = 0
list = []
sum_of_mim_max  = 0
counter  = 1

while  counter <= user_input:

	integers = int(input("Enter number\n"))
	list.append(integers)

	maximum = max(list)
	minimum = min(list)

	sum_of_mim_max = minimum + maximum 	
	counter +=1
print(f"maximum is: {maximum}")
print(f"minimum is: {minimum}")
print(f"the sum is: {sum_of_mim_max }")