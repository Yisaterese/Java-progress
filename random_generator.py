import secrets
user_guess = int(input("Enter guess\n"))
random_number = secrets.randbelow(20)

while user_guess !=  random_number:

	if user_guess > random_number:
		print("guess too high try again")
	elif user_guess < random_number:
		print("guess too low try again")
	elif user_guess == random:
		print("Correct")
	user_guess = int(input())
print(f"{random_number} is correct")