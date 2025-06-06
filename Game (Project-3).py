import random

print("This is a number guessing game !","\n","Enter any number between 1 and 10")
number=int(input("Enter a number:"))
a=random.randint(1,10)
sum=1
while number!=a:
    sum +=1
    if(number==a):
        break
    elif(number>10 or number<0):
        print("The number is out of range !")
    elif(number>a):
        print("Your guess is too high.")
    elif(number<a):
        print("Your guess is too low.")
    else:
        print("You guessed the wrong number !")
    number=int(input("Enter again:"))
print("Congratulations ! You guessed the correct number","\n",
      "Your number is:",number,"Computer's number:",a,"The number of chances you took =",sum)
print("Thank you !")
