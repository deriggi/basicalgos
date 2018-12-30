def aShorterWhile(n):
    iterations = 0
    a=1
    while a < n:
        # print("*")
        iterations = iterations+1
        a = 2*a;
    return iterations
f = open("whilecounter.csv", 'w')

counts=[]
f.write("size,iterations\n")
for x in range(10,10000):
    counts.append("{0},{1}".format(x,aShorterWhile(x)))

f.write("\n".join(counts))
