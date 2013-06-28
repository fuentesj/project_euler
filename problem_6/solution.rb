
sum_of_squares = 0
total_sum = 0

for number in 1...101
	sum_of_squares += number**2
	total_sum += number
end

puts (total_sum**2) - sum_of_squares

