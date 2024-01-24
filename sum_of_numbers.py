def sum_of_numbers(number):
	sum_numbers = 0
	for numbers in range(1,number):
		if numbers % 3 == 0:
			sum_numbers += numbers
	return sum_numbers
			