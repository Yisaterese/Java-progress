for  index in range(1,30,5):
	for  asterics in range(1,30):
		star = "*"
		if index == asterics:
			star *= index
			#print(f"{star}\n",end="")
			print(f"{index} {star}")