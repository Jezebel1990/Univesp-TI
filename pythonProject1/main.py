from jmespath import search
from selenium import webdriver

firefox = webdriver.Firefox()
firefox.get('http://www.google.com')

firefox.maximize_window()

from selenium.webdriver.common.by import By

search_box = firefox.find_element(By.NAME, "q").send_keys("teste de busca")