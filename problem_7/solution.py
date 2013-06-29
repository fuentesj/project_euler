
def is_prime(potential_prime):
	for divisor in range(2, potential_prime):
		if potential_prime % divisor == 0:
			return False
	return True


which_prime = 10001
current_potential_prime = 2
current_prime_count = 1
primes = {}
primes[current_prime_count] = current_potential_prime
current_potential_prime += 1
current_prime_count += 1



while current_prime_count <= which_prime:
	if is_prime(current_potential_prime):
		primes[current_prime_count] = current_potential_prime
		current_prime_count += 1
	current_potential_prime += 1

print str(which_prime) + "st prime is: " + str(primes[which_prime])



