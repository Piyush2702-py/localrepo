import numpy as np 

print("This is a program to sort an array !")
size=int(input("Enter the size of the array:"))
array=np.empty(size)
for i in range(0,size):
    ele=int(input("Enter the element:"))
    array[i]=ele
print("Before sorting the array:",array)
larg=array[0]
for i in range(0,size):
    if(array[i]<array[i+1]):
        break
print("After sorting the array:",array)

