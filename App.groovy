//Apenas um exemplo para ter uma ideia de como começar o App
nw = 'jonatas'.collect{ if(it.firstIsVowel){return it+"#"}else{return it}}.join().split('#').collect{it+'p'+it[-1]}
