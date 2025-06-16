import numpy as np

list=[]
size=int(input("Enter the size of array:"))
print("Enter",size,"elements:")
for i in range(0,size):
    a=int(input("Enter the element:"))
    list.append(a)
arr=np.array([list])
print("The array is:")
print(arr)

