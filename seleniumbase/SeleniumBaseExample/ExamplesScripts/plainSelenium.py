from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Firefox()
driver.get("https://5elementslearning.dev/demosite/")
driver.implicitly_wait(0.5)
driver.find_element(by=By.LINK_TEXT, value="My Account").click()
message = driver.page_source
temp="Welcome, Please Sign In"
if(temp in message):
	driver.quit()
	
	