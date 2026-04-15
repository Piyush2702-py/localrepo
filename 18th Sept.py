# Define a class
class Student:
    # Constructor
    def __init__(self, name, age):
        self.name = name
        self.age = age

    # Method to display details
    def display(self):
        print("Name:", self.name)
        print("Age:", self.age)

# Create objects
s1 = Student("Piyush", 20)
s2 = Student("Rahul", 21)

# Call methods
s1.display()
print("-----------")
s2.display()