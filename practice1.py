import numpy as np 
import pandas as pd

list=[1,2,3,4,5,6]
a=np.array(list)
print(a)
frame=pd.DataFrame(list,index=[1,2,3,4,5,6],columns=["Serial Number"])
print(frame)


