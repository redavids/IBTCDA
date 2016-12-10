# -*- coding: utf-8 -*-
"""
Created on Wed Dec  7 19:41:22 2016

@author: Chris
"""

from scipy import misc
import numpy as np
import matplotlib.pyplot as plt
import matplotlib.cm as cm
np.set_printoptions(threshold=np.inf)

#image=misc.imread('C:\\Users\\Chris\\Downloads\\checkerboard.jpg')
image=misc.imread('C:\\Users\\Chris\\Downloads\\small kazak.jpg')
#print (image[0])

#plt.imshow(image) #Loads Image
#plt.show() #Shows the image window

def average(pixel):
    return (pixel [0] + pixel [1] + pixel [2])/3
#def modedversion(pixel):
    #return (0.21*pixel [0] + 0.72*pixel [1] + 0.07*pixel [2])
grey = np.zeros((image.shape[0], image.shape[1]))
for rownum in range(len(image)):
    for colnum in range(len(image[rownum])):
        grey[rownum][colnum] = average(image[rownum][colnum])
        
plt.imshow(grey, cmap = cm.Greys_r)
plt.show()
#image=misc.imread('C:\\Users\\Chris\\Downloads\\cat.jpg')
#print(image) #Gives the RGB values for all pixels. The Inner most brackers give the RGB values for the rows
#print (image.shape) #Gives the height and width of the image
#print (image[0]) #Gives RGB values for row 0
#print (image[0][0]) #Gives RGB values for row 0 and column 0
