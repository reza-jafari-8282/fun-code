import time


count = 1
width = 20

for i in range(10):
    print(("*" * count).center(width))
    count += 2
    time.sleep(0.1)

print("| |".center(width))
print("| |".center(width))
print("| |".center(width))
print("Happy new year".center(width))
print("2022".center(width))
