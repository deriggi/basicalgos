import random

# swap function with a temp
def swap(listy, a,b):
    temp = listy[a]
    listy[a] = listy[b]
    listy[b] = temp

# bubble sort function
# params:
#   lengthy - length of the initial array
def bubbelsort(lengthy):
    listy = []
    for x in range(0, lengthy):
        # lets make max big  so we have fewer duplicates
        listy.append(random.randint(0,lengthy*5))
    
    right = len(listy) - 1
    cursor = 0
    iterationCounter = 0
    swapped = False

    while cursor <= right:
        
        iterationCounter = iterationCounter+1
        if listy[cursor] > listy[cursor+1]:
            swap(listy,cursor,cursor+1)
            swapped = True
        cursor = cursor + 1
        if cursor == right and (not swapped):
            break
        if cursor == right:
            cursor = 0
            right = right-1
            swapped = False
    
    if sorted(listy) != listy:
        print("FAIL")
    return iterationCounter

    # return (iterationCounter,lengthy)

iterCounts = []
max = 1000
iterCounts.append("size,iterations")
for i in range(10,max):
    iterCounts.append("{0},{1}".format(i,bubbelsort(i)))
f = open("bubbleiterations_faster.csv", 'w')
f.write("\n".join(iterCounts))

# print(iterCounts)
