import os
from alumnium import Alumni
from selenium.webdriver import Chrome

os.environ["ALUMNIUM_MODEL"] = "anthropic/modelname"
os.environ["ANTHROPIC_API_KEY"] = "api key value"

driver = Chrome()
driver.get("https://duckduckgo.com")

al = Alumni(driver)
al.do("type 'selenium' into the search field, then press 'Enter'")
al.check("page title contains selenium")
al.check("search results contain selenium.dev")
assert al.get("atomic number") == 34