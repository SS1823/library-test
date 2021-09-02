def genSec(String a, String b, def boo) {
  echo "a='$a' b='$b'"
}

def call(Map args){
  echo "called by Map"
  args.s.each{ getSec.genSec(it.a, it.b, isUnix()) }
}
def call(List args){
  echo "called by list"
  args.each{ getSec.genSec(it.a, it.b, isUnix()) }
}
