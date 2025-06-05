# A Simple calculator 

a=int(input("Enter first number:"))
b=int(input("Enter second number:"))
opera=input("Choose any one operation--> (+,-,*,/):")
if(opera=="+"):
    print("The sum of",a,"and",b,"is:",a+b)
    exit
elif(opera=="-"):
    print(a,"-",b,"=",a-b)
    print(b,"-",a,"=",b-a)
    exit
elif(opera=="*"):
    print("The product of",a,"and",b,"is:",a*b)
    exit
elif(opera=="/"):
    print("Do you want",a,"/",b,"?", ("if yes press 1"),"\n","or","\n",b,"/",a,"?", ("if yes press 2"))
    div=int(input())
    if(div==1):
        ans1=a/b
        cor_ans1=round(ans1,2)
        print(a,"/",b,"=",cor_ans1)
        exit
    elif(div==2):
         ans2=b/a
         cor_ans2=round(ans2,2)
         print(b,"/",a,"=",cor_ans2)
         exit
    else:
        print("You entered incorrect number !")
        exit
    exit
print("Thank you !")


        