var judul = "Bilangan Fibonacci = "
var x = 0
var y = 1
var hasil = 0

for (var i = 0; i <= 10; i++){
    x = x + y;
    y = x - y;
    hasil = hasil + y + ','
}

console.log(judul + hasil)