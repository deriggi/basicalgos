import random

# swap function with a temp
def swap(listy, a,b):
    temp = listy[a]
    listy[a] = listy[b]
    listy[b] = temp

# bubble sort function
# lengthy - length of the initial array
def bubbelsort(lengthy):
    listy = []
    for x in range(0, lengthy):
        # lets make the max twice the array so we have fewer duplicates
        listy.append(random.randint(0,lengthy*2))

    # have a look at the initalized array unsorted
    print(listy)
    right = len(listy) - 1
    cursor = 0
    iterationCounter = 0
    swapped = False
    while cursor <= right:
        
        iterationCounter = iterationCounter+1
        if listy[cursor] > listy[cursor+1]:
            swap(listy,cursor,cursor+1)
            swapped = True
        # print(listy)
        cursor = cursor + 1
        if cursor == right and (not swapped):
            break
        if cursor == right:
            cursor = 0
            right = right-1
            swapped = False
    
    # print(listy)
    # print(cursor)
    # print(right)
    print(str(iterationCounter) + " iterations")
    if sorted(listy) == listy:
        print("SORTED")
    else:
        println("FAIL")

    return (iterationCounter,lengthy)
for i in range(0,100):
    bubbelsort(20)
