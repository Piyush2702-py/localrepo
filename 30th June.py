import numpy as np

row=int(input("Enter the row of matrix:"))
col=int(input("Enter the col of matrix:"))
matrix=np.shape(row,col)
for i in range(0,row):
    for j in range(0,col):
        ele=int(input("Enter the element:"))
        matrix[i][j]=ele

for i in range(0,row):
    for j in range(0,col):
        print(matrix[i][j])
