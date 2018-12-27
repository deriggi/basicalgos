import random
import math

arr = []

# create 100 rando numbers
for x in range(1, 1000):
    arr.append( math.floor(random.random()*1000))

# sort 
arr.sort()

# choose a random target to search for 
target=arr[math.floor(random.random()*1000)]

# initialize binary search
left = 0
right = len(arr) -1
middle = math.floor((left + right)/2)
print(middle)
iterations = 0

# search until we converge
while left <= right:
    iterations = iterations + 1
    middle = math.floor((left + right)/2)

    if arr[middle] == target:
        break
    
    if arr[middle] < target:
        left = middle + 1

    elif arr[middle] > target:
        right = middle - 1
    

# show num iterations and values for the middle index and the target
print(iterations)
print(str(arr[middle]) + " " + str(target))


