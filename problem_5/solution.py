dividend = 20

meetsCriteria = False

while meetsCriteria == False:
	if (dividend % 20 == 0 and dividend % 19 == 0  
			and dividend % 18 == 0 and dividend % 17 == 0 
				and dividend % 16 == 0 and dividend % 14 == 0 
					and dividend % 13 == 0 and dividend % 11 == 0):
		meetsCriteria = True
	else:
		dividend += 1

print dividend