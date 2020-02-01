//构建脚本中默认都是有个Project实例的
apply plugin:'java'

version = '0.1'

repositories{
    mavenCentral()
}

dependencies{
    compile 'commons-codec"commons-codec:1.6'
}
