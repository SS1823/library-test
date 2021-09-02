def genSec(def a, def b) {
  echo "$a $b"
}

def call(Map args){
  args.s.each{ genSec(it.a, it.b) }
}
def call(List args){
  args.each{ genSec(it.a, it.b) }
}
