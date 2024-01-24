for row in range(0,6):
	for col in range(0,row):
		print("*",end="" )
	print()

print();

for row in range(1,6):
	for col in range(row,6):
		print("*",end="")
	print()

print()

for row in range(1,6):
	space = row+1
	while space >= 1:
		print(" ",end="")
		space-=1
	for col in range(6,row,-1):
		print("*",end="")
	print()

for row in range(0,6):
	space = 6-row
	while space >= 1:
		print(" ",end="")
		space-=1
	for col in range(0,row):
		print("*", end="")
	print()

