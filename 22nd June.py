import numpy as np 

size=int(input("Enter the size of the list:"))
list=[]
for i in range(0,size):
    ele=int(input("Enter the element:"))
    list.append(ele)
arr=np.array(list)
add=int(input("Enter the element to be inserted:"))
pos=int(input("Enter the position to be inserted at:"))
if(pos<size):
    for i in range(pos,size+1):
        list[i+1]=list[i]
print(list)
