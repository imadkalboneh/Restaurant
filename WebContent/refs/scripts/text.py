#Author: Imad Kalboneh
#Date created: June 25, 2017
#Last updated; January 10, 2019

import os
import time
import subprocess
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.by import By
from selenium.common.exceptions import TimeoutException

site = 'textfree.us'


#open up chrome window and load the site
driver = webdriver.Chrome()
driver.maximize_window()
driver.get('https://www.' + site)
time.sleep(5)
delay = 3

driver.find_element_by_xpath("//*[@id='loginButton']").click()

try:
	WebDriverWait(driver, delay).until(EC.presence_of_element_located((By.ID, 'username')))
except TimeoutException:
	print('')

#find parameter names and fill them
username = driver.find_element_by_name('username')
username.send_keys('wetextyou')

password = driver.find_element_by_name('password')
password.send_keys('cHSkM2iD1')

driver.find_element_by_xpath("//*[@id='loginForm']/div[4]/button").click()
time.sleep(3);

#remove google prompt
try:
	WebDriverWait(driver, delay).until(EC.presence_of_element_located((By.XPATH, "/html/body/div[1]/div/div/pmk-add-google-contacts-modal/div[1]/div")))
except TimeoutException:
	print('')
driver.find_element_by_xpath("/html/body/div[1]/div/div/pmk-add-google-contacts-modal/div[1]/div").click()

f = open('C:/Users/Imad/Desktop/Java/Private/Restaurant/WebContent/refs/scripts/rec.txt', 'r')
name = f.readline().rstrip()
num = f.readline().rstrip()

#create new text
driver.find_element_by_xpath("//*[@id='startNewConversationButton']").click()

contact = driver.find_element_by_id('contactInput')
contact.send_keys(num + '\t\t')

#read text file with 2 lines
#line 1: user name
#line 2: user phone number
driver.find_element_by_xpath("//*[@id='messageForm']/div/div[2]/div[1]").send_keys('Hi ' + name + '! Thanks for registering at Demo1.com' + Keys.RETURN)

time.sleep(5);

driver.close()