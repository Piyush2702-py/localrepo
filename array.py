import numpy as np

arr=np.array([1,2,3,4,5])
print(arr)
user=int(input("Enter the element to search:"))
for i in range(0,5):
    if(user==arr[i]):
        print("Element found at index:",i)
        break

if(user!=arr[i]):
    print("Entered element doesn't exist in array:")

