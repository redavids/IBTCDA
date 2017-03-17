# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""
import matplotlib.pyplot as plt
birth=[]
death=[]
dimension=[]
creatorxyz=[]
destructorxyz=[]
for line in open("ccopy.txt"): #Another problems lies here. We need to modify this line of code everytime we want to read in an image. This is very similar to the other problem in the code that turns the images into their RGB-greyscale value. Our current soultion would require us to change the code to match the file name or change the file name to match the code.
    line=line.strip().split()
    birth.append(float(line[0]))
    dimension.append(int(line[2]))
    creatorxyz.append(float(line[3]))
    destructorxyz.append(float(line[4]))
    if line[1]=="inf":
        line[1]=0
    death.append(float(line[1]))

plt.plot(birth,death, label=" Birth vs Death")
#plt.plot(creatorxyz,destructorxyz,'g-',label="creatorxyz vs destructorxyz")
#plt.plot(birth,dimension)
plt.xlabel('Birth Greyscale Values')
plt.ylabel('Death Grescale Values')
plt.title('Birth Greyscale Values Vs. Death Greyscale Values')
plt.legend()
plt.show()

