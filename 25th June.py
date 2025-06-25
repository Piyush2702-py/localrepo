print("This is a program to reverse your name !!")
name=input("Enter your name:")
print("Before reversing your name:\n",name)
print("After reversing your name:")
for i in range((len(name)-1),-1,-1):
    print(name[i])


