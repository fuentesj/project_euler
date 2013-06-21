multiples = [];

for num in range(1000):
	if num % 5 == 0 or num % 3 == 0:
		multiples.append(num)

sum_of_multiples = sum(multiples)

print sum_of_multiples

