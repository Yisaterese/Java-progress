import math 

def amstrong_number(number):

	#number = int(input("Enter number "))
	number_string = str(number)
	result = 0

	for index in range(0,len(number_string)):
		result += math.pow(int(number_string[index]),len(number_string))

		cast_result = int(result)

		if cast_result == number:
			return  cast_result
	else:
		return  cast_result
