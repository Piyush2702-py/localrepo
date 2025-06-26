import numpy as np 

size=int(input("Enter the size of the array:"))
arr=np.empty(size)
for i in range(0,size):
    ele=int(input("Enter the element:"))
    arr[i]=ele
greatest=arr[0]
for i in range(0,size):
    if(greatest<arr[i]):
        greatest=arr[i]
smallest=arr[0]
for i in range(0,size):
    if(smallest>arr[i]):
        smallest=arr[i]
print(arr)
print("The largest element is:",greatest)
print("The smallest element is:",smallest)

