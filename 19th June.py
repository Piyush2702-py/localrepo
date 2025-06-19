import numpy as np 

n=int(input("Enter the number of elements:"))
list=[]
for i in range(0,n):
    ele=int(input("Enter the element:"))
    list.append(ele)
arr=np.array(list)
print(arr)
print("The length of the list is:",n)
print("The element at position 3 is:",list[2])
if(list==None):
    print("The list is empty")

