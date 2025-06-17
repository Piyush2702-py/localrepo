import random 

n=int(input("Enter a number:")) 
if(n%2==0):  
    if(n==random.randint(2,5)):
        print("Not Weird")
    elif(n==random.randint(6,20)):
        print("Weird")
    elif(n>20):
        print("Not Weird")
    else:
        print("Not weird")
else:
    print("Weird")
    