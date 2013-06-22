import math

def isprime(potential_prime):
	if potential_prime == 1:
		return False
	elif potential_prime == 2:
		return True
	else:
		for divisor in range(2, potential_prime):
			if potential_prime % divisor == 0:
				return False
		return True

num_to_be_factored = 600851475143
sqrt =  math.sqrt(num_to_be_factored)
current_divisor = 2
primes = []

while current_divisor < sqrt:
	if num_to_be_factored % current_divisor == 0:
		if isprime(current_divisor) == True:
			primes.append(current_divisor)
	current_divisor += 1

print primes

