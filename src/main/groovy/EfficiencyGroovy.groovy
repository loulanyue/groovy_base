//groovy高效特性

//1 可选的类型定义

def version = 1

//2 assert
assert version == 1

//3 括号是可选的
println version

//4 字符串
def s1 = 'yfy'
def s2 = "gradle"
def s3 = '''
    my 
    name 
    is 
    yfy
'''

println s1
println s2
println s3

//5 集合api
//list
def buildTools = ['ant', 'maven']
buildTools << 'gradle'
assert buildTools.getClass() == ArrayList
assert buildTools.size() == 3

//map
def buildYears = ['ant': 2000, 'maven': 2004]
buildYears.gradle = 2020

println buildYears.ant
println buildYears['gradle']

println buildYears.getClass()

//6 闭包

def c1 = {
    v ->
        print v
}

def c2 = {
    print 'hello'
}

def static method1(Closure closure) {
    closure('param')
}

def static method2(Closure closure) {
    closure()
}

method1(c1)

method2(c2)