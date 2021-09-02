def genSec(String a, String b, boolean boo) {
  echo "a='$a' b='$b'"
  sh "env | grep MYENV"
}

def myClosure(String a, CLosure b) {
  withEnv(["MYENV=$a"]) {
    b()
  }
}

def call(Map args){
  echo "called by Map"
  myClosure('BY_MAP') {
    args.s.each{ genSec(it.a, it.b, isUnix()) }
  }
}
def call(List args){
  echo "called by list"
  myClosure('BY_LIST') {
    args.each{ genSec(it.a, it.b, isUnix()) }
  }
}
