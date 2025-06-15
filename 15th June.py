import numpy as np 

size = int(input("Enter the size of array: "))
arr = np.zeros(size, dtype=int)  # Initialize an array of zeros
for i in range(size):
    ipt = int(input("Enter the element: "))
    arr[i] = ipt
print(arr)
