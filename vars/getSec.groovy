def genSec(String a, String b) {
  echo "a='$a' b='$b'"
}

def call(Map args){
  echo "called by Map"
  args.s.each{ genSec(it.a, it.b) }
}
def call(List args){
  echo "called by list"
  args.each{ genSec(it.a, it.b) }
}
