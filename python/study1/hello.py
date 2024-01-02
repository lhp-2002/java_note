# coding=utf-8
# 代码文件： hello.py

import world
from world import z
from world import x as x2

x = 100
y = 20

print(y) # 访问world当前模块的y变量
print(world.y) # 访问world模块的y变量
print(z) # 访问world模块的z变量
print(x2) # 访问world模块的x变量别名x2