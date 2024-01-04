# coding = utf-8
# 代码文件: 3ifElseIf.py

score = int(input("请输入一个0~100整数："))

if score >= 90:
    grabe = 'A'
elif score >= 80:
    grabe ='B'
elif score >= 70:
    grabe = 'C'
elif score >= 60:
    grabe = 'D'
else:
    grabe = 'F'

print("Grabe = " + grabe)