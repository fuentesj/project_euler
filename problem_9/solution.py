import math

def buildPerfectSquares(num, perfect_squares):
	perfect_squares.append(num**2)

perfect_squares = []

for num in range(1,1000):
	buildPerfectSquares(num, perfect_squares)

sqrt_one = 0
sqrt_two = 0
sqrt_three = 0

for first_operand in perfect_squares:
	for second_operand in perfect_squares:
		perfect_square_sum = first_operand + second_operand
		if perfect_square_sum in perfect_squares:
			if ((math.sqrt(first_operand) + math.sqrt(second_operand) + math.sqrt(perfect_square_sum)== 1000) and
					(math.sqrt(first_operand) < math.sqrt(second_operand) <  math.sqrt(perfect_square_sum))):
				sqrt_one = math.sqrt(first_operand)
				sqrt_two = math.sqrt(second_operand)
				sqrt_three = math.sqrt(perfect_square_sum)
				break

final_product = sqrt_one * sqrt_two * sqrt_three
print final_product


