import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys

chrome_driver_path = "C:\DEVELOPMENT\chromedriver.exe"
driver = webdriver.Chrome(chrome_driver_path)
driver.get("http://localhost:8080/webApp/src/main/webapp/index.html")
time.sleep(2)
i = driver.find_elements(By.NAME, "num1")
j = driver.find_elements(By.NAME, "num2")
# i = driver.find_element_by_name("num1")
# j = driver.find_element_by_name("num2")
time.sleep(2)
submit = driver.find_element_by_css_selector("form button")

array = [1, 2, 50, 99, 100]
for k in range(0, 9):
    if k < 5:
        time.sleep(2)
        print("hello")
        i.send_key("array[k]")
        j.send_key("50")
        time.sleep(2)
        submit.click()
    else:
        l = 0
        time.sleep(2)
        j.send_key("array[l]")
        i.send_key("50")
        time.sleep(2)
        l = l + 1
        submit.click()
# driver.close()
