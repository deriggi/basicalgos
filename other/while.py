

def nonLinearWhileMult(n):
    iterations = 0;    
    a=0.005
    while a < n:
        # print("*")
        iterations = iterations+1
        a = 2*a
    return iterations

def nonLinearDiv(n):
    iterations = 0
    a=n
    while a > 0.005:
        a = a/2
        iterations = iterations + 1
    return iterations


# division method
f = open("nonLinearDiv.csv", 'w')
counts=[]
f.write("size,iterations\n")
for x in range(10,10000):
    counts.append("{0},{1}".format(x,nonLinearDiv(x)))
f.write("\n".join(counts))
f.close()

# multiplication method
f = open("nonLinearWhileMult.csv", 'w')
counts=[]
f.write("size,iterations\n")
for x in range(10,10000):
    counts.append("{0},{1}".format(x,nonLinearWhileMult(x)))
f.write("\n".join(counts))
f.close()