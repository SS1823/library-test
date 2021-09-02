def generateSecrets(def a, def b) {
  echo "$a $b"
}

def call(Map args){
  args.s.each{ generateSecrets(it.a, it.b) }
}
def call(List args){
  args.each{ generateSecrets(it.a, it.b) }
}
