from selenium import webdriver
from selenium.webdriver.common.keys import Keys

user_name='karthee.test'
password='Karyn@1877'
driver=webdriver.Firefox();
driver.get('https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession')
element = driver.find_element_by_id("identifierId")
element.send_keys(user_name)
element=driver.find_element_by_id("identifierId")
element.send_keys(password)

