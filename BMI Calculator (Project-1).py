#This is a BMI Calculator 

Weight=int(input("Enter your weight(in kg) :"))
Height=float(input("Enter your height(in m) :"))
r_BMI=float((Weight/(Height)**2))
BMI=round(r_BMI,2)
print("Your BMI is:",BMI)
if(BMI==0 or BMI<=18.5):
    print("You are underweight !")
elif(BMI==18.6 or BMI<=24.9):
    print("You have a healthy weight !")
elif(BMI==25.0 or BMI<=29.9):
    print("You are overweight !")
else:
    print("You are obese !")




