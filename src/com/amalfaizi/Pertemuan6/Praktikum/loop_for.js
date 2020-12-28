//for loop
for(var i = 0; i < 5; i++){
    console.log(i + '. Berfikir')
}
console.log('\n')

//for/in
var nama = [{fName : 'Amal' , lName : 'Nur', age : 19}, {fName : 'Nur', lName : 'Amal', age : 91}]

for(var x in nama){
    console.log('Asprak\t: ')
    console.log(nama[x].fName)
    console.log(nama[x].lName)
    console.log(nama[x].age)
    console.log('\n')
}

//for/of
var buah = ['apel', 'anggur', 'jeruk']
for(var x of buah){
    console.log('ini buah ' + x)
}