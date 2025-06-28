import numpy as np

size=int(input("Enter the size of the array:"))
array=np.empty(size)
for i in range(0,size):
    ele=int(input("Enter the element:"))
    array[i]=ele 
print("Reversed array:")
for i in range(size-1,-1,-1):
    print(array[i])


