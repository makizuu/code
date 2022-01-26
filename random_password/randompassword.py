#!/usr/bin/python3
import random
import string

length = int(input('Length of a password: '))

lower = string.ascii_lowercase
upper = string.ascii_uppercase
num = string.digits
symbols = string.punctuation

all = lower + upper + num + symbols

x = random.sample(all,length)

password = "".join(x)

print(password)
