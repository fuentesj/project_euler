first_term = 1
second_term = 2
next_term = 0

even_fibonacci = []
even_fibonacci.append(second_term)

limit = 4000000

while next_term < limit:
	next_term = first_term + second_term
	first_term = second_term
	second_term = next_term
	if next_term % 2 == 0:
		even_fibonacci.append(next_term)


even_fibonacci_sum = sum(even_fibonacci)
print even_fibonacci_sum