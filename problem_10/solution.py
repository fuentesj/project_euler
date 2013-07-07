import math

def is_prime(potential_prime):
	if potential_prime == 1:
		return False
	else: 
		divisor = 2
		is_prime = True
		while divisor <= math.sqrt(potential_prime) and is_prime:
			if potential_prime % divisor == 0:
				is_prime = False
			divisor += 1
		return is_prime

potential_primes = []

for num in range(3, 2000001):
	if num % 2 == 1:
		potential_primes.append(num)

prime_sum = 2 # Since we initialize the array with odd numbers, the first prime number, 2, is excluded, so inclue it here

for current in potential_primes:
	if is_prime(current):
		print current
		prime_sum += current

print prime_sum



